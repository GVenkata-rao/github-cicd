package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

	@GetMapping("/cicd")
	public String getText() {
		return "Welcome to CICDController";
	}
}
