Constructor-based or setter-based DI?

Since you can mix constructor-based and setter-based DI, 
it is a good rule of thumb to use constructors for mandatory dependencies and setter methods or configuration methods 
for optional dependencies. Note that use of the @Required annotation on a setter method can be used to make the property 
be a required dependency; however, constructor injection with programmatic validation of arguments is preferable.

The Spring team generally advocates constructor injection, as it lets you implement application components 
as immutable objects and ensures that required dependencies are not null. Furthermore, 
constructor-injected components are always returned to the client (calling) code in a fully initialized state. 
As a side note, a large number of constructor arguments is a bad code smell, implying that the class likely has 
too many responsibilities and should be refactored to better address proper separation of concerns.

Setter injection should primarily only be used for optional dependencies that can be assigned reasonable 
default values within the class. Otherwise, not-null checks must be performed everywhere the code uses the dependency. 
One benefit of setter injection is that setter methods make objects of that class amenable to reconfiguration or 
re-injection later. Management through JMX MBeans is therefore a compelling use case for setter injection.

Use the DI style that makes the most sense for a particular class. Sometimes, when dealing with third-party classes 
for which you do not have the source, the choice is made for you. For example, if a third-party class does not expose 
any setter methods, then constructor injection may be the only available form of DI.