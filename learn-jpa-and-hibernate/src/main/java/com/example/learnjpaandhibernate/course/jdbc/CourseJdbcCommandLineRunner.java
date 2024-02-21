package com.example.learnjpaandhibernate.course.jdbc;

import com.example.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn Aws Now","in28minutes"));
        repository.insert(new Course(2,"Learn Azure Now","in28minutes"));
        repository.insert(new Course(3,"Learn DevOps Now","in28minutes"));

        repository.delete(1);

        System.out.println(repository.searchById(2));
        System.out.println(repository.searchById(3));
    }
}
