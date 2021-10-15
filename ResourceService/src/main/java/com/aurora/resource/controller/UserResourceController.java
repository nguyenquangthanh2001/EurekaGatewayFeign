package com.aurora.resource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurora.resource.feignService.UserServiceFeign;

@RestController
@RequestMapping("/api")
public class UserResourceController {
	
	@Autowired
	private UserServiceFeign serviceFeign;
	
//	@PostMapping(value="/saveUpdate")
//	public UserDetailDTO saveUpdate(@RequestBody UserDetailDTO input){
//		return serviceFeign.saveUpdate(input);
//	}
//	@GetMapping(value="findByName/{name}")
//	public List<UserDetailDTO> findByName(@PathVariable String name){
//		return serviceFeign.findByName(name);
//	}
	@PostMapping("/findName")
	public String findByName(){
		return serviceFeign.findByName();
    }
	@PostMapping("/findId")
	public String findbyId(){
		return serviceFeign.findById();
	}
	@PostMapping("/findByTen")
	public ResponseEntity<String> findByTen(){
		return ResponseEntity.ok("tao la ten cua resource");
    }
}
