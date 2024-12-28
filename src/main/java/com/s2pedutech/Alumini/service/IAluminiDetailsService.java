package com.s2pedutech.Alumini.service;

import com.s2pedutech.Alumini.dto.AluminiDetailsDTO;

import java.util.List;

public interface IAluminiDetailsService {

    AluminiDetailsDTO addAluminiDetails(AluminiDetailsDTO a) ;

    List<AluminiDetailsDTO> getAllAluminiDetails();

    void deleteAluminiDetails(Long id);

    AluminiDetailsDTO updateAluminiDetails(Long id, AluminiDetailsDTO dto);
}
