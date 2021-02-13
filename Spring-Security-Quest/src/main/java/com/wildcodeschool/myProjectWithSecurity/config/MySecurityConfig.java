package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
		        .withUser("Steve Guy").password(encoder.encode("12345")).roles("USER").and()
				.withUser("Tony Stark").password(encoder.encode("13579")).roles("HERO").and()
				.withUser("Nick Fury").password(encoder.encode("02468")).roles("DIRECTOR");
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {	
		 http
         .authorizeRequests()
         .antMatchers("/secret-bases/**").hasRole("DIRECTOR")
         .antMatchers("/avengers/assemble/**").hasRole("HERO")
         .anyRequest().authenticated()
         .and()
         .formLogin()
         .and()
         .httpBasic();		
	}

}