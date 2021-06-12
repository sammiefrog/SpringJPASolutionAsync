package com.example.h2zoo.repository;

import com.example.h2zoo.model.Amphibian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmphibianRepository extends CrudRepository<Amphibian, Long> {
}
