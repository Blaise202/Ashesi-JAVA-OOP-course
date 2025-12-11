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

# 4. Methods Overloading VS Overriding

**Methods Overloading** means defining methods of the same name but different paramenter list or return type

**Method Overriding** is when a subclass provides its own implementation for a method that is already in its superclass / To provide an new implementation for a method in the subclass
