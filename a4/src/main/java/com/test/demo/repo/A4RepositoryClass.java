package com.test.demo.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.Mother;




@Repository
public class A4RepositoryClass {
	@Autowired
	EntityManager entityManager;

	public Mother findByMotherId(Long mid) {
		return entityManager.find(Mother.class, mid);
	}
}
