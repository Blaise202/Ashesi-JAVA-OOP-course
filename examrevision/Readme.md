# Concepts to cover

## 1. Inheritance

**Inheritance** is a mecanism where one class acquires properties and behaviors of another class, astablishing a parent-child or "is-a" relationship.

### importance of inheritance

    1. Promotes data reusability
    2. Improves Maintainability
    3. Supports polymorthism

## 2. Polymorphism

**Polymorphism** is the ability of an object to take on many forms, allowing a single action or method name to be performed in different ways depending on the object's type or the context of the call.

_or_

**Polymorphism** is the ability to associate many meanings to one method name.

**Incapsulation** means the data and methods are combined in a single unit, (i.e a class object) which hides the implementation details.

    1. Accessor methods (getters): allow the programmer to obtain the value of the object's instance variable
    2. Mutator methods (setters): allow the programmer to change the value of the object's instance variable

## 3. Interfaces

**An interface** is a class like consruct for defining common operations for objects

_A class implements an interface by providing code for each method declared by the interface._

### Rules of interfaces:

    1. All methods are automatically public abstract
    2. Variables inside interfaces are public static final
    3. Interfaces cannot have constructors
    4. One class can implement multiple interfaces

## 4. Methods Overloading VS Overriding

**Methods Overloading** means defining methods of the same name but different paramenter list or return type

**Method Overriding** is when a subclass provides its own implementation for a method that is already in its superclass / To provide an new implementation for a method in the subclass

## 5. Constructors

**A constructor** is a special method used for initialising objects. When an object is created, a constructor is created

### types of constructors

1. Default Constructor: _If you do not explicitly define any constructor in your class, the Java compiler automatically provides a default, no-argument constructor during compilation. This constructor initializes all instance variables with default values (e.g., 0 for integers, false for booleans, null for objects)._

2. No-Arg Constructor (User-Defined): _This is a constructor explicitly written by the programmer that takes no arguments. It allows the programmer to define custom initialization logic, which the default compiler-generated one does not._

3. Parametarized constructor: _This type of constructor accepts one or more parameters. It is used to initialize an object with specific, user-defined values passed during object creation._

4. Copy Constructor: _Java allows creating a constructor that takes an object of the same class as an argument to create a new object with the same values (a copy)_

### Rules of building constructors

    1. Constructor has the same name as the class
    2. It has no return type
    3. It is called automatically on object creation

## 6. The super keyword

The keyword **super** refers to the superclass and can be used to invoke superclass's methods and constructors

### It can be used in two ways:

    1. To call a superclass constructor
    2. To reference the superclass accessible members
