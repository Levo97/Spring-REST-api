# Back-end task

Create the following skeleton project, using Spring initializer:

- **Group:** com.___
- **Artifact:** hr
- **Name:** hr
- **Packaging:** Jar
- **Java version:** 11
- **Use the following dependencies:**
    o Spring Boot DevTools
    o Spring Web
    o Rest Repositories
    o Spring Data JPA
    o Lombok
    o JUNIT
    o Liquibase
    o Any other with reason
- **Use H2 in memory DB**

Create the HR schema for the application. Where it’s needed create columns with NOT
NULL.

![image](https://user-images.githubusercontent.com/50501945/194535455-025ee646-7900-45f9-90c5-71dfb3a05c00.png)


The API has to have for the following list:

- **(GET) localhost:8085/API/V1/employees**
    o Gives back all of the records of the table.
- **(GET) localhost:8085/API/V1/dep-emp**
    o Gives back every department with the connected employees.
- **(GET) localhost:8085/API/V1/department?name=?**
    o Filter departments based on name. The data is used in a drop-down, so
       the whole entity is not required.
- **(POST) localhost:8085/API/V1/employees**
    o Creates an employee.
- **(DELETE) localhosts:8085/API/V1/department/:id**
    o Deletes a department based on ID. Set Null to every connected employee’s
       DEP_ID field.

We are working with Rest API, so every communication must be done in JSON structure
between the API and the client.

Bonus tasks for Juniors ( **Mandatory for Mediors and Seniors** ):

- Set the API to be able to handle calls from _localhost:5000_ (CORS).
- **Extend** the existing EMPLOYEES table, using Liquibase, with a Boolean, not null
    column. The column name is: IS_ACTIVE.

Bonus tasks for Mediors ( **Mandatory for Seniors)** :

- Implementing Custom Exception handling.
- Configure the Spring Security. Method level security and different ROLEs are
    needed (ROLE_ADMIN, ROLE_USER) Use JWT communication between the API
    and the client, because the API is stateless. For this task, use the EMPLOYEES
    table.


