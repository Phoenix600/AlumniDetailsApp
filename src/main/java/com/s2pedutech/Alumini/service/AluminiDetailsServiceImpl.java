package com.s2pedutech.Alumini.service;


import com.s2pedutech.Alumini.dto.AluminiDetailsDTO;
import com.s2pedutech.Alumini.entity.AluminiDetails;
import com.s2pedutech.Alumini.mapper.AluminiDetailsMapper;
import com.s2pedutech.Alumini.repository.IAluminiDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AluminiDetailsServiceImpl implements IAluminiDetailsService {

    @Autowired
    IAluminiDetailsRepository iAluminiDetailsRepo;


    @Override
    public AluminiDetailsDTO addAluminiDetails(AluminiDetailsDTO a) {
        AluminiDetails a1 = AluminiDetailsMapper.toAluminiDetails(a);
        System.out.println(a1);
        AluminiDetails a2 = iAluminiDetailsRepo.save(a1);
        System.out.println(a2);
        return AluminiDetailsMapper.aluminiDetailsDTO(a2);
    }

    public List<AluminiDetailsDTO> getAllAluminiDetails() {
        List<AluminiDetails> alumniList = iAluminiDetailsRepo.findAll();
        return alumniList.stream()
                .map(AluminiDetailsMapper::aluminiDetailsDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAluminiDetails(Long id) {
        iAluminiDetailsRepo.deleteById(id);
    }

    // Update Alumni Details
    public AluminiDetailsDTO updateAluminiDetails(Long id, AluminiDetailsDTO dto) {
        AluminiDetails existingAlumini = iAluminiDetailsRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumini with ID " + id + " not found"));

        // Update existing alumni details with new data from DTO
        existingAlumini.setYearOfPassout(dto.getYearOfPassout());
        existingAlumini.setHighestQualification(dto.getHighestQualification());
        existingAlumini.setSpecialization(dto.getSpecialization());
        existingAlumini.setCollegeName(dto.getCollegeName());
        existingAlumini.setMarried(dto.isMarried());
        existingAlumini.setContactNumber(dto.getContactNumber());
        existingAlumini.setAddress(dto.getAddress());
        existingAlumini.setGender(dto.isGender());
        existingAlumini.setDescription(dto.getDescription());
        existingAlumini.setProfession(dto.getProfession());
        existingAlumini.setCity(dto.getCity());
        existingAlumini.setState(dto.getState());
        existingAlumini.setCountry(dto.getCountry());

        // Save updated alumni details
        AluminiDetails updatedAlumini = iAluminiDetailsRepo.save(existingAlumini);
        return AluminiDetailsMapper.aluminiDetailsDTO(updatedAlumini);
    }


}


