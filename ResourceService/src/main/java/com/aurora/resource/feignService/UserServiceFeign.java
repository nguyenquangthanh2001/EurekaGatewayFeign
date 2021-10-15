package com.aurora.resource.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="user-service")
public interface UserServiceFeign {
	
//	@PostMapping("/api/saveUpdate")
//	UserDetailDTO saveUpdate(@RequestBody UserDetailDTO inputUser);
//	
	@PostMapping("/api/findByName")
	String findByName();
	@PostMapping("/api/findById")
	String findById();
}
