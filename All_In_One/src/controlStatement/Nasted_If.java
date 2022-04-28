package controlStatement;

public class Nasted_If {
public static void main(String[] args) {
	System.out.println("welcome blood donation camp");
	int age=14;
	int weight=35;
	if(age>=18)
	{
		System.out.println("condition 1 satisfied");
		if(weight>45)
		{
			System.out.println("condition 2 satisfied");
		}
	}
	else
	{
		System.out.println("your not able to donate the blood");
	}
}
}
