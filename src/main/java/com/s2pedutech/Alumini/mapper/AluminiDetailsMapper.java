package com.s2pedutech.Alumini.mapper;

import com.s2pedutech.Alumini.entity.AluminiDetails;
import com.s2pedutech.Alumini.dto.AluminiDetailsDTO;

public class AluminiDetailsMapper {
    public static  AluminiDetails toAluminiDetails(AluminiDetailsDTO dto) {
        AluminiDetails a1 = new AluminiDetails();
        a1.setId(dto.getId());
        a1.setYearOfPassout(dto.getYearOfPassout());
        a1.setHighestQualification(dto.getHighestQualification());
        a1.setSpecialization(dto.getSpecialization());
        a1.setCollegeName(dto.getCollegeName());
        a1.setMarried(dto.isMarried());
        a1.setContactNumber(dto.getContactNumber());
        a1.setAddress(dto.getAddress());
        a1.setGender(dto.isGender());
        a1.setDescription(dto.getDescription());
        a1.setProfession(dto.getProfession());
        a1.setCity(dto.getCity());
        a1.setState(dto.getState());
        a1.setCountry(dto.getCountry());
        a1.setImageUrl(dto.getImageUrl());
        return a1;
    }

    public static AluminiDetailsDTO aluminiDetailsDTO(AluminiDetails model)
    {
        return new AluminiDetailsDTO(
                model.getId(),
                model.getYearOfPassout(),
                model.getHighestQualification(),
                model.getSpecialization(),
                model.getCollegeName(),
                model.isMarried(),
                model.getContactNumber(),
                model.getAddress(),
                model.isGender(),
                model.getDescription(),
                model.getProfession(),
                model.getCity(),
                model.getState(),
                model.getCountry(),
                model.getImageUrl()
        );
    }
}
