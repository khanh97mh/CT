# Spring Boot Exercises

## 0.  Spring-Boot initial setup

* Create spring-boot-exercises project
* Go to D:\working\tma-git directory
* Start a shell in that directory
* On your command line, execute the following Maven goal:

```java
    mvn archetype:generate -DgroupId=com.tma -DartifactId=spring-boot-exercises -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

* You will notice that the generate goal created a directory with the same name given as the artifactId.

* Use Intellij or Eclipse open spring-boot-exercises project

## 01.  Spring-Boot initial setup

* Add parent section into pom.xml

```java
    	<parent>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-parent</artifactId>
    		<version>2.0.2.RELEASE</version>
    	</parent>
```

* Add a spring-boot-starter-web dependency.

```java
	    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```

* To create an executable jar, we need to add the spring-boot-maven-plugin to our pom.xml. To do so, insert the following lines just below the dependencies section:

```java
	    	<plugins>
        		<plugin>
        			<groupId>org.springframework.boot</groupId>
        			<artifactId>spring-boot-maven-plugin</artifactId>
        		</plugin>
        	</plugins>
```

* The pom.xml

```java
	    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
          <modelVersion>4.0.0</modelVersion>
          <groupId>com.tma</groupId>
          <artifactId>spring-boot-exercises</artifactId>
          <packaging>jar</packaging>
          <version>1.0-SNAPSHOT</version>
          <name>spring-boot-exercises</name>
          <url>http://maven.apache.org</url>
          <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.0.2.RELEASE</version>
          </parent>
          <properties>
            <java.version>1.8</java.version>
            <katharsis.version>3.0.2</katharsis.version>
          </properties>
          <dependencies>
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
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

* Notes:

    The above pom.xml includes the minimum required declarations to run the spring-boot application. Make sure that you are using java 1.8 version. We will get more details on the details included in the pom.xml in the coming pages.

* Create sblab package under com.tma package

* Create an Application class in com.tma.sblab.api package

* Delete App and AppTest classes in com.tma package of main and test folders

* Edit Application class to make it become a launcher of Spring Boot app

```java
	    package com.tma.sblab;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        @SpringBootApplication
        public class Application {

            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }

        }
```

Notes:

    Many Spring Boot developers always have their main class annotated with @Configuration, @EnableAutoConfiguration and @ComponentScan. Since these annotations are so frequently used together (especially if you follow the best practices above), Spring Boot provides a convenient @SpringBootApplication alternative.

    The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes

    The following are the parameters accepted in the @SpringBootApplication annotation:

        exclude: Exclude the list of classes from the auto configuration.

        excludeNames: Exclude the list of fully qualified class names from the auto configuration. This parameter added since spring boot 1.3.0.

        scanBasePackageClasses: Provide the list of classes that has to be applied for the @ComponentScan.

        scanBasePackages Provide the list of packages that has to be applied for the @ComponentScan. This parameter added since spring boot 1.3.0.


* Run the above class to initialize spring boot application. It deployes application into the tomcat and starts the tomcat.

* Run Spring-boot Application, here is the example image to show you how to run the spring boot application:

![image-01](/uploads/7e8e46ce3c71dee238dbf957db8adcba/image-01.PNG)

* Here is the output. Note that the tomcat is started and running on port 8080.

![image-02](/uploads/1d020870e831caf68ef3b9cd35051377/image-02.PNG)

## 02.  Create controller

* Create controller package under com.tma.sblab package

* Create HelloWorldController class in com.tma.sblab.controller package

```java
	    package com.tma.sblab.controller;

        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

        @RestController
        @EnableAutoConfiguration
        public class HelloWorldController {

            @RequestMapping("/")
            @ResponseBody
            String hello() {
                return "Hello World! Spring boot is so simple.";
            }
        }

```

* Restart app

* Test HelloWorldController controller on browser

    http://localhost:8080/

![image-03](/uploads/3864d69eb4c37eb8630729dd7ee088c5/image-03.PNG)

## 02.  Add application.properties

* Add resources folder under main folder, right click on resources folder and select 'Mark Directory As / Resources Root'

* Add application.properties file into resources folder

![image-04](/uploads/1c115e8ba6155cce0ebb69402e4c3eb9/image-04.PNG)

Notes:

    One of the advantage Spring Boot provides us is "lesser configuration" compared to standard spring framework. Spring Boot applies it’s typical convention over configuration approach to property files. Spring boot introduced its default application properties named as "application.properties" file and it is auto detected without any spring based configurations. We need to place application.properties file inside "src/main/resources" directory.

    So, by using this default file, we don’t have to explicitly register a PropertySource, or even provide a path to a property file.

## 03.  Using @ConfigurationProperties annotation

Spring Boot @ConfigurationProperties is allows developer to map the entire property file into an object easily.

In normal spring framework, we use @Value annotation to inject property values one by one as shown below:

```java
	    @Value("${cmdb.resource-url}")
        private int threadPool;
```

With the use of @ConfigurationProperties, it is going to be much easier. Here is a simple property file "application.properties":

```java
	    cmdb.resource-url=http://tma.com.vn
        cmdb.resourcePort[0]=80
        cmdb.resourcePort[1]=443
```

@ConfigurationProperties annotation helps to load a family of related properties, say in this specific case namespaced by the prefix conveniently named "cmdb".

The approach Spring boot takes is to define a bean that can hold all the families of related properties this way:

* Create util package under com.tma.sblab

* Create CmdbProperties class in com.tma.sblab package

```java
	    package com.tma.sblab.util;

        import java.util.List;

        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.context.annotation.Configuration;

        @Configuration
        @ConfigurationProperties("cmdb")
        public class CmdbProperties {

            private String resourceUrl;
            private List<Integer> resourcePort;

            @Override
            public String toString() {

                return "resourceUrl: "+ this.resourceUrl+"\n"
                        + "resourcePort: "+this.resourcePort+"\n";
            }

            public String getResourceUrl() {
                return resourceUrl;
            }
            public void setResourceUrl(String resourceUrl) {
                this.resourceUrl = resourceUrl;
            }
            public List<Integer> getResourcePort() {
                return resourcePort;
            }
            public void setResourcePort(List<Integer> resourcePort) {
                this.resourcePort = resourcePort;
            }
        }


```

* Modify Application class to print the properties after application load

```java
	    package com.tma.sblab;

        import com.tma.sblab.util.CmdbProperties;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        import javax.annotation.PostConstruct;

        @SpringBootApplication
        public class Application {

            private static Logger logger = LoggerFactory.getLogger(Application.class);

            @Autowired
            private CmdbProperties cmdbProperties;

            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }

            @PostConstruct
            public void init() {

                logger.info(cmdbProperties.toString());
            }

        }

```

* Restart app

![image-05](/uploads/89973d9c391f1819734d786d4c775ef1/image-05.PNG)


```java
	    <dependency>

```

```java
	    <dependency>

```

```java
	    <dependency>

```

```java
	    <dependency>

```



## 04.  Xxx
## 05.  Xxx
## 06.  Xxx
## 07.  Xxx
## 08.  Xxx
## 09.  Xxx
## 10.  Xxx
## 11.  Xxx
## 12.  Xxx
## 13.  Xxx
## 14.  Xxx
## 15.  Xxx
## 16.  Xxx
## 17.  Xxx
## 18.  Xxx
## 19.  Xxx
## 20.  Xxx
## 21.  Xxx
## 22.  Xxx
## 23.  Xxx
## 24.  Xxx
## 25.  Xxx