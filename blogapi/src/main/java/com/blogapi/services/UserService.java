package com.blogapi.services;

import com.blogapi.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto, Integer userId);
    UserDto createUser(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
