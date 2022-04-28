package controlStatement;

public class Nasted_If_Else {
public static void main(String[] args) {
	System.out.println("even,odd,positive or negative");
	int a=7;
	if(a>0)
	{
		System.out.println("yes no. is positive");
		if(a%2==0)
		{
			System.out.println("yes no. is even");
		}
		else
		{
			System.out.println("yes no. is odd");
		}
	}
	else
	{
		System.out.println("its a negative no.");
	}
}
}
