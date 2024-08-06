package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
public class AppConfig {
	
	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user=User.builder().username("harsh").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
//		UserDetails user1=User.builder().username("harshit").password(passwordEncoder().encode("abcdef")).roles("ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user,user1);
//		
//	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	
}
