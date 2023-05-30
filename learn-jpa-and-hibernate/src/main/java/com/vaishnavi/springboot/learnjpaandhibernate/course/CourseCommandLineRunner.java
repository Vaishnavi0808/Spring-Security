package com.vaishnavi.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vaishnavi.springboot.learnjpaandhibernate.course.Course;
import com.vaishnavi.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.vaishnavi.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.vaishnavi.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn AWS Jpa!","Vaishnavi"));
		repository.save(new Course(2,"Learn Azure Jpa!","Vaishnavi"));
		repository.save(new Course(3,"Learn DevOps Jpa!","Vaishnavi"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Vaishnavi"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn DevOps Jpa!"));
		
	}

	

}
