package logical;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=7; 
		//for(int i=1;i<=10; i++)
		int temp=0;
		for(int b=2; b<=a-1; b++) // b=2 2<=6
		{
			if(a%b==0)   //7/2
			{
				temp=1;	
			}
		}
		if(temp==0)
		{
			System.out.println(a+" prime");
		}
		else 
		{
			System.out.println(a+" not prime");
		}
	}
}
