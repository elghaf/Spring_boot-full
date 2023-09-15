# Adapter Design Pattern : 
Intent: 
- Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldnt otherwise because of incompatible interface.
- Wraps around an existing object and gives it a new interface to communicate with the core object.

problem:
-Imagine we had a two different entities named Human and ROBOT each could have different subtypes like Flying ROBOT which is a subtype of robot or Hunter which is a subtype of Human.
- after quite sometime we have decided to add a new entity is called Human-like-robot, meaning its core is a robot but it behave like a Human.
Solution : 
- there are 2 different approaches to tackle this problem:
  - add a base class(or interface) called Entity and make both human and robot extend (or implement) the base class.