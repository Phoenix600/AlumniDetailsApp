package com.s2pedutech.Alumini.mapper;

import com.s2pedutech.Alumini.entity.User;
import com.s2pedutech.Alumini.dto.UserDto;

import static com.s2pedutech.Alumini.config.SecurityConfig.passwordEncoder;

public class UserMapper {

    public static UserDto toUserDto(User user){
      UserDto userDto = new UserDto();
      userDto.setFirstName(user.getFirstName());
      userDto.setLastName(user.getLastName());
      userDto.setEmailId(user.getEmailId());
      userDto.setPassword(passwordEncoder().encode(user.getPassword()));
      return userDto;
    }

    public static User toUserModel(UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmailId(userDto.getEmailId());
        user.setPassword(passwordEncoder().encode(userDto.getPassword()));
        return user;
    }

}
