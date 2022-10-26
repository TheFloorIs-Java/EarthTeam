# e-commerce api

---
This is a simple backend for an e-commerce site built using Spring Boot. <br>
The application requires jdk-17 and uses Maven to handle dependencies. <br>
`application.yml` contains the Spring Boot Settings<br>
`data.sql` sets the initial database values on startup.<br>

## Install

---
Be sure JDK 17 is installed on your machine then clone the repository with the command:
```
git clone https://github.com/TheFloorIs-Java/EarthTeam
```

## Build

---
Build the application into a FatJar using Maven with:
```
mvn clean install
```
The application can then be run with:
```
java -jar *file/location/here*
```