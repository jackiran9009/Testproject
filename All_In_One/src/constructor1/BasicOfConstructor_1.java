package constructor1;

public class BasicOfConstructor_1 {
String newyork;
int distance;
BasicOfConstructor_1()
{
	newyork="hydrabad";
	distance=180;
	System.out.println("from me distance fo "+newyork+" is " +distance+ " km");
}
BasicOfConstructor_1(int a)
{
	System.out.println("by road");
}

public static void main(String[] args) {
	new BasicOfConstructor_1();
	new BasicOfConstructor_1(33);
}
}
