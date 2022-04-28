package typesOfMethod;

public class StaticMethod1 {

	public static void theoryOfMethod()
	{
		System.out.print("static method can be called ");
		System.out.println("without creating an object.");
		System.out.print("it can be called using:-\n\n[ClassName.methodName]\nor\n[methodName]\n");
	}
	
	public static void syntax()
	{
		System.out.println("\n-----------------------");
		System.out.print("Syntax of static method\npublic static "+"void methodName()\n{\n}");
		
	}
	public static void theoryOfMethod1()
	{
		System.out.print("A static method has a ");
		System.out.print(""+"");
		System.out.println("static keyward.");
		
	}
	
	public static void main(String[] args) {
		theoryOfMethod1();
		theoryOfMethod();
		//syntax();
	}
}
