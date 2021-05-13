package com.bootj8.bootj8.services;

import com.bootj8.bootj8.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> getAllUser();

    public void saveUser(UserDTO userDTO);

    public UserDTO getUserByID(Integer id);


}
