package com.s2pedutech.Alumini.controller;


import com.s2pedutech.Alumini.constants.AlumniDetailsConstants;
import com.s2pedutech.Alumini.dto.AluminiDetailsDTO;
import com.s2pedutech.Alumini.repository.IAluminiDetailsRepository;
import com.s2pedutech.Alumini.service.IAluminiDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = AlumniDetailsConstants.BASE_ENDPOINT)
public class AluminiDetailsController {

    @Autowired
    IAluminiDetailsService iAluminiDetailsService;

    @Autowired
    IAluminiDetailsRepository iAluminiDetailsRepo;


    // http://localhost:8080/api/v1/alumini/add
    @PostMapping(AlumniDetailsConstants.ADD_ALUMNI)
    public AluminiDetailsDTO aluminiDetailsDTO(@RequestBody AluminiDetailsDTO aluminiDetailsDTO){
        System.out.println(aluminiDetailsDTO);
        return iAluminiDetailsService.addAluminiDetails(aluminiDetailsDTO);
    }

    //http://localhost:8080/api/v1/alumini/{id}
    @DeleteMapping("/api/v1/alumini/delete/{id}")
    public ResponseEntity<String> deleteAluminiDetails(@PathVariable Long id){
        iAluminiDetailsService.deleteAluminiDetails(id);
        return ResponseEntity.ok("Alumini Details Deleted Successfully.");
    }

    //http://localhost:8080/api/v1/alumini/all
    @GetMapping("/api/v1/alumini/all")
    public ResponseEntity<List<AluminiDetailsDTO>> getAllAluminiDetails(){
        return ResponseEntity.ok(iAluminiDetailsService.getAllAluminiDetails());
    }

    //http://localhost:8080/api/v1/alumini/{id}
    @PutMapping("/api/v1/alumini/{id}")
    public ResponseEntity<AluminiDetailsDTO> updateAluminiDetails(
            @PathVariable Long id,
            @RequestBody AluminiDetailsDTO dto
    ) {
        AluminiDetailsDTO updatedAlumni = iAluminiDetailsService.updateAluminiDetails(id, dto);
        return ResponseEntity.ok(updatedAlumni);
    }
}
