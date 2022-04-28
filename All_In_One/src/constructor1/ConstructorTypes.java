package constructor1;

public class ConstructorTypes {
	ConstructorTypes()
	{
	System.out.println("zero argument constructor");	
	}
	ConstructorTypes(int a)
	{
		System.out.println("one argument constructor type int");	
	}
	ConstructorTypes(String a)
	{
		System.out.println("one argument constructor type String");
	}
	public static void main(String[] args) {
		new ConstructorTypes();
		new ConstructorTypes(45);
		new ConstructorTypes("india");
	}

}
