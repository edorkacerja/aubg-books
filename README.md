# aubg-books

Aubg Books is a Web Service made with Spring and Hibernate. 
It is composed of three Entity tables: Books (title, Author, number of pages, Publishing House) ,  Author(name, biography, nationality) , Publishing House(name, address).
It has the options to add a New book, New Author and New Publishing House. You can also Edit a book, or delete it from the database.
I included a navbar for easy navigation and used some css to make the webpage pretty.
Used Spring MVC and Hibernate for persistence, and MySQL Server.


1. clone the project into your local filesystem.
2. the dependencies are already included (bad practice, i know but I did it because I didn't have enough time to configure maven)
3. open WebContent/WEB-INF/spring-mvc-crud-demo-servlet.xml and configure the database with your own details
4. open myslq workbench and run the creation_script.sql in order to create the tables.
5. run the data_input_script.sql in order to add data to the database.
6. set up apache v7, to work with configuration path of the installation, and Use workspace metadata.
7. add [log4j-1.2.17](http://www.apache.org/dyn/closer.cgi/logging/log4j/1.2.17/log4j-1.2.17.zip) to  your-tomcat-installation-path/lib directory.
8. start tomcat
9. navigate to http://localhost:8080/first-test-project 

