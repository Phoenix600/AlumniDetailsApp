package com.s2pedutech.Alumini.repository;

import com.s2pedutech.Alumini.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CityRepository extends JpaRepository<City, Long> {

        List<City> findByState_id(Long state_id);
    }


