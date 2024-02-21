package com.example.learnjpaandhibernate.course;

import com.example.learnjpaandhibernate.course.Course;
import com.example.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.example.learnjpaandhibernate.springDataJpa.CourseSpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    /*@Autowired
    private CourseJdbcRepository repository;*/

    /*@Autowired
    private CourseJpaRepository repository;*/

    @Autowired
    private CourseSpringDataJpa repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Aws Jpa","in28minutes"));
        repository.save(new Course(2,"Learn Azure Jpa","in28minutes"));
        repository.save(new Course(3,"Learn DevOps Jpa","in28minutes"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        repository.findByAuthor("in28minutes");
        repository.findByName("Learn DevOps Jpa");
    }
}
