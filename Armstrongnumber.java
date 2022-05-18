package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		int input = 155;
		int num = input;
		//{1*1*1}+{5*5*5}+{3*3*3}=153
		//for 43={4*4}+{3*3} sum of cube of digits
		int output =0;
		while (input>0) {
			int rem = input % 10;
			output = output + (rem * rem * rem);
			input = input/10;
			System.out.println(input);
		}
		System.out.println(output);
		//here output is sum of cube of input
		System.out.println(input);
		if(num == output) {
			System.out.println("Armstrong Number");
		}
		else 
		{
			System.out.println("not an Armstrong Number");
		}


	}

}
