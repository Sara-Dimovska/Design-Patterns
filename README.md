# Design-Patterns

- Behavioral Design Patterns:
	- Chain of Responsibility: this type usually uses linked list od "handlers" or chain of nodes that handles particular request.Client 
      passes a request to a group of linked objects and expects to be proceed/solved from one of them. If the node/handler cannot handle         the request it passes to his next node/object in the chain, therefore Chain of Responsibility.
	- Strategy: multiple algorithms/options that can  be used interchangeably, and we let the client application pass the algorithm.For an example, we have different modes of transportation(by car,bus or train) and the traveler chooses the Strategy based on comfort,time and cost.
