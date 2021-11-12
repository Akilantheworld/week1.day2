package week1.day2;

public class AssignmentCalculator {

	public void  add(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("Addition of result is = " +d);
	}
	
	public void sub(int e,int f)
	{
		int g= e-f;
		System.out.println("Substraction of result is = " +g);
	}
	
	public void mul(double m,double n)
	{
		double o= m*n;
		System.out.println("Multiplication of result is = " +o);
	}
	
	public void div(float x, float y)
	{
		float z= x/y;
		System.out.println("Division of result is = " +z);
	}
	public static void main(String[] args) {

		AssignmentCalculator calc = new AssignmentCalculator();
		calc.add(1, 2, 3);
		calc.sub(10, 5);
		calc.mul(15, 2);
		calc.div(21, 7);
	
	}

}
