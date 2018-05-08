package com.endava.persistence.service;

import com.endava.persistence.dao.StudentDao;
import com.endava.persistence.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class StudentService {


    private StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Transactional
    public void add(final Student entity) {
        studentDao.add(entity);
    }

    public Student findById(UUID id) {
        return studentDao.findById(id);
    }

}
