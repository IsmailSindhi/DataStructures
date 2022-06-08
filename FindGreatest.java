package array;

public class FindGreatest {

	public static void main(String[] args) {
		int num [] = {40,20,30,60,70,50,10,80,90,100};
		int max = num[0]; // acess first element
//		40     20
//		max > num[i]
		for(int i=1; i < num.length - 1; i++) {
			if (max < num[i]) {
				max = num[i];
			}	
		}
		System.out.println(max);
	}

}
