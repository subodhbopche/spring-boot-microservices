package com.bootj8.bootj8.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class UserDTO {

    private Integer userID;
    private String userName;
    private List<SkillDTO> skillDTOList;
}
