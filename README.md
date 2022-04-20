# Amazon shopping test suits
Test suites to run add one or multiple items to Amazon shopping app 

## Demo
FIXME

## Pre requisites
 - Java 8
 - Maven
 - Android emulator 
 - Appium Server

## Compile & Run
``` 
mvn clean compile
```

Run the required classes in `com.github.amazon.suites.tests.*` package

## Project structure
```
.
├── README.md
├── pom.xml
└── src
    ├── amazon-shopping-24-7-0-100.apk
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── github
    │   │           └── amazon
    │   │               └── suites
    │   │                   ├── pages
    │   │                   │   ├── HomePage.java
    │   │                   │   ├── ItemViewPage.java
    │   │                   │   ├── SearchResultsPage.java
    │   │                   │   └── WelcomePage.java
    │   │                   ├── tests
    │   │                   │   ├── MultipleItemsToCartTest.java
    │   │                   │   └── SingleItemToCartTest.java
    │   │                   └── utils
    │   │                       ├── DriverUtils.java
    │   │                       ├── Log.java
    │   │                       └── TimeUtils.java
    │   └── resources
    └── test
        └── java

```

