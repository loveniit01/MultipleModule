package com.example.demo.a1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.a1.contoller.repo.RepositoryClass;
import com.example.demo.a1.entity.Fathers;

@RestController
@RequestMapping("/one")
public class A1Controller {
	@Autowired
	RepositoryClass repository;

	@GetMapping("/a1")
	public ResponseEntity<?> get() {
//		return "hello from a1";
		Fathers fathers = repository.findByFatherId(5L);
		return ResponseEntity.ok(fathers);
	}
}
