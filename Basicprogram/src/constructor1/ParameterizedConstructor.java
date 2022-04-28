package constructor1;

public class ParameterizedConstructor {
	ParameterizedConstructor(int a)
	{
		System.out.println("1 argument/parameterized constructor");
		System.out.println("---------------------------------");
	}
	ParameterizedConstructor(int a,int b)
	{
		System.out.println("2 argument/parameterized constructor");
		System.out.println("no.of arguments are different");
		System.out.println("-------------------------------");
	}
	ParameterizedConstructor(int a,String b)
	{
		System.out.println("no.of datatypes are different");
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		new ParameterizedConstructor(1);
		new ParameterizedConstructor(2,3);
		new ParameterizedConstructor(4,"ki");
	//	ParameterizedConstructor np=new ParameterizedConstructor(2);
	//	ParameterizedConstructor sm=new ParameterizedConstructor(3,4);
	//	ParameterizedConstructor lo=new ParameterizedConstructor(5,"z");
	}
}
