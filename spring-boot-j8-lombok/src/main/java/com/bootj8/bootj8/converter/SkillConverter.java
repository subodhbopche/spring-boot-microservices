package com.bootj8.bootj8.converter;

import com.bootj8.bootj8.dto.SkillDTO;
import com.bootj8.bootj8.dto.UserDTO;
import com.bootj8.bootj8.entity.Skills;
import com.bootj8.bootj8.entity.User;

public class SkillConverter {

    public static SkillDTO entityToDTO(Skills skills){
        return new SkillDTO(skills.getSkillID(), skills.getSkill());
    }

    public static  Skills dtoToEntity(SkillDTO skillDTO){
        return new Skills(skillDTO.getSkillID(), skillDTO.getSkill(), null);

    }
}
