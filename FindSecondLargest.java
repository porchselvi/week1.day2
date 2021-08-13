package assigment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
	
		int data[]= {3,2,11,4,6,7};
		int size= Array.getLength(data);
		Arrays.sort(data);
		int secLar= data[size-2];
		System.out.println("2nd largest element is "+ secLar);

	}
	
}
