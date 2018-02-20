
public interface Chain {
	
	public void setNext(Chain next);
	public void handle(Numbers request);
}
