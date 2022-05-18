package week1.day2;

public class Calculator {
	public int add (int x, int y)
	{
		int sum = x+y;
		return sum;
	}
	public double sub(double x, double y)
	{
		double sub = x - y;
		return sub;
	}
	public int mul(int x, int y)
	{ int mul = x * y;
	return mul;
	}
	public int div (int x, int y)
	{
		int div = x/y;
		return div;
	}
	public static void main(String[] args) {
		Calculator z=new Calculator();
		System.out.println("addition "+ z.add(2,3));
		System.out.println("difference " + z.sub(4.00, 3.00));
		System.out.println("multiplication " + z.mul(2,3));
		System.out.println("division " + z.div(6, 3));
	}
}
