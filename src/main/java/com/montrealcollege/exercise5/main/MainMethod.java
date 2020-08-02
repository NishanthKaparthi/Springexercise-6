package com.montrealcollege.exercise5.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.montrealcollege.exercise5.config.JavaConfig;
import com.montrealcollege.exercise5.entities.Program;
import com.montrealcollege.exercise5.entities.Student;

public class MainMethod {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Program pr = context.getBean("program", Program.class);
		Student st1 = context.getBean("student1", Student.class);
		Student st2 = context.getBean("student2", Student.class);
		Student st3 = context.getBean("student3", Student.class);
		Student st4 = context.getBean("student4", Student.class);
		System.out.println(pr);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
	}
}
