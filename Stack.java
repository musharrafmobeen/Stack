public class Stack {
	//Variable Declaration
	private Node  top, bottom;
	private Integer sizeOfStack;
	
	
	//Constructor
	public Stack() {
		top = null;
		bottom = null;
		sizeOfStack = 0;
	}
	
	
	//Function to add data to a Stack
	public void push(Object data) {
		Node previousTop = top;
		top = new Node();
		top.setData(data);
		if(isEmpty()) {
			bottom = top;
		}
		else {
			top.setNext(previousTop);
		}
		sizeOfStack++;
		System.out.println("Data : "+ data +" Has Been Added");
	}
	
	
	//Function to Remove and return data from a top of Stack
	public Object pop() {
		Object data = null;
		if(!isEmpty()) {
			data = top.getData();
			top = top.getNext();
			System.out.println("Data : "+ data +" Has Been Removed");
		}
		else {
			top = null;
			bottom = null;
			System.out.println("Queue is Already Empty");
		}
		return data;
	}
	
	
	//Return top of Stack
	public Node top() {
		return top;
	}
	
	
	//Return bottom of Stack
	public Node bottom() {
		return bottom;
	}
	
	
	//Show all data present in the Stack
	public void showAllData() {
		Node newTop = top;
		if(newTop != null) {	
			System.out.println(newTop.getData());
			
			while(newTop.getNext() != null) {
				System.out.println(newTop.getNext().getData());
				newTop = newTop.getNext();
			}
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	
	
	//Check if Stack is Empty
	public boolean isEmpty(){
		return sizeOfStack == 0 ? true : false;
	}
	
}
