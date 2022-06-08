package array;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		int[] a = new int[10]; // Crate array
		for(int i=0;i < a.length; i++)
			a[i] = keybord.nextInt();

		System.out.println(Arrays.toString(a));
	}

}
// mehtod
// object
// class
// packgae
// interface
