## Master Java Streams: Exercises
This repository contains Java Stream exercises divided into 5 units which each correspond to a different topic covered in [this series of articles](https://www.dzone.com).

- **Unit 1:** Creating a Stream<br/>
- **Unit 2:** Intermediate Operations<br/>
- **Unit 3:** Terminal Operations<br/>
- **Unit 4:** Database Streams<br/>
- **Unit 5:** Extra Database Exercise 

Every Unit consists of three parts: 
- a Java Interface (located in folder Unit) <br/>
- a Java Implementation (located in folder Solution) <br/>
- and a set of Tests (located in the tests folder). <br/>

The Interfaces describe the desired behavior of the corresponding Java Implementation, and the Tests can be run to verify that the implementation is correct. 

### Intended Usage 

- Clone this repo locally on your computer
- Open the source-code as a Maven Project in an IDEA of you preference (we have only tried this with recent versions of IntelliJ). This is easily done by selecting ”Open Project” and selecting the Pom.xml-file. By doing so, IntelliJ will automatically generate a Maven Project structure
- Implement the declared methods in the Solutions folder
- Run the tests to see if you passed.

![Running-Tests](https://github.com/speedment/hol-streams/blob/master/HOL-Streams.png?raw=true "Screenshot of test environment ")
*Screenshot of IntelliJ after execution of Unit 4 tests.*

### Requirements
Running the source-code requires a recent version of Maven and Java 8 or later. 

### Troubleshooting
If your IDE has issues finding the correct dependencies, check that you have opened the project as a Maven project.
