package controlStatement2;

public class If_Else_If {
public static void main(String[] args) {
	int money=100001;
	if(money>3000 && money<=10000)   
	{
		System.out.println("i will buy smart phone");     //money = 3001 to 10000 then execute this
	}
	else if(money >10000 && money<=30000)
	{
		System.out.println("i will buy bicycle");    //money = 10001 to 30000 then execute this
	}
	else if(money>30000 && money<=100000)
	{
		System.out.println("i will buy laptop");     //money = 30001 to 100000 then execute this
	}
	else
	{
		System.out.println("i dont need anything");   //money < 3000 or money >100001 then execute this
	}
}
}
