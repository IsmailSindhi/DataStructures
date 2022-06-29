package array;
import java.util.Stack;
public class Stack_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  creating a stack
		Stack<String> animal = new Stack<>();
//		Stack<Integer> even = new Stack<>();
		
		animal.push("cat");
		animal.push("rabit");
		animal.push("tiger");
		animal.pop(); 
		
		System.out.println(animal.search("cat"));

		System.out.println("Full stack" + animal);
		System.out.println("peek element is -- "  + animal.peek());
	}
//	Create a stack of String class having elements of 
//	currency of any five countries.
	
//	Print a stack when it has 3 elemnts
//	push 2 more elements and Print when stack is full
//	pop 3 elemetns and print stack
//	delete all elements of stack and print it
	
//	Create a stack of mobile phones brand names
//	Push 5 elements apple , samsung, oppo, LG and Nokia
//	print the top of stack
//	serach the position of oppo and print its index
//	print top of stack
//	pop one element
//	print the stack 
	
	
}
