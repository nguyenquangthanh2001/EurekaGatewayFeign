package com.aurora.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	@PostMapping("/findByName")
	public ResponseEntity<String> findByName(){
        return ResponseEntity.ok("I'm User Name");
    }
	@PostMapping("/findById")
	public ResponseEntity<String> findById(){
		return ResponseEntity.ok("I'm Id User");
    }
}
