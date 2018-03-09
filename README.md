# Spring Boot JPA Demo Database Initialisation
This populates the database with more convincing fake data, using the excellent [Java Faker](https://github.com/DiUS/java-faker).

## Step 0 - Create a CustomerDB
Use the database flavour of your choice, I use MySQL:
```
cf create-service p-mysql 100mb CustomerDB
```

## Step 1 - Compile and push it
```
mvn package -DskipTests
cf push
```

## Step 2 - Initialise the database
You can specify how many records to add:

```
% curl "http://jpa-demo-database-init.mycfapps.domain?count=50"
Created 50 database entries
```

## Step 3 - Carry on with the demo
Use this database for any demos you do for JPA. You can delete this app
