# sas-tester-assessment

The goal of this assessment is to add some tests that can automatically test some freely available APIs.

You should manually test these APIs first to get an understanding of how they work.

There is an existing feature file apiTest.feature, it is expected for this to be added to and other tests/feature files to be added to any scenarios you can think of.

There is also an existing java class apiStepDefs.java where you will add the logic behind the feature files, this also needs to be worked on to cover the different scenarios that should be tested. The step defs class is using Apache's httpClient library but any library of choice can be used, if you want to use a different library you will need to add it to the build.gradle file.

Write tests that cover happy path and error scenarios.

Write tests that use different approaches for assertions (loops and conditions).

# Build the project

 ```
 gradle clean build -x test
 ```  

# Running the tests

You should be able to right click and run each test in the feature file individually

Go to IntelliJ -> Preferences -> Plugins and ensure Cucumber, Gherkin and Gradle are all installed and enabled

When you run a test, if it is not working got to Run -> Edit Configurations and ensure the Glue is defined as stepDefinitions