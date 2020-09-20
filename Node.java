public class Node {
	//Variable Declaration
	private Object Data;
	private Node Next;
	
	
	//Constructor
	public Node() {
		Data = null;
		Next = null;
	}
	
	//Getters And Setters//
	public Object getData() {
		return Data;
	}
	
	
	public void setData(Object data) {
		Data = data;
	}
	
	
	public Node getNext() {
		return Next;
	}
	
	
	public void setNext(Node next) {
		Next = next;
	}
	////
}
