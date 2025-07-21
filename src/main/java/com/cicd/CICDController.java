package com.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

	@GetMapping
	public String getText() {
		return "Welcome to CICDController.";
	}
	
	/**
	 * echo "# github-cicd" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/GVenkata-rao/github-cicd.git
git push -u origin main
	 */
}
