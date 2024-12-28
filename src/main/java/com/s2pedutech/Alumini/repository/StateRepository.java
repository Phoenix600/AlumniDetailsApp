package com.s2pedutech.Alumini.repository;

import com.s2pedutech.Alumini.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StateRepository extends JpaRepository<State, Long> {

    List<State> findByCountry_id(Long country_id);
    }


