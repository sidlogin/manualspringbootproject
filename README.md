# Java Spring Boot-learning
### Following manual steps needed to run this project as SpringBoot:

- Created a new maven project manually
- Created a new HelloController java file for new Rest Controller called home using @GetMapping annotation but due to missing libraries it is unable to locate annotation.
- To add all spring boot dependencies, first I need to add following POM dependencies:
  - **spring-boot-starter-parent** (Without version)
  - **spring-boot-starter-web** (To manage all dependency automatically by SpringBoot we need this parent dependency)
  - Run the project after adding above dependencies. It add all necessaries packages in ExternalLibrary folder.
  - Now we need to add following annotations **@EnableAutoConfiguration**, **@ComponentScan** in main java file.
- Now add **@GetMapping** annotation in HelloController java file.
- Add we need another annotation called @RestController, without that we can't run home controller in browser.