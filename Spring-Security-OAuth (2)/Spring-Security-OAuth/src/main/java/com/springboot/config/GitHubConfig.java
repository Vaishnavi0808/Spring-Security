package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//This is a Spring annotation that indicates that this class is a configuration class.
public class GitHubConfig {
	
	//This is a Spring annotation that indicates that the method that follows 
	//it will create a bean to be managed by the Spring container.
	@Bean
	SecurityFilterChain DefaultSecurityFilterChain (HttpSecurity http) throws Exception{
		//authorizeRequests-to specify how requests should be authorized.
		//anyRequest()..authenticated -This configures the HttpSecurity object to require that all requests be authenticated.
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.oauth2Login();
		return http.build();
		
	}
	
//	@Bean
//	public ClientRegistrationRepository clientRepository() {
//		ClientRegistration clientReg = clientRegistration();
//		return new InMemoryClientRegistrationRepository(clientReg);
//	}
//
//	private ClientRegistration clientRegistration() {
//		return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("94fec1448123956e40e6")
//				.clientSecret("437fce6931a6365b24e8c43c02a5795eeba3e48e").build();
//		
//	}
//	
	

}
