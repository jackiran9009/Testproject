package controlStatement2;

public class Nested_If {
public static void main(String[] args) {
	System.out.println("welcom blood donation camp");
	int age=21;
	int weight=60;
	if(age>=18)
	{
		System.out.println("condition 1 satisfied");  //age>=18 then execute this
		if(weight>=50)
		{
			System.out.println("condition 2 satisfied"); //weight>=50 then execute this
			System.out.println("you are eligible to donate blood");
			}
		}
	else
		System.out.println("your age is not valid to donate the blood");
}
}
