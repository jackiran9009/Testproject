package typesOfMethod;

public class StaticMethod {
	public static void myMethod()
	{
		System.out.println("Im inside the method");
	}
	
	public static void main(String[] args) {
		StaticMethod.myMethod();
	
	}
}

//1]A static method has a static keyword.
//2]Static method can be called without creating an object.
//3]Static method will be created inside class body n outside the main method.
//4]Static method can be called using(ClassNane.methodname() ).
//5]Method name can be anything as per the requirement.
