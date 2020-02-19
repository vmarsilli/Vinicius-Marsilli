# Monefy Mobile App - Automation Test

## Provided Solution Briefing

As it is an Android application, being developed in Java, the scripts language was also Java. This choice had an influence on the creation pattern of variables, methods and classes.
A simple packages structure was created to separate the tests. To this end, the classes created for each script were divided by test topics. The option to divide the scripts according to the proposed topics was to facilitate the grouping of tests that had direct dependencies on each other.
A "base" class was created in the primary package for instantiating the capabilities and defining the `beforeTest` and` afterTest` methods. Each script was created extending this base class and only the commands needed to run the tests were added to them in the `test` method. For better execution of some commands, a `Thread.sleep ()` methods with 500 milliseconds has been added to adjust the execution time of the script with the loading time of the necessary activity. In this way, "element not found" errors are avoided. The same `sleep` method was added at the end of script execution, in the` afterTest` method so that a quick visual validation could be done.
With regard to the input values used during the tests, they were fixed because they are random inputs and not sought from a specific basis. for tests that required more in-depth visual validation, the execution sleep time was adjusted to a greater number.


# Automation Test Highlights

Thinking about the impact on business caused by failures, all Monefy's areas that manipulates inputs values and their interaction (sum, subtraction, specific dates and categories) where considers ad prioritization flows. In this case, below tests were categorized in a priority scale, where `3` indicates where there is a flow with more impact risk and `1` being the least risky:

- **Validate incomes and expenses entries creation and update to ensure that all new income or expenses are summed correctly to the total balance; `3`**

- **Verify calculator available when entering a new income / expense, perform calculations with different values (positive, negative, decimal) to find out if you perform the calculations correctly; `2`**

- **Verfiy that new entries are successfully created after adding a new user financial account; `1`**

- **Validate the transfer flow between the user's financial accounts; `3`**

- **Changes in the application language and the default currency. `2`**



## Proposed Test Cases in Different Test Levels
The possibilities of automating proposed test cases on automation test three levels and its pros and cons


### Unit Testing Level

During development phase, there are many inputs and outcomes validations to be done, activity calls, buttons functionalities and correct filling labels. Those validations can be performed during automation test, allowing to create many variations of inputs and enables to check labels and buttons text length and correct functionality.

**Pros:** 
- Help to protect the project from future problems;
- Aids on inputs data types validations on coding phase;
- Specific components can be tested exhaustively.

**Cons:**
- Screen updates will be missed during automation test; 
- It takes too much time to create test scripts vs their range, in terms of necessary validations of components integration.


### Functional Testing Level

The functionalities of the application involve since the management of user's finances, dividing by categories or by different accounts. The application also allows viewing of launches in different ways. It also offers filter options by date and accounts. Automation scripts can be written to create the data and validate all functional options available and whether the outputs are correct.

**Pros:** 
- Validate response time during activities calls;
- Check integration among data manipulation functionalities;
- More application’s business logic can be tested at once.

**Cons:**
- If the test script tests more screens, data files maintenance is harder;
- Some scripts errors could cause failure on automation execution, leading to false positive application errors.


### User Interface Level (GUI Test Layer)

It is possible to test not only the user interface, but also its functionality by performing the operation that causes application's business logic.
For graph composition and visual update it is also important to test many parameters values length to heck if its portions are being be completely fulfilled.

**Pros:** 
- Avoid to manually create many inputs;
- More interactions validations can be performed at once.

**Cons:**
- Graph filling could be missed;
- Categories and Accounts icons could be wrongly applied and the validation missed;
- Not able to validate app's customizations options



# Test Suite Configuration

The platform required for Monefy automating tests was Android. Taking this into account, the choice for test scripting was Java Eclipse IDE, for its features such as versatile templates, quick sketching and integration with Maven.
The option for Selenium framework was because of its usability and Appium integration. Talking about Appium tool, it allows easily server configuration and connection to the desired devices.
The option for TestNG was because of its flexible test setup and is supported by a variety of tools and plug-ins, such as Eclipse and maven.
So, these are the tools and frameworks used and their respective versions and setups:

- Windows 10 10.0
- JRE: 1.8.0_202-release-1483-b03 amd64				
- Android Studio 3.5.3 - Build #AI-191.8026.42.35.6010548	
- JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o

- Java IDE: Eclipse IDE for Enterprise Java Developers - Version: 2019-12 (4.14.0)
- Maven: Maven Integration for Eclipse - Version	1.14.0.20191209-1925
	(It was installed with Eclipse IDE installation)
- TestNG Eclipse Plugin - Version 7.0.0
	(It was installed at Eclipe IDE directly via "Install New Software..." option; Also, dependency was included on pom file)
- Appium for Windows - 1.15.1
	(Appium Server was installed via executable file for Windows10 in order to create the server connection with Android device; Also, dependencies for Appium java-client were included on pom file)
- Selenium API - Version 3.12.0
	(When importing Appium dependencies, Selenium API jar files were already imported)	

Dependencies included on `pom.xml's` file (all libraries were also included on **LIBRARIES** folder):
```
<!-- APPIUM -->
<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
<dependency>
	<groupId>io.appium</groupId>
	<artifactId>java-client</artifactId>
	<version>7.1.0</version>
</dependency>
```
```
<!-- TESTNG -->
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
	<groupId>org.testng</groupId>
	<artifactId>testng</artifactId>
	<version>7.0.0</version>
	<scope>test</scope>
</dependency>
```