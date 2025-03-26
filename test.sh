# Comile java code
javac -cp "./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" -d ./bin ./src/*.java ./src/animals/*.java
# Run test
java -cp "./bin:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar:" org.junit.runner.JUnitCore AnimalsTest