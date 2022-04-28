package controlStatement;

public class If_Else_If_Statement {
public static void main(String[] args) {
	int money=100000;
	if(money>3000 && money<=10000)
	{
		System.out.println("i will buy a smart phone");
	}
	else if(money>10000 && money<=30000)
	{
		System.out.println("i will buy a bycycle");
	}
	else if(money>30000 && money<=100000)
	{
		System.out.println("i will buy a laptop");
	}
	else
	{
		System.out.println("insufficient money");
	}
}
}
