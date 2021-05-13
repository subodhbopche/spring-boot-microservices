package com.bootj8.bootj8.services;

import com.bootj8.bootj8.converter.UserConverter;
import com.bootj8.bootj8.dto.UserDTO;
import com.bootj8.bootj8.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUser() {
        return userRepository.findAll().stream().map(UserConverter::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        userRepository.save(UserConverter.dtoToEntity(userDTO));
    }

    @Override
    public UserDTO getUserByID(Integer id) {
        return UserConverter.entityToDTO(userRepository.getOne(id));
    }
}
