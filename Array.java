package array;
import java.util.Arrays; 
public class Array {
	// Function to insert x in arr at position pos
	private static int[] insert(int[] a, int key, int index) {
	    int[] result = new int[a.length + 1];
	 
	    for (int i = 0, j = 0; i < a.length; i++, j++)
	    {
	        if (i == index)
	        {
	            result[j] = key;
	            j++;
	        }
	        result[j] = a[i];
	    }
	 
	    return result;
	}
    // Driver code
    public static void main(String[] args)
    {
 
        int n = 10;
        int i;
 
        // initial array of size 10
        int arr[]
            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
        // print the original array
        System.out.println("Initial Array:\n"
                           + Arrays.toString(arr));
 
        // element to be inserted
        int x = 50;
 
        // position at which element
        // is to be inserted
        int pos = 5;
 
        // call the method to insert x
        // in arr at position pos
        arr = insert(arr, x, pos);
 
        // print the updated array
        System.out.println("\nArray with " + x
                           + " inserted at position "
                           + pos + ":\n"
                           + Arrays.toString(arr));
    }
}

