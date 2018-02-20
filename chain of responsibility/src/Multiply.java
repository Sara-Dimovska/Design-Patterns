public class Multiply implements Chain{

	Chain next;
	
	@Override
	public void setNext(Chain next) {
		this.next = next;		
	}

	@Override
	public void handle(Numbers request) {
		if(request.getOperation() == "Multiply") {		
			 System.out.println(request.getNum1() + " * " + request.getNum2() + " = "+
					 (request.getNum1()*request.getNum2()) );  
		}
		else {
			System.out.println("Your request cannot be proceed. Only 'Add', 'Sub' and 'Multiply'! ");
		}
		
	}



}
