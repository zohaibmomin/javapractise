package com.example.springSecurity.springSecurityAuth.configs;

import com.example.springSecurity.springSecurityAuth.services.CustomUserDetailsService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableMethodSecurity
@EnableWebSecurity
public class HomeConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;

    }

    @Bean
    public UserDetailsService userDetailsService() {
        /*UserDetails normalUser = User.withUsername("normal")
                .password(passwordEncoder().encode("abc@123"))
                .roles("NORMAL")
                .build();

        UserDetails adminUser = User.withUsername("admin")
                .password(passwordEncoder().encode("abc@123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(normalUser, adminUser);*/

        return new CustomUserDetailsService();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth ->
                        auth
                                .requestMatchers("/home/admin").hasRole("ADMIN")
                                .requestMatchers("/home/normal").hasRole("NORMAL")
                                .requestMatchers("/home/public")
                                .permitAll()
                                .anyRequest()
                                .authenticated())
                .formLogin(Customizer.withDefaults());
        return httpSecurity.build();
    }
}