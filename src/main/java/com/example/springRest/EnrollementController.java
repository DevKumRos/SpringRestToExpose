package com.example.springRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollementController {
	
	@RequestMapping(value="/enrollment/save", method=RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody User user){
		System.out.println(user);
		return new ResponseEntity<String>("Received Data Successfully", HttpStatus.OK);
	}

}
