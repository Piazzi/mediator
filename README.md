<div align="center">
  <h1> MEDIATOR  </h1>
</div>

# Code

Simple project representing the mediator design pattern. 

# Definition

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

![image](https://user-images.githubusercontent.com/40416044/153220139-83c66c7c-2d6e-4067-a326-10123ae23f14.png)

In object-oriented programming, programs often consist of many classes. Business logic and computation are distributed among these classes. However, as more classes are added to a program, especially during maintenance and/or refactoring, the problem of communication between these classes may become more complex. This makes the program harder to read and maintain. Furthermore, it can become difficult to change the program, since any change may affect code in several other classes.

With the mediator pattern, communication between objects is encapsulated within a mediator object. Objects no longer communicate directly with each other, but instead communicate through the mediator. This reduces the dependencies between communicating objects, thereby reducing coupling.

![image](https://user-images.githubusercontent.com/40416044/153220293-9b28770d-f6b5-4586-af03-213664ee9c07.png)


Source: <a href="https://en.wikipedia.org/wiki/Mediator_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/mediator"> Refactoring Guru </a>
