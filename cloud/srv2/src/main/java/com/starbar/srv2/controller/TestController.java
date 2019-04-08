package com.starbar.srv2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "It is from srv2 (test)!";
	}
}
