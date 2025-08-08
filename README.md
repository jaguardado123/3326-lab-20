# Lab Assignment 20

In this lab you will practice working with inheritance.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Inheritance

**Inheritance** is an important concept of OOP, it refers to the process of one class getting access (extending) to another class to use its attributes and/or methods. Why use inheritance?

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

As you can see, class `Falcon` has two attributes: `beak_size` and `wing_span`, that class `Bird` already has. To make our code more efficient, we can instead have `Falcon` **inherit** those attributes from `Brid`. We can do this using the `extends` keyword in the following format.

&emsp;**Sub_Class *extends* Super_Class**

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

To learn more about inheritance in Java visit: https://www.w3schools.com/java/java_inheritance.asp and https://www.programiz.com/java-programming/inheritance

## Your Assignment

### Animal Classification

For this assignment you are provided with 5 classes: `Animal`, `Lion`, `Zebra`, `Crocodile`, and `SaltwaterCrocodile`. 

Each class should have the following **public** memebers:

**Animal:**
- species (String), genus (String), lifespan (int)
- about() -> should print out all attributes.

**Lion:**
- species (String), genus (String), lifespan (int), claw_size (float)
- about() -> should print out all attributes.

**Zebra**
- species (String), genus (String), lifespan (int), hoof_size (float)
- about() -> should print out all attributes.

**Crocodile**
- species (String), genus (String), lifespan (int), bite_force (float)
- about() -> should print out all attributes.

**SaltwaterCrocodile**
- species (String), genus (String), lifespan (int), bite_force (float), length (float)
- about() -> should print out all attributes.

A lot of repeating attributes and methods right? See how you can use inheritance to shorten your code and avoid repeating any code. **Hint:** You may be able to use *chain inheritance* somewhere here.

Run the test below to test your code.

**Test Your Code:**

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_20.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
