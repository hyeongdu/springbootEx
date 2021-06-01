package com.study.springboot.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public AuthenticationFailureHandler authenticationFailureHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/css/**", "/js/**", "/img/**").permitAll()
				.antMatchers("/guest/**").permitAll()
				.antMatchers("/member/**").hasAnyRole("USER","ADMIN")
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated();
		
		http.formLogin()
			.loginPage("/loginForm")
			.loginProcessingUrl("/j_spring_security_check")
			//.failureUrl("/loginForm?error") 1단계
			.failureHandler(authenticationFailureHandler)
			.usernameParameter("j_username")
			.passwordParameter("j_password")
			.permitAll();
		
		http.logout()
			.logoutUrl("/logout")
			.logoutSuccessUrl("/")
			.permitAll();
		http.csrf().disable();
	}
	//빠른 테스트를 위한 inmemory방식 사용
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("user").password(passwordEncoder().encode("1234")).roles("USER").and()
			.withUser("admin").password(passwordEncoder().encode("1234")).roles("ADMIN");
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
}
