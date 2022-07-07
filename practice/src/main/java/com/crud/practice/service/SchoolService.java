package com.crud.practice.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.practice.entities.School;
import com.crud.practice.repository.SchoolRepository;

@Service
public class SchoolService {
	
	@Autowired
	
	SchoolRepository schoolRepository;

	public List<School> findAll() {
		// TODO Auto-generated method stub
		return (List<School>) schoolRepository.findAll();
	}

	public School save(@Valid School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}


	public void delete(int info) {
		// TODO Auto-generated method stub
		schoolRepository.deleteById(info);
	}

	public School saveOrUpdate(School school) {
		// TODO Auto-generated method stub
		return schoolRepository.save(school);
	}

	public School getInfoById(int RollNo) {
		// TODO Auto-generated method stub
		return schoolRepository.findById(RollNo).get();
	}

	public School findById(int rollNo) {
		// TODO Auto-generated method stub
		return schoolRepository.findById(rollNo).get();
	}

}
