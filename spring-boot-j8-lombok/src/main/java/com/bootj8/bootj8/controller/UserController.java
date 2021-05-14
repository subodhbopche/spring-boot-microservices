package com.bootj8.bootj8.controller;


import com.bootj8.bootj8.dto.UserDTO;
import com.bootj8.bootj8.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public List<UserDTO> getUserList(){
        return userService.getAllUser();
    }


    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
    }


    @GetMapping(value = "/{id}")
    public UserDTO getUser(@PathVariable Integer id){
        return userService.getUserByID(id);
    }


}
