# Develop Training Lab API Project - Part 3 - Katharsis JSON API

Please go through below urls before doing this part

    http://jsonapi.org/

    https://katharsis-jsonapi.readthedocs.io/en/latest/

## 1.  Add katharsis dependencies

* Add katharsis.version property in to properties, and properties as below

```java
        <properties>
          <java.version>1.8</java.version>
          <katharsis.version>3.0.2</katharsis.version>
        </properties>
```

...

```java
        <dependency>
          <groupId>io.katharsis</groupId>
          <artifactId>katharsis-core</artifactId>
          <version>${katharsis.version}</version>
        </dependency>

        <dependency>
          <groupId>io.katharsis</groupId>
          <artifactId>katharsis-spring</artifactId>
          <version>${katharsis.version}</version>
        </dependency>
```

## 2.  Modify Subject class to describe 'subjects' resource

    Add @JsonApiResource(type = "subjects")

    Add @JsonApiId

```java
        package com.tma.tlab.api.model;

        import io.katharsis.resource.annotations.JsonApiId;
        import io.katharsis.resource.annotations.JsonApiResource;

        import javax.persistence.*;
        import java.io.Serializable;

        @JsonApiResource(type = "subjects")
        @Entity
        @Table(name="subject")
        public class Subject implements Serializable {
            private static final long serialVersionUID = 1L;

            @JsonApiId
            @Id
            @GeneratedValue(strategy= GenerationType.AUTO)
            @Column(name="subject_id")
            private Long subjectId;

            @Basic
            @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 45)
            private String description;

            public Long getSubjectId() {
                return subjectId;
            }

            public void setSubjectId(Long subjectId) {
                this.subjectId = subjectId;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

        }

```

## 3.  Create repository package under com.tma.tt.api

![image23](/uploads/2d18ee049cf6e8e2fadf9c46f8cbfaa7/image23.PNG)

## 4.  Create SubjectRepository interface in com.tma.tt.api.repository package

```java
        package com.tma.tlab.api.repository;

        import com.tma.tlab.api.model.Subject;
        import io.katharsis.repository.ResourceRepositoryV2;

        public interface SubjectRepository extends ResourceRepositoryV2<Subject, Long> {

        }
```

## 5.  Create SubjectRepositoryImpl class in com.tma.tt.api.repository package

```java
        package com.tma.tlab.api.repository;

        import java.util.List;

        import com.tma.tlab.api.jpa.SubjectJpaRepository;
        import com.tma.tlab.api.model.Subject;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;

        import io.katharsis.queryspec.QuerySpec;
        import io.katharsis.repository.ResourceRepositoryBase;
        import io.katharsis.resource.links.DefaultPagedLinksInformation;
        import io.katharsis.resource.list.DefaultResourceList;
        import io.katharsis.resource.list.ResourceList;
        import io.katharsis.resource.meta.DefaultPagedMetaInformation;

        @Component
        public class SubjectRepositoryImpl extends ResourceRepositoryBase<Subject, Long> implements SubjectRepository {

            @Autowired
            private SubjectJpaRepository jpaRepository;

            public SubjectRepositoryImpl() {
                super(Subject.class);
            }

            @Override
            public ResourceList<Subject> findAll(QuerySpec querySpec) {
                ResourceList<Subject> list = new DefaultResourceList<Subject>(new DefaultPagedMetaInformation(), new DefaultPagedLinksInformation());
                List<Subject> subjects = jpaRepository.findAll();
                querySpec.apply(subjects, list);
                return list;
            }

            @Override
            public Subject save(Subject obj) {
                return jpaRepository.save(obj);
            }

            @Override
            public void delete(Long id) {
                Subject obj = jpaRepository.getOne(id);
                this.jpaRepository.delete(obj);
            }
        }

```

## 6.  Add KatharsisConfigV3 into Application class

```java
        package com.tma.tlab.api;

        import io.katharsis.spring.boot.v3.KatharsisConfigV3;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Import;

        @SpringBootApplication
        @Import({ KatharsisConfigV3.class })
        public class Application {

            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }

        }
```

## 7.  Modify application.properties to define path prefix for json api service

```java
        katharsis.pathPrefix=/api
```

## 8.  Stop and start app again

## 9.  Use browser to test json service

![image24](/uploads/f57a71c26fc5ba855f39fa80af1b0758/image24.PNG)

    Raw json as below

```java
        {"data":[{"id":"1","type":"subjects","attributes":{"description":"Spring"},"links":{"self":"null/api/subjects/1"}},{"id":"2","type":"subjects","attributes":{"description":"DOTNET"},"links":{"self":"null/api/subjects/2"}}],"links":{"first":null,"last":null,"next":null,"prev":null},"meta":{"totalResourceCount":null}}
```


* Install postman and test subjects service

    GET request: http://localhost:9090/api/subjects

![image25](/uploads/d7bd679161ad8a1420b577ec9fedbbe7/image25.PNG)

    GET request: get subject with id = 1 [http://localhost:9090/api/subjects/1]

![image26](/uploads/3bb2f423c57e5d66271e42d622bd31c6/image26.PNG)

    POST request: create new subject and one record will be created in subject table in database

    http://localhost:9090/api/subjects

```java
        {
            "data": {
                "type": "subjects",
                "attributes": {
                    "description": "Test 3"
                }
            }
        }
```

![image27](/uploads/a1f5ed4efdc78e19121198ce0c7019ed/image27.PNG)

![image28](/uploads/c8164716b4bce0c8f003d4f1f8ba98b1/image28.PNG)

    PATCH request: edit subject with id = 3

    http://localhost:9090/api/subjects/3

```java
        {
            "data": {
                "type": "subjects",
                "attributes": {
                    "description": "Test 3 UPDATE HERE"
                }
            }
        }
```

![image29](/uploads/47078b9404a37e5ba363be074c8330e2/image29.PNG)

![image30](/uploads/268f24d297db8bcdde37bf51b11dee43/image30.PNG)



