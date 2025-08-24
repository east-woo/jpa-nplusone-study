package com.eastwoo.study.jpanplusonestudy.repository;

import com.eastwoo.study.jpanplusonestudy.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}