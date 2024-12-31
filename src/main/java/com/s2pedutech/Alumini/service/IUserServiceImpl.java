package com.s2pedutech.Alumini.service;

import com.s2pedutech.Alumini.entity.User;
import com.s2pedutech.Alumini.repository.IUserRepository;
import com.s2pedutech.Alumini.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.s2pedutech.Alumini.mapper.UserMapper.toUserModel;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    IUserRepository iUserRepository;

    @Override
    public void userRegistration(List<UserDto> userDtoList) {
        List<User> userList = toUserModelList(userDtoList);
        List<User> userList1 = iUserRepository.saveAll(userList);
    }
    public static List<User> toUserModelList(List<UserDto> userDtoList){
     List<User> userList = new ArrayList<>();
     for(UserDto userDto : userDtoList){
         userList.add(toUserModel(userDto));
      }
        return userList;
    }
}
