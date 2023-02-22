## Unit Testing and Coverage Example
Example app on unit testing, code coverage, and continuous integration (CI) pipeline.

[![cpit251](https://circleci.com/gh/cpit251/unit-testing-coverage-demo.svg?style=svg)](https://app.circleci.com/pipelines/github/cpit251/unit-testing-coverage-demo)


### Usage
Below are the maven commands that you need to know in order to build, test, and package a java maven project.

```shell
# Run tests and generate code coverage report
mvn test
# Compile and run
mvn compile exec:java -Dexec.mainClass="org.example.App"
# Generate jar file
mvn package
# Run jar file
java -jar target/unit-testing-coverage-demo-0.1.0-SNAPSHOT.jar
```

[https://cpit251.github.io/notes/continuous-integration](https://cpit251.github.io/notes/continuous-integration)
[https://cpit251.github.io/notes/unit-testing](https://cpit251.github.io/notes/unit-testing)