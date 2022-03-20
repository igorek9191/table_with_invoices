### About test automation task:
Write automated test(s) which have(s) to compare and assert information about matching the following points below for order ID 146566 with info on the offline page attached to this task:
1. Company: TEST CUSTOMER
2. Invoice address: TEST ADDRESS, TEST TOWN, 111111
3. Grade: Mixed Municipal Waste
4. Weight: 0.460 T
5. Price entity: Flat charge Line total for this price entity: £100.00<br />
   Price entity: per tonne Line total for this price entity: £4.60<br />
   Price entity: Item Line total for this price entity: £110.00

### Web page to test
It is stored in ```src/main/resources``` package

### Required Tools
Java 14<br />
Gradle 7.1<br />
allure 2.15.0

### Launch of test
In the root of project put in command prompt:<br />
```gradle clean test --tests "OurLittleTest"```<br />
OR<br />
```./gradlew clean test --tests "OurLittleTest"``` (if you work at Mac)

### Test report
In the root of project put in command prompt:<br />
```allure serve build/allure-results/```  <br />
Then open ```Behaviors``` tab and you will see the result <br />
If you want to see report with failures, then change couple of expected values in ```OurLittleTest``` class

###Couple of my thoughts
Firstly, this framework needs to add logging library.<br />
Secondly, for further test development the framework needs to add property file to store config variables.<br />
Thirdly, determination of rows in page objects could be done through finding child element with number of the order, and then, getting ancestor element as a row and sibling elements as another rows. This approach requires stable structure of the table.
