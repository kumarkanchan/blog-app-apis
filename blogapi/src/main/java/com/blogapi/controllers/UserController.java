package com.blogapi.controllers;

import com.blogapi.payloads.ApiResponse;
import com.blogapi.payloads.UserDto;
import com.blogapi.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    //POST - Create User
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }

    //PUT - Update User
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable("userId") Integer uid) {
        UserDto updateUserDto = this.userService.updateUser(userDto, uid);
        return ResponseEntity.ok(updateUserDto);
        //return ResponseEntity.ok(updateUserDto);
    }

    //DELETE - Delete User
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid) {
        this.userService.deleteUser(uid);
        return new ResponseEntity(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
    }

    //GET - User get
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
        return ResponseEntity.ok(this.userService.getAllUsers(userId));
    }


}
