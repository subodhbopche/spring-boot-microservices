package com.bootj8.bootj8.repository;

import com.bootj8.bootj8.entity.Skills;
import com.bootj8.bootj8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skills, Integer> {
}
