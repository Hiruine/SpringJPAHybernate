package com.endava;

import com.endava.config.AppConfig;
import com.endava.persistence.model.Student;
import com.endava.persistence.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService =
                context.getBean(StudentService.class);


        studentService.add(
                new Student(UUID.randomUUID(),
                        "hello", 42));


    }
}
