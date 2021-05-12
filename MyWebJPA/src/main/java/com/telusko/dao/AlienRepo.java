package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.model.Alien;

@Repository
public interface AlienRepo extends CrudRepository<Alien, Integer>{

}
