package com.akashit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	// only admin role user can access
	@GetMapping(value = "/admin")
	public String admin() {
		return "<h3>Welcome Admin :)</h3>";
	}
	// only user role user can access
	@GetMapping(value = "/user")
	public String user() {
		return "<h3>Hello User :)</h3>";
	}
	//anybody an access
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "<h3>Welcome :)</h3>";
	}


}
