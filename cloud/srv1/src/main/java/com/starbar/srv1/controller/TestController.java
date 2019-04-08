package com.starbar.srv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starbar.srv1.feign.IService2FeignClient;

@RestController
@RequestMapping("/v1")
public class TestController {
	@Autowired
	private IService2FeignClient feign;
	
	@GetMapping("/test")
	public String test() {
		return "It is from srv1 (test)";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return feign.test() + "\\n srv1 call srv2!";
	}
}
