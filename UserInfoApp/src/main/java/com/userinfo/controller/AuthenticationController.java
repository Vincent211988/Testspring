package com.userinfo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthenticationController {
	
	
	@GetMapping("/test")
	public ResponseEntity<List<PersonalInfo> >responseValue(@RequestParam String name)
	{
		System.out.println("Inside responseVlue");
		List<PersonalInfo> infoList=new ArrayList<PersonalInfo>();
		
		PersonalInfo info= new PersonalInfo();
		info.setLastName("test");
		info.setName("starting");
		
		infoList.add(info);
		infoList.add(info);
		return new ResponseEntity<List<PersonalInfo> > (infoList, HttpStatus.OK);
	}
}
