package com.example.springSecurity.springSecurityAuth.services;

import com.example.springSecurity.springSecurityAuth.entities.UserEntity;
import com.example.springSecurity.springSecurityAuth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("User not found")
        );

        //this line is important to convert back to BCrypt
        userEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));

//        return new User(userEntity.getUsername(), userEntity.getPassword(), new ArrayList<>());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_NORMAL")); // Assuming role is stored in a field named "role"

        return new User(userEntity.getUsername(), userEntity.getPassword(), authorities);

    }
}
