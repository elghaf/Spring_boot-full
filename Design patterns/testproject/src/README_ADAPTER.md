# Adapter DESIGN Pattern:
intent:
convert the interface of a class into another interface clients expect, adapter lets classes work together that couldnt otherwise because of incompatible interface.

# Problem:
- Imagine we had a two different entities named Human and Robot each could have different subtypes like Flying Robot which is a subtype of Robot or Hunter which is a subtype of Human.

- After quite sometime we have decided to add a new entity which is called Human-Like-Robot meaning its core is a Robot but it behaves like a Human.

# Solution:
There are 2 different approaches to tackle this problem:
Add a base class( or interface) called Entity and make both Human and Robot extend (or implement) the base class.

Use Adapter design pattern. With this in mind; we need to define a new class called HumanLikeRobot which contains a Robot as a core and also extends Human and map the behaviours of a Human to a behaviour of a Robot.