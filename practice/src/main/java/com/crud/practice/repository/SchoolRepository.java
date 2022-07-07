package com.crud.practice.repository;

import org.springframework.data.repository.CrudRepository;


import com.crud.practice.entities.School;

public interface SchoolRepository extends CrudRepository<School, Integer> {

}
