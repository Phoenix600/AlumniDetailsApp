package com.s2pedutech.Alumini.repository;


import com.s2pedutech.Alumini.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CountriesRepository extends JpaRepository<Country, Long> {
}
