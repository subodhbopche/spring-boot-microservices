package com.bootj8.bootj8.converter;

import com.bootj8.bootj8.dto.UserDTO;
import com.bootj8.bootj8.entity.User;

import java.util.stream.Collectors;

public class UserConverter {

    public static User dtoToEntity(UserDTO userDTO){
        return new User(userDTO.getUserID(), userDTO.getUserName(), userDTO.getSkillDTOList().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
    }

    public static UserDTO entityToDTO(User user){
        return new UserDTO(user.getUserID(), user.getUserName(), user.getSkillsList().stream().map(SkillConverter::entityToDTO).collect(Collectors.toList()));
    }

}
