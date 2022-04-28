package constructor1;

public class ParameterizedConstructor_2 {
//int a;
//int b;
ParameterizedConstructor_2(int c)
{
	int a=100;
	int b=200;
	System.out.println(a+"-----"+b);
}
ParameterizedConstructor_2(int d,String k)
{
	int a=1000;
	int b=2000;
	System.out.println(a+"-------"+b);
}
public static void main(String[] args) {
	new ParameterizedConstructor_2(20);
	new ParameterizedConstructor_2(3,"l");
}
}
