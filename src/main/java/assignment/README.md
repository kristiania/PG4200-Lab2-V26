# Lab practice 1
--
## Preparations

### Step 1

- Download JetBrains Toolbox
- Download or update IntelliJ to Community Edition 2025 eller 2025EAP

### Step 2

Create a new project in IntelliJ with the following information:
- Build system: IntelliJ
- JDK: opendJDK-25
- Download if needed
- No sample code

---
## Task: Implement algorithm _Linear Search_ on data structure _Array_ in Java.

- In this folder (`src/main/java/assignment`), create a class named _Search_ which will initially only have declared one int array variable.


- Create a constructor inside the _Search_ class with one parameter of type int [] for setting the instance variable.


- Create a method _linearSearch_ that finds a value in the array and returns its posisiton. That is the method takes one int typed parameter as an argument...the value you wish to find in your Array. The method returns an int value: the position in the array if you find a match. Otherwise it returns -1.


- Create a method _stepsLinearSearch_ that counts the number of steps it takes for _linearSearch_ to find a match for a given value. The method takes one int typed parameter as an argument...the value you wish to find in your Array. The method returns an int value: the number of steps it takes to find or not find a match.


- Hint: you may already find code for constructing a _Search_-object and invoking the methods in the compact class _main.java_.  More information on compact class in java25 here: https://openjdk.org/jeps/512


- Optional: To test your code, you will find the test setup in the file `src/test/java/assignment/TestAssignment.java`. There you can choose to run all tests at once or run them one by one. This requires that maven JUNIT 6 is installed: https://www.jetbrains.com/help/idea/junit.html 

- Solution: You can find a solution proposal i the `src/main/java/solution` folder. 

- Extra: What is the time complexity for _linearSearch_? You can find some guidance to measure the execution time of the algorithm here https://www.tutorialspoint.com/how-to-measure-execution-time-for-a-java-method .


- Food for thoughts: is there a faster way to search an arbitrary Array? What assumptions on our data structure must be made to make an algorithm go faster?
