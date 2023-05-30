package com.springboot.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OauthController {
	
	@GetMapping("/")
	public String Authorization(OAuth2AuthenticationToken token) {
		
		//The principal is typically a UserDetails object that contains information 
		//about the authenticated user.
		System.out.println(token.getPrincipal());
		return "secure.html";

}
	
}
