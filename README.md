# Java Spring Boot-learning
### Following manual steps needed to run this project as SpringBoot:

- Created a new maven project manually
- Created a new HelloController java file for new Rest Controller called home using @GetMapping annotation but due to missing libraries it is unable to locate annotation.
- To add all spring boot dependencies, first I need to add following POM dependencies:
  - **spring-boot-starter-parent** (Without version)
  - **spring-boot-starter-web** (To manage all dependency automatically by SpringBoot we need this parent dependency)
  - Run the project after adding above dependencies. It add all necessaries packages in ExternalLibrary folder.
  - Add annotations **@EnableAutoConfiguration**
    - it helps tp configure everything automatically by spring-boot before start the applicationI
    - It load the web server
    - Embed Tomcat Server
    - Embed all dependencies and enable them
    - To make servlet, initialize
  - Add annotations **@ComponentScan** to scan all classes with-in main class package.
  - Or use super Annotation called **@SpringBootAnnotation** which embed both @EnableAutoConfiguration and @ComponentScan under it.
- Now add **@GetMapping** annotation in HelloController java file.
- Add we need another annotation called @RestController, without that we can't run home controller in browser.

# Generate & run SpringBoot Application using JAR
- Add maven plugin **<artifactId>spring-boot-maven-plugin</artifactId>** from maven repository
- Run maven clean build to generate the project fat JAR files which can run java spring boot independently at ay machine or server.
- To test run following command: **java -jar ManualSpringBootProject-1.0-SNAPSHOT.jar**