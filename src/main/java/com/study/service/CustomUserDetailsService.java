package com.study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("son")) {
            String encoded = encoder.encode("son7");
            return new User("son", encoded, List.of(new SimpleGrantedAuthority("user")));
        } else if (username.equals("lee")) {
            String encoded = encoder.encode("lee9");
            return new User("lee", encoded, List.of(new SimpleGrantedAuthority("admin"),
                    new SimpleGrantedAuthority("user")));
        } else {
            throw new UsernameNotFoundException(username + " not found");
        }
    }
}

