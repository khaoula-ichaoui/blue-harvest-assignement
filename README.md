# Current Account Management API

The API contains two endpoints:
 - The first one allows to open a new current account for already existing customer
 - The second one allows to output the user information showing Name, Surname,
   balance, and transactions of the accounts

---

## Prerequisites

- IDE (IntelliJ IDEA, Eclipse ...)
- [Java SDK v17](https://www.java.com/)
- [Apache Maven 3.6.3 or later](https://maven.apache.org/)
---

## Installation

1- clone the project

git clone https://github.com/khaoula-ichaoui/current-account-management-api
.git

2- Run the application as a spring boot application

---

## Usage

1- Acceed to the API swagger documentation by opening this url:

http://localhost:8080/current-account-management/api/v1/swagger-ui/index.html

2- Acceed to the inmemory database by opening this url: 

http://localhost:8080/current-account-management/api/v1/h2-console

(Username and password are mentioned in the properties file)

2- test the first endpoint with two scenarios :

- Put a customerId of an already existing customer => a current created with response code 201 (Created).


- Put a customerId where there is no existing customer having that customerId in the database
==> An error message will be displayed saying  "Customer not found with Id 'customerId' "
with response code 400 (Bad Request)


3- test the second endpoint with two scenarios :

- Put an existing customerId ==> the customer information will be displayed (Name, Surname, balance, and transactions of the accounts).


- - Put a customerId where there is no existing customer having that customerId in the database
    ==> An error message will be displayed saying  "Customer not found with Id 'customerId' "
    with response code 404 (Not Found)
---

## Contact

E-mail: khaoula.ichaoui@gmail.com
Project Link : https://github.com/khaoula-ichaoui/current-account-management-api.git
