package com.endava.persistence.service;

import com.endava.persistence.model.Student;
import com.endava.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class},
        loader = AnnotationConfigContextLoader.class)
public class StudentServiceBasicPersistenceIntegration {

    @Autowired
    private StudentService studentService;

    @Test
    public final void createEntity() {

        studentService.add(
                new Student(UUID.randomUUID(),
                    "asimov", 98)
        );
    }
}
