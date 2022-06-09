package array;
//import java.util.Stack;

class Stack{
//	store elements of stack
	private int arr[];
	private int top;
//	total capacity of stack
	private int capacity;
	
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x) {
//		Step one
//		Cheak conditon if stack is full
		if(isFull()) {
			System.out.println("Stack is full");
			System.exit(1);
		}
//		Step two	
//		Insert element
		System.out.println("Inserting elemet"+x);
		arr[++top] = x;
	}
	
	public Boolean isFull() {
		return top == capacity - 1;
	}
	
	public void printStack() {
		for(int i = 0; i <= top; i++) {
			System.out.print(arr[i]+ ", ");
		}
	}

}



public class StackExample {

	public static void main(String[] args) {
//		Creating stak object
		Stack numberStack = new Stack(10);
		numberStack.push(10);
		numberStack.push(20);
		numberStack.push(30);
		numberStack.push(40);
		numberStack.push(50);
		numberStack.push(60);
		numberStack.printStack();
		
	}
}
