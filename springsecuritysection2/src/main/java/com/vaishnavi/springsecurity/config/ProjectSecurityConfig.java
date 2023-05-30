package com.vaishnavi.springsecurity.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	@Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

       /* http.authorizeHttpRequests()
                        .requestMatchers("/myAccount","/mybalance","/myLoans","/myCards").authenticated()
                        .requestMatchers("/notices","/contact").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();
}*/
    
   /* http.authorizeHttpRequests().anyRequest().denyAll()
    .and().formLogin()
    .and().httpBasic();
return http.build();
}*/
		
		http.authorizeHttpRequests().anyRequest().authenticated()
	        .and().formLogin()
	        .and().httpBasic();
		return http.build();
	}
}
