This test was carried out to test the website: "https://www.saucedemo.com/"

Testing on the website was carried out to test the login and shopping features.
In the login feature, tests are carried out for successful login and failed login, then in the shopping feature tests will be carried out for View All-list, Item details, Add to Char and Buy Item.

How to run the test:
Gitclone from the repository, open the java class with the name 'CucumberTest.Java'. Then Running

Example of detailed Setting Step:

1. Library trsting use Selenium and Curcumber methodology

2. First, integrate and install the Selenium and Curcumber libraries in build.gradle

3. Add Selenium Setup in build.gradle

4. Create java class for setup cucumber (its aim to Runner test)

5. in resources create login.feature for add steps testing (use gherkin syntax)

6. Add Step definition StepdevLogin and StepdevHome

7. Create java class in to Page Object & add dependencies

8. Assemble all objects to java class in Stepdev

9. Add build integration BaseTest(sync WebDriverManager) and CucumberHooks

10. Running Test at Selenium Setup or at Cucumber Runner Test
RESULT TEST:
https://fery99.github.io/OOP-SeleniumCucumber/
