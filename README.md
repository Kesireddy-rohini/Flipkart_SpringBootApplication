# FlipkartInventory

A simple Spring Boot project to manage products for a Flipkart-like store. This project demonstrates CRUD operations (Create, Read, Update, Delete) using Spring Data JPA and MySQL.

## Features

- Get application name  
- Get a list of products  
- Get product quantity  
- Add a new product  
- Get product by ID  
- Delete product by ID  
- Update product by ID  
- Get all products  

## Tech Stack

- Java 17  
- Spring Boot 3.5.5  
- Spring Data JPA  
- MySQL  
- Maven  

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/appName` | Get application name |
| GET | `/productList` | Get a list of products |
| GET | `/productListQuantity` | Get product quantities |
| POST | `/saveProduct` | Add a new product |
| GET | `/findProductById/{productId}` | Get a product by ID |
| DELETE | `/deleteProductById/{productId}` | Delete a product by ID |
| GET | `/getAllProducts` | Get all products |
| PUT | `/updateProduct/{productId}` | Update a product by ID |

## Sample JSON for POST/PUT


{
  "productName": "Laptop",
  "productQuantity": "3"
} 
## Database Configuration

Update the `application.properties` file with your MySQL credentials:

```properties
# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate (JPA) Properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Server Port
server.port=8080
