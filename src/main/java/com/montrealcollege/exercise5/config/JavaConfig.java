package com.montrealcollege.exercise5.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.montrealcollege.exercise5.entities.Program;
import com.montrealcollege.exercise5.entities.Student;

@Configuration
public class JavaConfig {
	@Bean(name = "program", initMethod = "firstHere")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Program program() {
		Program prog = new Program();
		prog.setName("Java");
		prog.setDuration(12);
		return prog;
	}

	@Bean(name = "student1")
	public Student student1() {
		Student std = new Student();
		std.setFirstName("Nishanth");
		std.setLastName("K");
		std.setProgram(program());
		return std;
	}

	@Bean(name = "student2")
	public Student student2() {
		Student std = new Student();
		std.setFirstName("Akhil");
		std.setLastName("K");
		std.setProgram(program());
		return std;
	}

	@Bean(name = "student3")
	@Lazy
	public Student student3() {
		Student std = new Student();
		std.setFirstName("Bunty");
		std.setLastName("S");
		std.setProgram(program());
		return std;
	}

	@Bean(name = "student4")
	public Student student4() {
		Student std = new Student();
		std.setFirstName("Vinay");
		std.setLastName("R");
		std.setProgram(program());
		return std;
	}
}
