package com.stream.app.spring_streaming_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import static org.springframework.security.config.Customizer.withDefaults;

@SpringBootApplication
public class SpringStreamingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStreamingBackendApplication.class, args);
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests(authorize -> authorize
						.anyRequest().permitAll()  // Allow all requests without authentication
				)
				.csrf(csrf -> csrf.disable())  // Disable CSRF protection
				.httpBasic(httpBasic -> httpBasic.disable())  // Disable HTTP Basic authentication
				.formLogin(formLogin -> formLogin.disable()); // Disable form-based login

		return http.build();
	}

}
