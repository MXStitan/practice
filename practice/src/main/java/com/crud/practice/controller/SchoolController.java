package com.crud.practice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.practice.entities.School;
import com.crud.practice.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	
	SchoolService schoolService;
	
	@GetMapping("/home")
	private List<School> getAllInfo(){
		return schoolService.findAll();
	}
	
	@GetMapping("/home/{RollNo}")
	private School getInfo(@PathVariable ("RollNo") int RollNo) {
		return schoolService.getInfoById(RollNo);
//	    Optional<School> rollNo = schoolService.findById(rollNo);
//	    if(RollNo.isPresent()) {
//	        return ResponseEntity.ok().body(RollNo.get());
//	    } else {
//	        return ResponseEntity.notFound().build();
//	    }
//	}
	}
	
	@PostMapping("/home/addinfo")
	private School updateinfo(@Valid @RequestBody School school) {
		return schoolService.save(school);
	}
	
	@DeleteMapping("/home/{RollNo}")
	private void deleteInfo(@PathVariable("RollNo") int RollNo) {
		 schoolService.delete(RollNo);	 
	}
	
	@PutMapping("/addinfo")
	private School changeInfo(@RequestBody School school) {
		return schoolService.saveOrUpdate(school);
	}
}
