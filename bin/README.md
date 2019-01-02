# AUTOMATION FRAMEWORK


This framework is provided for web as well as mobile automation. 



1. pom.xml : Edit the artifact name and the name of the project.

2. testng.xml : Add test classes that is required to execute the tests. Edit the name of the file if required.

3. DriverClass.java : Navigate to src -> main -> java -> baseClass. Edit and upgrade capabilities as per need for the mobile platform or remove it and create a WebDriver if wanted. Bsically generates the Driver instance.

4. pageObjects : Navigate to src -> main -> java. There is a pageObjects module in which all the pageObject files will be created. An example is shown to demostrate this by using Example.java file inside pageObjects module.

5. methodInterceptorListner.java : Navigate to src -> test -> java -> testListeners. Open this file and edit the name of the Excel file that will be used to give the method names that will be executed in the run.(Not Mandatory) 

The Excel file is saved in src -> test -> resources as EXCEL_TEST_DATA file consisting of columns:
	a) METHOD NAME : It should be the same name as given to the particular test method of a test class. (Mandatory)
	b) DESCRIPTION : It tells about what the method actually do.
	c) MODULE MAME : Name of the module it belongs.
	d) Y/N 		   : Which test to run is shown by 'Y' and which should not is shown by 'N'.

	The Example of this is shown in pre-build excel file. 

	NOTE : If the name of excel file is changed in the methodInterceptorListner.java file then it should be changed for the excel file also.

6. 	testClasses : Navigate to src -> test -> java. There is a testClasses module in which all the test scripts are created. An example is shown to demonstrate this by using ExampleTests.java file inside testClasses module.

7. testData : Navigate to src -> test -> resources. Find the folder testData inside it. It consists of all the test data required for the test run. The test data is formed by using following naming convention.
	a) The name of Excel data file should be same as the name of the test class for which it is created. 
	b) The name of sheet should be same as per the name of the test method which obtains data from that file.

	An example is shown to demostrate this inside the directory.

8. Screenshots : This contains the screenshots of all the failed cases.

9. ExtentReports: This folder contains the reports of all the test runs.	

10. RetryAnalyser: The framework is build to run failed test cases one more time in order to confirm it's failure. To make changes in it, edit maxTry varibale in RetryAnalyser.java file inside src -> test -> java -> testListeners.


NOTE : If this framework is to be utilised for the web automation, only driver instance has to be created on the place of capabilites.




