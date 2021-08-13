package assigment;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		 int a[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrayLength= a.length;
		System.out.println("Length of Array: "+arrayLength);
	
	for (int count = 0; count < a.length; count++) {
		for (int i = count+1; i < a.length; i++) {
			if (a[count]== a[i]) {
				System.out.println(a[count]);
			}
		}
		
	}
	}

}
