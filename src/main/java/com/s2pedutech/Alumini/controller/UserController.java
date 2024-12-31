package com.s2pedutech.Alumini.controller;

import com.s2pedutech.Alumini.payload.JwtResponse;
import com.s2pedutech.Alumini.service.IUserService;
import com.s2pedutech.Alumini.JwtConfig.JwtHelper;
import com.s2pedutech.Alumini.dto.LoginDto;
import com.s2pedutech.Alumini.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtHelper jwtHelper;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    // http://localhost:8080/api/v1/auth/registration
    @PostMapping("/registration")
    public ResponseEntity<?> userRegistration(@RequestBody List<UserDto> userDtoList){
         iUserService.userRegistration(userDtoList);
         return ResponseEntity.ok("Message : User registered successfully \n Status : 200");
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> userLoginIn(@RequestBody LoginDto loginDtos){
        this.doAuthenticate(loginDtos.getEmailId(), loginDtos.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(loginDtos.getEmailId());
        System.out.println(userDetails);
        String token = this.jwtHelper.generateToken(userDetails);
        JwtResponse response = JwtResponse.builder()
                .token(token)
                .emailId(userDetails.getUsername()).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private void doAuthenticate(String emailId, String password){
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(emailId, password);
        try{
            authenticationManager.authenticate(authenticationToken);
        }
        catch (BadCredentialsException e){
            throw new RuntimeException("Invalid Username or Password");
        }
    }

}
