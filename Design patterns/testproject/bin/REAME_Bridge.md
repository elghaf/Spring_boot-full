# Bridge Design Pattern : 
intent: 
- Decouple an abstraction from its implementation so that the two can vary independently.
- publish interface in an inheritance hierarchy. and bury implementation in its own inheritance hierarchy.
- Beyond encapsulation, to insultation

# Problem : 
In a fantasy world imagine we have different types of vehicles with different type of accelator, for example a submarin uses a propeller as an accelerator mechanism or a space-ship uses Jet as an accelerator mechanism, we need our system to be flexible when we add a new vehicle or we add a new acceleration mechanism, for example we might want some submarine with jet!

# Solution : 
There are two solution : 
