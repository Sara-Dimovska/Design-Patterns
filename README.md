# SOLID Principles

	for building a system that is:
	* easy to maintain
	* easy to extend
	* easy to understand
	* easy to implement
	* easy to extent 
	* easy to explain
	
	
	1. Single Responsibility Principle
	
		Principle about creation. Class/Function should perform only one task or should have only a single responsibility to perform.
		
	2. Open Closed Principle
	 	 
		 Software entities(classes, modules, functions , etc.) should be open fo extension, but closed for modification or in other words, an implementation, once created should be closed for further modification but open for extension.
		 
	3. Liskov Substitution Principle
	
		Implementation(class/function) that use a base class, or in other words consume a service of a base class, must work correctly when the base class object is replaced by a child class(derived class) object.
		
	4. Interface Segregation Principle
	
		This, principle is related to creating an interface for implementation."Client(class implementation interface) should not force to implement interface that they don't use." or in simple words, do not design a big fat interface that forces the client to implement a method that is not requred by it, instead design a small interface and by doing so, the class will only implement the required set of interface(s).
		
	5. Dependency Inversion Principle
	
		"High level modules should not depend upon low level modules. Both should depend upon abstractions.
		Abstractions should not depend upon details. Details should depend upon abstractions."
		
		This principle  says that we need to decouple the system in such a way that the higher level modules will depend on a simple abstraction and will use it. This abstraction will be mapped to some concrete class which will perform the actual operation. 
		
		The best way for not violating this principle is using the **Dependency Inversion Pattern** .

 	reference: https://www.codeproject.com/Articles/1009577/Solid-Principle-In-Detail

# Inversion of Control

	IoC adds one layer of abstraction between the two concrete classes using an interface, but the creation of the concrete class is still inside the higher level class. 
	
	Example:
	
	```C#
	public interface INofificationAction
	{
		public void ActOnNotification(string message);
	}
	
	class EventLogWriter : INofificationAction
	{   
		public void ActOnNotification(string message)
		{
			// Write to event log here
		}
	}
	
	class AppPoolWatcher
	{
		// Handle to EventLog writer to write to the logs
		INofificationAction action = null;

		// This function will be called when the app pool has problem
		public void Notify(string message)
		{
			if (action == null)
			{
				// Here we will map the abstraction i.e. interface to concrete class 
				writer = new EventLogWriter();
			}
			action.ActOnNotification(message);
		}
	}
	
	```
	And that's why a better approach is to use **Dependency injection **
	
# Dependency Injection

	The main idea of dependency injection is to reduce the coupling between classes and move the binding of abstraction and concrete implementation out of the dependent class.
		
	DI can be done in three ways:
		
		1. Constructor injection
		2. Method injection
		3. Property injection
		
	Constructor injection is the mostly used approach when it comes to implementing the dependency injection. If we need to pass different dependencies on every method call then we use method injection. Property injection is used less frequently.
		

# Design Patterns

## Creational Design Patterns: 
	
	* Simple Factory Pattern:
	we have a factory class which has a method that returns different types of object based on given input.But this pattern violates Open Close Principle of SOLID principles.
	
	reference: https://www.codeproject.com/Articles/1131770/Factory-Patterns-Simple-Factory-Pattern
	
	* Factory Method Pattern:
	the problem with preceding pattern is solved with Factory Method Pattern. We have a factory for each product and it implements the base factory interface for creating the product. If we have a new product to add, using this pattern we don't add new condition as we were doing in Simple Factory Pattern, we will create a new product class and a factory that creates that product.
	This pattern is used when we have to create only one kind of products.
	
	reference:https://www.codeproject.com/Articles/1135918/Factory-Patterns-Factory-Method-Pattern
	
	* Abstract Factory Pattern (Factory of Factories):
	Whenever we need to have different kind of related objects. It provides different kind of Factories.Each factory will create a particular kind of related objects.
	


## Structural Design Patterns:

	* Adapter:
	it is used to identify a simple way to realize relationships between entities. It converts the interface os a class into another interface clients expect.Adapter lets classes work togheter that couldn't otherwise because of incompatible interfaces, in other words,Adapter translates the request from the client to the Adaptee.
	


## Behavioral Design Patterns:

	* Chain of Responsibility:
	this type usually uses linked list od "handlers" or chain of nodes that handles particular request.Client 
      passes a request to a group of linked objects and expects to be proceed/solved from one of them. If the node/handler cannot handle         the request it passes to his next node/object in the chain, therefore Chain of Responsibility.
	  
	* Strategy: 
	multiple algorithms/options that can  be used interchangeably, and we let the client application pass the algorithm.For an example, we have different modes of transportation(by car,bus or train) and the traveler chooses the Strategy based on comfort,time and cost.
	


