# Develop Training Lab API Project - Part 1 - Spring Boot

## 1.  Create training-lab-api project

* Go to D:\working\tma-git directory
* Start a shell in that directory
* On your command line, execute the following Maven goal:

```java
    mvn archetype:generate -DgroupId=com.tma -DartifactId=training-lab-api -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

* You will notice that the generate goal created a directory with the same name given as the artifactId. Change into that directory.

```java
    cd training-lab-api
```

* Under this directory you will notice the following standard project structure.

![image01](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image01.PNG)

* The POM - The pom.xml file is the core of a project's configuration in Maven. It is a single configuration file that contains the majority of information required to build a project in just the way you want. The POM is huge and can be daunting in its complexity, but it is not necessary to understand all of the intricacies just yet to use it effectively. This project's POM is:

![image02](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image02.PNG)

## 2.  Apply Spring Boot to training-lab-api project

* Add parent section into pom.xml

    Spring Boot provides a number of “Starters” that let you add jars to your classpath. In this app, let use spring-boot-starter-parent in the parent section of the POM. The spring-boot-starter-parent is a special starter that provides useful Maven defaults. It also provides a dependency-management section so that you can omit version tags for “blessed” dependencies.

```java
    	<parent>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-parent</artifactId>
    		<version>2.0.2.RELEASE</version>
    	</parent>
```

![image04](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image04.PNG)

* Since we are developing a json web service application, we add a spring-boot-starter-web dependency.

```java
	    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```

![image05](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image05.PNG)

* To create an executable jar, we need to add the spring-boot-maven-plugin to our pom.xml. To do so, insert the following lines just below the dependencies section:

```java
	    	<plugins>
        		<plugin>
        			<groupId>org.springframework.boot</groupId>
        			<artifactId>spring-boot-maven-plugin</artifactId>
        		</plugin>
        	</plugins>
```

![image06](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image06.PNG)

* Create tlab.api package under com.tma package

* Create an Application class in com.tma.tlab.api package

* Delete App and AppTest classes in com.tma package of main and test folders

![image03](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image03.PNG)

* Edit Application class to make it become a launcher of Spring Boot app

![image07](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image07.PNG)

* Add @SpringBootApplication annotation

![image08](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image08.PNG)

@SpringBootApplication is a convenience annotation that adds all of the following:

    - @Configuration tags the class as a source of bean definitions for the application context.

    - @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

    - Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.

    - @ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.

* Add the main() method

    The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there wasn’t a single line of XML? No web.xml file either. This web application is 100% pure Java and you didn’t have to deal with configuring any plumbing or infrastructure.

![image09](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image09.PNG)

* The final code of Application class as below:

```java
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        @SpringBootApplication
        public class Application {

            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
            }

        }
```

* Create an example web controller in order to test this app.

    - Create hello package under com.tma.tlab.api package
    - Create HelloController class
    - Add annotations and methods as below

![image10](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image10.PNG)

![image11](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image11.PNG)

* Notes:

    The @RequestMapping annotation can be applied to class-level and/or method-level in a controller.

    The class-level annotation maps a specific request path or pattern onto a controller. You can then apply additional method-level annotations to make mappings more specific to handler methods.

    The class is flagged as a @RestController, meaning it’s ready for use by Spring MVC to handle web requests. @RequestMapping maps / to the index() method. When invoked from a browser or using curl on the command line, the method returns pure text.

* Run Spring Boot app.

    Right click on Application class and select Run 'Application'

![image12](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image12.PNG)

    The following is the log of started app

![image13](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image13.PNG)

* Check services on browser

    http://localhost:8080/api/

![image14](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image14.PNG)

    http://localhost:8080/api/hello

![image15](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image15.PNG)

* Change port number of Spring app

    Add resources folder under main folder

    Add application.properties file, and then add server.port=9090 into this file

![image16](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image16.PNG)

* Test service with new port 9090

    http://localhost:9090/api/

![image17](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image17.PNG)

* To see resource icon on resources folder, right click on resources folder and select Mark Directory As/ Resources Root

![image18](https://github.com/khanh97mh/CT/blob/master/training-lab/images/image18.PNG)








