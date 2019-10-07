# Capstone
This is a project for building a game store application using Spring Boot and Spring MVC. 
Requirements/Features

This system must manage the inventory of video games, game consoles, and t-shirts
Your REST API must allow the end user to:

Games:
Perform standard CRUD operations for Games
Search for Games by Studio
Search for Games by ESRB Rating
Search for Games by Title
You must create a separate DAO for Games

Consoles:
Perform standard CRUD operations for Consoles
Search for Consoles by Manufacturer
You must create a separate DAO for Consoles

T-Shirts:
Perform standard CRUD operations for T-Shirts
Search for T-Shirts by Color
Search for T-Shirts by Size
You must create a separate DAO for T-Shirts

Purchasing Items:
User should be able to purchase items in inventory by supplying the following information to the endpoint:
Name
Street
City
State
Zip
Item Type
Item ID
Quantity

The endpoint returns invoice data based on the invoice table below.
All invoice calculations must be done in the Service Layer.
You must create a DAO for both taxes and processing fees.

Features and Solution:

Initialized the project using start.spring.io
The solution includes a DAO, utilized JdbcTemplates and Prepared Statements.
The REST API was documented with Swagger.
REST API accepted and returned data in JSON format wherever appropriate.
Designed using draw.io include a Service Layer
Implemented ControllerAdvice to handle exceptions and returned proper HTTP status codes and data when exception occur. 
This include handling all violoations of business rules
Managed project work in Pivotal Tracker, created stories and epics.
Estimated the work using story points
Used a Test Driven Development approach (inluding Red/Green/Refactor) for the code
Used JUnit for unit and integration tests
Implemented unit test suite that utilized mock objects. 
Utilized JSR303 for input validations.
