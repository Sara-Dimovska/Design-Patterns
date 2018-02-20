
public class ChainOfResponsibility {
	public static void main(String[] args) {
		
		Chain chain1 = new Add();
		Chain chain2 = new Sub();
		Chain chain3 = new Multiply();
		
		chain1.setNext(chain2);
		chain2.setNext(chain3);
		
		Numbers request = new Numbers(2,3,"Multiply");
		chain1.handle(request);
	}
}
