package com.shardingsphere.jpa.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shardingsphere.jpa.dao.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
