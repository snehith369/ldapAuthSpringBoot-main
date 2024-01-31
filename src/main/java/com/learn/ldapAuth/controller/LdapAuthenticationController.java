package com.learn.ldapAuth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LdapAuthenticationController {
	@GetMapping("/")
	public String index() {
		return "upload-form"; // Return the HTML template name (without the .html extension)
	}
}
