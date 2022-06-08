package array;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int num [] = {69,72,95,27,96,64,105};
//		Bubble sort logic
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = 0; j < num.length - i -1; j++) {
// 				checking conditions
				if (num[j] > num[j+1]) {
//				swaping of elements
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;		
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
