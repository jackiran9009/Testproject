package typesOfMethod;

public class NonStaticMethod {
	public void myMethod()
	{
		System.out.println("Im inside the non static method.");
	}
	public static void main(String[] args) {
		
		NonStaticMethod obj=new NonStaticMethod();
		obj.myMethod();
	}

}
//							
