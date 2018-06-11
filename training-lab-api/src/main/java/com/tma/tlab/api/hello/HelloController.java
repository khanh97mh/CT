package com.tma.tlab.api.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.tlab.api.jpa.SubjectJpaRepository;
import com.tma.tlab.api.model.Subject;

@RestController
@RequestMapping("/api")
public class HelloController {
	@Autowired
	private SubjectJpaRepository jpaRepository;

	@RequestMapping("/")
	public String index() {

		System.out.println("START testing jpa");
		List<Subject> subjectList = jpaRepository.findAll();
		for (Subject subject : subjectList) {
			System.out.println("ID = " + subject.getSubjectId());
			System.out.println("Description = " + subject.getDescription());
		}
		System.out.println("END testing jpa");

		return "Greetings from Spring Boot!";
	}


	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}
