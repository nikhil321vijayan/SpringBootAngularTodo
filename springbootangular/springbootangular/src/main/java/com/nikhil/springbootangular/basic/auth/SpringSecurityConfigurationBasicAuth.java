package com.nikhil.springbootangular.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf().disable() //disable CSRF token in order to enable JWT token authentication
		.authorizeRequests()
		/* When Spring Security is activated, every request is preceded by a
		 * pre-flight request of type OPTIONS.
		 * the below statement permits all request of type Options  
		 */
		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
				.anyRequest().authenticated()
				.and()
			//remove any kind of form authentication
			//.formLogin().and()
			.httpBasic();
	}
}
