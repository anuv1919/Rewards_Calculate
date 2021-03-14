A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

**Based on the above question, I have two versions of API's created:
**
**Version-1**

Assuming we need to calculate the rewards per transaction and calculated the rewards points per transaction accumulating as per month and total.

Use postman or any HTTP client to hit the endpoint as below:

http://localhost:8080/rewards/v1/{user_ID}
example: http://localhost:8080/rewards/v1/bob


**Version-2**

Assuming we need to calculate the total transactions amounts per each month, and then calculating the rewards per total amount per month.

Use postman or any HTTP client to hit the endpoint as below:

http://localhost:8080/rewards/v2/{user_ID}
example: http://localhost:8080/rewards/v2/bob



## How to Run the Service

* Close the service and do a mvn clean install
* Run using the command mvn spring-boot:run
* The app listens on the port 8080 and root path is "/"

## Swagger API Documentation

* Open API Specification document for the service can be accessed at http://localhost:8080/v3/api-docs/



    

