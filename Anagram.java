package assigment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a= "stops";
		int length = a.length();
		String b="potss";
		int length1 = b.length();
		
		if (length==length1) {
			System.out.println("Length of both string are same.");
		}
		
		char[] string1 = a.toCharArray();
		char[] string2 = b.toCharArray();
	
	Arrays.sort(string1);
	Arrays.sort(string2);
	
	if(Arrays.equals(string1, string2) == true) {
		System.out.println("Both strings are Anagram");
	}
	else {
		System.out.println("Both strings are not Anagram");
	}
	}

}
