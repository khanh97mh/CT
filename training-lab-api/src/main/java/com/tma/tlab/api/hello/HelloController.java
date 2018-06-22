    package com.tma.tlab.api.hello;

    import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.tlab.api.jpa.SkillJpaRepository;
import com.tma.tlab.api.jpa.SubjectJpaRepository;
import com.tma.tlab.api.model.Skill;
import com.tma.tlab.api.model.Subject;

    @RestController
    @RequestMapping("/api")
    public class HelloController {

        @Autowired
        private SubjectJpaRepository jpaRepository;
        private SkillJpaRepository skillJpaRepository;

        @Autowired
        private EntityManager entityManager;

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
            System.out.println("START custom jpa");
            Iterable<Subject> subject1s = jpaRepository.findAllWithDescription("%UPDATE%");
            Iterator<Subject> subs = subject1s.iterator();
            while(subs.hasNext()) {
                Subject s = subs.next();
                System.out.println("ID = " + s.getSubjectId());
                System.out.println("Description = " + s.getDescription());
            }
            System.out.println("END custom jpa");
            return "Hello!";
        }
        
        @RequestMapping("/a")
        public String a() {
        	String str = "\nSTART custom jpa";
        	Iterable<Skill> area1 = skillJpaRepository.findAllWithDescription("SELECT * FROM skill");
        	Iterator<Skill> area = area1.iterator();
        	while(area.hasNext()) {
        		Skill a = area.next();
        		str += "\nID = " + a.getSkillId();
        		str += "\nDescription = " + a.getDescription();
        	}
        	return "Hello!";
        }
    }
