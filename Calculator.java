package assigment;

public class Calculator {
	int a,b;
	double c;
	float d;
	
	public void add(int num1, int num2, int num3)
	{
		a= num1+num2+num3;
		System.out.println("additon: "+a);
	}

    public void sub(int num1, int num2)
    {
		b= num1-num2;
		System.out.println("subraction: "+b);
	}
	
    public void mul(double num1,double num2)
    {
		c= num1*num2;
		System.out.println("product: "+c);
	}
    
    public void divide(float e,float f)
    {
		d= e/f;
	    System.out.println("division: "+d);
	}
    
    public static void main(String[] args) {

    	calculator cal= new calculator();
    	cal.add(12,3,24);
    	cal.sub(18,7);
    	cal.mul(4.38,10);
    	cal.divide(12.4f,2.7f);
	}
    
}
