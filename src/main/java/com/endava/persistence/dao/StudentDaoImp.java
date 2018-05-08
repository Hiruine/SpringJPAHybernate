package com.endava.persistence.dao;

import com.endava.persistence.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.UUID;

@Repository
public class StudentDaoImp implements StudentDao {


    private EntityManager entityManager;

    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Student findById(UUID id) {
        return null;
    }

    @Override
    public void add(Student entity) {
        entityManager.persist(entity);
    }
}
