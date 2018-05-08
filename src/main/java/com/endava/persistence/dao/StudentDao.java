package com.endava.persistence.dao;

import com.endava.persistence.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

        Student findById(UUID id);

        void add(Student entity);

}
