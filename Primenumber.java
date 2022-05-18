package week1.day2;

public class Primenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int X =13;
		int X= 14;
		int flag=0;
		if (X== 0 || X== 1) {
			System.out.println("It's a PrimeNumber");
		} 
		else 
		{
			for (int i=2; i<X; i++) 
			{
				if (X%i == 0)
				{
					System.out.println("Not a PrimeNumber");
					flag=1;
					break;
				}			
			}
			if (flag==0)
			{
				System.out.println("It's a PrimeNumber");
			}
		}	
	}
}


