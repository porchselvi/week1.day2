package assigment;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]+1 != arr[i+1]) {
		    System.out.println("Missing Element: ");
			System.out.println(arr[i]+1);
			break;
		    }
		}
	}

}
