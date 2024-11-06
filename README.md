# Lab Assignment 20

In this lab you will practice working with inheritance.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Inheritance

**Inheritance** is an important concept of OOP, it refers to the process of a class inheriting (receiving) attributes and/or methods from another class. Why use inheritance?

When creating a new class you may realize you're creating the exact same methods and attributes another class already has.

**For Example:**
```java
class Bird {
	public float beak_size;
	public float wing_span;
}

class Falcon {
	public float beak_size;
	public float wing_span;
	public float talon_size;
}
```

As you can see, class `Falcon` has two attributes: `beak_size` and `wing_span`, that class `Bird` already has. To make our code more efficient, we can instead **inherit** those attributes from `Brid` to `Falcon`. We can do this using the `extends` keyword in the following format.

&emsp;**Super_Class *extends* Sub_Class**

**For Example:**
```java
// Super_Class
class Bird {
	public float beak_size;
	public float wing_span;
}

// Sub_Class
class Falcon extends Bird {
	public float talon_size;
}
```

The class that will pass on its attributes and/or methods is referred to as the **Super Class** and the class receiving them is referred to as the **Sub Class**.

To learn more about inheritance in Java visit: https://www.w3schools.com/java/java_inheritance.asp

## Your Assignment

### Animal Classification

For this assignment you are provided with 6 classes: `Animal`, `Crocodile`, `Lion`, `Ostrich`, `SaltwaterCrocodile` and `Zebra`. 

Refactor (improve) the code inside the classes to make them more efficient using **inheritance**

**Hint:** Start by identifying the Super Class first.

After refactoring your code, each class should still perform the same as it did before.

**Test Your Code:**

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!