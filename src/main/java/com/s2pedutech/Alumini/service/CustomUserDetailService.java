package com.s2pedutech.Alumini.service;

import com.s2pedutech.Alumini.entity.CustomUserDetails;
import com.s2pedutech.Alumini.entity.User;
import com.s2pedutech.Alumini.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user  = iUserRepository.findByEmailId(username).orElseThrow(()->new UsernameNotFoundException("user not found"));
        return new CustomUserDetails(user);
    }
}
