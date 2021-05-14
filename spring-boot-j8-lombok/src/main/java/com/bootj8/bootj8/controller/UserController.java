package com.bootj8.bootj8.controller;


import com.bootj8.bootj8.dto.UserDTO;
import com.bootj8.bootj8.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
@Api(value = "UserController", description = "User and skills entity")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "return all persist user list", response = Iterable.class, tags = "/getUserList")
    @GetMapping
    public List<UserDTO> getUserList(){
        return userService.getAllUser();
    }


    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success/OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found !!!")
    })
    @GetMapping(value = "/{id}")
    public UserDTO getUser(@PathVariable Integer id){
        return userService.getUserByID(id);
    }


}
