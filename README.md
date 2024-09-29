
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Lingpeng Li                |
| Date         | 09/28/2024                 |
| Course       | Fall 2024                  |
| Assignment # | 1                          |

---

# Assignment Overview

This project implements a **fully automated beverage vending machine** that can handle the preparation of different coffee and tea drinks. The machine allows users to select drinks such as Espresso, Americano, Latte, Black Tea, Green Tea, and Yellow Tea. The system supports adding up to 3 units of milk and 3 units of sugar to each beverage. The pricing is calculated dynamically based on the selected drink and the number of added condiments.

---
# GitHub Repository Link:
<<<<<<< HEAD
## https://github.com/matthew0331/cs-665-assignment-1
=======
https://github.com/matthew0331/cs-665-assignment-1
>>>>>>> 72be3aaf29db30fce8fb2db17a6428d7a295aea2

## Implementation Description

This section outlines the main software design concepts and their goals in the project.

### Flexibility

The system is designed to easily allow adding or removing new drink types by leveraging inheritance and polymorphism. All beverage types (coffee and tea) extend from a base `Beverage` class, which provides an easy-to-extend structure. New drinks like `Latte`, `Americano`, `Black Tea`, etc., are created by extending either the `Coffee` or `Tea` class. In the future, new drinks can be added simply by creating new subclasses, ensuring scalability.

### Simplicity and Understandability

The implementation follows a clear class structure, with each beverage class containing minimal, clearly defined responsibilities. By adhering to well-known object-oriented design principles such as inheritance, abstraction, and encapsulation, the code is easy to read and maintain. Furthermore, proper JavaDocs and inline comments have been included to ensure that future developers can easily understand the logic.

### Avoiding Duplicated Code

Duplicated code is avoided by centralizing common behaviors in the `Beverage` class and its direct subclasses (`Coffee` and `Tea`). This approach ensures that the base functionality for all beverage types remains consistent, and only unique details (e.g., price or description) need to be defined in the specific beverage classes like `Espresso`, `Latte`, etc.

### Design Patterns

The project does not use any advanced design patterns such as Factories or Singletons, focusing instead on using inheritance and polymorphism to achieve flexibility. This approach keeps the design simple while ensuring that the core functionality is extendable.

---

## Notes

This project meets the requirements outlined for a fully automated beverage vending machine. It has been implemented with the flexibility to allow new drinks and condiments to be added easily. The code has been verified using Maven, SpotBugs, Checkstyle, and JUnit test cases to ensure that it is both functional and compliant with standard coding practices.



## Project Structure

```
src
 └── main/java/edu/bu/met/cs665/beverage
     ├── coffee_subclasses
     │   ├── Americano.java
     │   ├── Espresso.java
     │   ├── Latte.java
     ├── tea_subclasses
     │   ├── Black.java
     │   ├── Green.java
     │   ├── Yellow.java
     ├── Beverage.java
     ├── Coffee.java
     ├── Tea.java
     ├── Main.java
     └── VendingMachine.java
 └── test/java/edu/bu/met/cs665
     └── VendingMachineTests.java
```

---

## How to Run the Project

### Prerequisites
- **Java JDK 1.8** 
- **Apache Maven** 4.0.0 



---

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line:

```
mvn clean compile
```

**Run the Project:**
After compiling, you can run the project by executing the `Main.java` class:
   ```
   mvn exec:java -Dexec.mainClass="edu.bu.met.cs665.beverage.Main"
   ```

## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```
mvn clean test
```
---

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.



## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html``target/site/checkstyle.html`
