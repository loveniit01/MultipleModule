package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Father;
import com.test.demo.entity.Mother;
import com.test.demo.repo.A4RepositoryClass;


@RestController
@RequestMapping("/four")
public class A4Controller {

	
	@Autowired
	A4RepositoryClass repository;

	@GetMapping("/a4")
	public ResponseEntity<?> get() {
//		return "hello from a1";
		Mother mm = repository.findByMotherId(2L);
		return ResponseEntity.ok(mm);
	}
}
