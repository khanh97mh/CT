# Develop Training Lab API Project - Part 5 - Custom Query

* Create query package under com.tma.tlab.api package
* Create QuerySubject class

```java
        package com.tma.tlab.api.query;

        import javax.persistence.*;

        @NamedQueries({
                @NamedQuery(name="Subject.findAllWithDescription",
                        query=QuerySubject.FIND_SUBJECT_WITH_DESCRIPTION),
        })

        @Entity
        @Table(name = "subject")
        public class QuerySubject {
            public static final String FIND_SUBJECT_WITH_DESCRIPTION = " SELECT sub FROM Subject as sub WHERE sub.description like :description ";

            @Id
            private Integer id;

        }
```

* Create a new interface - SubjectJpaRepositoryCustom on com.tma.tlab.api.jpa package

```java
        package com.tma.tlab.api.jpa;

        import com.tma.tlab.api.model.Subject;

        public interface SubjectJpaRepositoryCustom {
            Iterable<Subject> findAllWithDescription(String description);
        }
```

* Modify SubjectJpaRepository to extend SubjectJpaRepositoryCustom interface

```java
        package com.tma.tlab.api.jpa;

        import com.tma.tlab.api.model.Subject;

        public interface SubjectJpaRepository extends CommonJpaRepository<Subject, Long>, SubjectJpaRepositoryCustom {
        }
```

* Create SubjectJpaRepositoryImpl class to implement SubjectJpaRepositoryCustom interface

```java
        package com.tma.tlab.api.jpa;

        import com.tma.tlab.api.model.Subject;
        import org.springframework.beans.factory.annotation.Autowired;

        import javax.persistence.EntityManager;
        import javax.persistence.TypedQuery;
        import java.util.List;

        public class SubjectJpaRepositoryImpl implements SubjectJpaRepositoryCustom {

            @Autowired
            EntityManager entityManager;

            @Override
            public Iterable<Subject> findAllWithDescription(String description) {
                TypedQuery<Object[]> query = entityManager.createNamedQuery("Subject.findAllWithDescription", Object[].class);
                query.setParameter("description", description);
                List results = query.getResultList();
                return results;
            }

        }
```

* Modify hello method in HelloController to test this custom query
```java
        package com.tma.tlab.api.hello;

        import com.tma.tlab.api.jpa.SubjectJpaRepository;
        import com.tma.tlab.api.model.Subject;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import javax.persistence.EntityManager;
        import java.util.Iterator;
        import java.util.List;

        @RestController
        @RequestMapping("/api")
        public class HelloController {

            @Autowired
            private SubjectJpaRepository jpaRepository;

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
        }
```
