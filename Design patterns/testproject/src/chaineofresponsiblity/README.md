# Chain of Responsiblity Design Pattern:

intent : 
- Avoid coupling the sender of request to its receiver by giving more than one object a chance to handle the request. chain the receiving objects and pass the request along the chain until an object handles it.
- Lanch and leave requests with a single processing pipeline that contains many possible handlers.
- An object-oriented linked list with recursive traversal.

## Problem : 
Imagine a web service which handle different types of request and generate a response accordingly. 
for example if a requesst wants a JSON media type as Response format our web-service should respond in JSON format also if anather request wants XML media type as Response our web-service should respond in XML format.
