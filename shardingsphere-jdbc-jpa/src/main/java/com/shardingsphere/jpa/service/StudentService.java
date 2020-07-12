package com.shardingsphere.jpa.service;

import org.springframework.stereotype.Service;

import com.shardingsphere.common.CommonService;
import com.shardingsphere.jpa.dao.entity.Student;
import com.shardingsphere.jpa.dao.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements CommonService {

    private final StudentRepository studentRepository;

    @Override
    public void doAction() {
        studentRepository.deleteAll();
        for (int i = 1; i <= 16; i++) {
            Student student = Student.builder().id(i).age(10).name("test").build();
            studentRepository.save(student);
        }
    }

}
