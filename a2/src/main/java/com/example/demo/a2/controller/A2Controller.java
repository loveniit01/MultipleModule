package com.example.demo.a2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class A2Controller {

	@GetMapping("/a2")
	public String get()
	{
		return "hello from a2";
	}
}
