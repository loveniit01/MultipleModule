package com.example.demo.a1.contoller.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.a1.entity.Fathers;

@Repository
public class RepositoryClass {
	@Autowired
	EntityManager entityManager;

	public Fathers findByFatherId(Long fid) {
		return entityManager.find(Fathers.class, fid);
	}
}
