# Develop Training Lab API Project - Part 2 - JPA

## 1.  Install MYSQL

    Download MYSQL installer from https://dev.mysql.com/downloads/installer/

    Run exe file to install

## 2.  Add dependencies

* Add some common libs

```java
            <!-- For Java 8 Date/Time Support -->
            <dependency>
              <groupId>com.fasterxml.jackson.datatype</groupId>
              <artifactId>jackson-datatype-jsr310</artifactId>
            </dependency>

            <dependency>
              <groupId>commons-collections</groupId>
              <artifactId>commons-collections</artifactId>
              <version>3.2.2</version>
              <scope>compile</scope>
              <optional>true</optional>
            </dependency>
            <dependency>
              <groupId>commons-lang</groupId>
              <artifactId>commons-lang</artifactId>
              <version>2.6</version>
              <scope>compile</scope>
            </dependency>
            <dependency>
              <groupId>commons-logging</groupId>
              <artifactId>commons-logging</artifactId>
              <version>1.2</version>
              <scope>compile</scope>
              <optional>true</optional>
            </dependency>
```

* Using Spring Data JPA to store and retrieve data in a relational database. Add spring-boot-starter-data-jpa dependency

```java
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
```

* Add MYSQL connectivity dependency
```java
            <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
            </dependency>
```

* pom.xml after added dependencies

```java
           <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
             <modelVersion>4.0.0</modelVersion>
             <groupId>com.tma</groupId>
             <artifactId>training-lab-api</artifactId>
             <packaging>jar</packaging>
             <version>1.0-SNAPSHOT</version>
             <name>training-lab-api</name>
             <url>http://maven.apache.org</url>
             <parent>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-parent</artifactId>
               <version>2.0.2.RELEASE</version>
             </parent>
             <properties>
               <java.version>1.8</java.version>
             </properties>
             <dependencies>
               <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-web</artifactId>
               </dependency>
               <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-data-jpa</artifactId>
               </dependency>

               <dependency>
                 <groupId>mysql</groupId>
                 <artifactId>mysql-connector-java</artifactId>
               </dependency>

               <!-- For Java 8 Date/Time Support -->
               <dependency>
                 <groupId>com.fasterxml.jackson.datatype</groupId>
                 <artifactId>jackson-datatype-jsr310</artifactId>
               </dependency>

               <dependency>
                 <groupId>commons-collections</groupId>
                 <artifactId>commons-collections</artifactId>
                 <version>3.2.2</version>
                 <scope>compile</scope>
                 <optional>true</optional>
               </dependency>
               <dependency>
                 <groupId>commons-lang</groupId>
                 <artifactId>commons-lang</artifactId>
                 <version>2.6</version>
                 <scope>compile</scope>
               </dependency>
               <dependency>
                 <groupId>commons-logging</groupId>
                 <artifactId>commons-logging</artifactId>
                 <version>1.2</version>
                 <scope>compile</scope>
                 <optional>true</optional>
               </dependency>

               <dependency>
                 <groupId>junit</groupId>
                 <artifactId>junit</artifactId>
                 <version>3.8.1</version>
                 <scope>test</scope>
               </dependency>
             </dependencies>
             <build>
               <plugins>
                 <plugin>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-maven-plugin</artifactId>
                 </plugin>
               </plugins>
             </build>
           </project>
```

## 3.  Create place to keep ddl/dml script for this app

* Create db folder under training-lab-api

* Create tlab-db.sql file in db folder

![image19](/uploads/5736217b35f57a4c74788245c4826da4/image19.PNG)

* Add below statements into tlab-db.sql file

```java
           CREATE DATABASE  IF NOT EXISTS `tlab_db`;
           USE `tlab_db`;

           DROP TABLE IF EXISTS `subject`;
           CREATE TABLE `subject` (
             `subject_id` bigint(20) NOT NULL AUTO_INCREMENT,
             `description` varchar(45) NOT NULL,
             PRIMARY KEY (`subject_id`)
           ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

           LOCK TABLES `subject` WRITE;
           INSERT INTO `subject` VALUES (1,'Spring'),(2,'DOTNET');
           UNLOCK TABLES;
```

* Open MYSQL Workbench and execute tlab-db.sql script to create tlab database and subject table

* Add configuration for datasource and jpa into application.properties file

```java
           spring.datasource.url=jdbc:mysql://localhost:3306/tlab_db
           spring.datasource.username=root
           spring.datasource.password=admin
           spring.datasource.tomcat.max-wait=20000
           spring.datasource.tomcat.max-active=50
           spring.datasource.tomcat.max-idle=20
           spring.datasource.tomcat.min-idle=15

           spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
           spring.jpa.properties.hibernate.id.new_generator_mappings=false
           spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
           spring.jpa.properties.hibernate.format_sql=true

           logging.level.org.hibernate.SQL=DEBUG
           logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```

* Create model and jpa packages under com.tma.tlab.api

![image20](/uploads/12faed4cca2696e7554f7ca384ad6d97/image20.PNG)

* Create Subject class in com.tma.tlab.api.model package

![image21](/uploads/c3d737af17be7bb9b5836a95dc68e2aa/image21.PNG)

* Create CommonJpaRepository interface in com.tma.tlab.api.jpa package

```java
           package com.tma.tlab.api.jpa;

           import org.springframework.data.jpa.repository.JpaRepository;
           import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
           import org.springframework.data.repository.NoRepositoryBean;
           import org.springframework.data.repository.PagingAndSortingRepository;

           import java.io.Serializable;

           @NoRepositoryBean
           public interface CommonJpaRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T>, JpaRepository<T, ID> {
           }

```

* Create SubjectJpaRepository interface in com.tma.tlab.api.jpa package.

    Notes: To understand Java Generic, please read article [https://docs.oracle.com/javase/tutorial/java/generics/types.html]

```java
           package com.tma.tlab.api.jpa;

           import com.tma.tlab.api.model.Subject;

           public interface SubjectJpaRepository extends CommonJpaRepository<Subject, Long> {
           }

```

* Modify HelloController class to test SubjectJpaRepository

    Inject SubjectJpaRepository bean

```java
           @Autowired
           private SubjectJpaRepository jpaRepository;
```

    Modify index method to invoke jpaRepository bean

```java
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
```

    Stop and start this app again

    Use browser to send request to server - http://localhost:9090/api/, and then check the log on server

![image22](/uploads/8d38d4337585d982ed7836b912a2754c/image22.PNG)


