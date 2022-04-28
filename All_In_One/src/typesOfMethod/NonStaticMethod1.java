package typesOfMethod;

public class NonStaticMethod1 {
	
	public void myMethod()
	{
		System.out.print("we need to an object of a ");
		System.out.println("class for calling"+" non static method.");
	}
   public void syntax()
{
	System.out.println("public void methodName()\n{\n}");
}
   public void myMethod1()
   {
	   System.out.print("this method does not ");
	   System.out.println("contain static keyword.");
   }
   public void myMethod2()
   {
	   System.out.println("making of object :-");
	   System.out.print("ClassName objReferanceVar=new constructor\n");
	   System.out.print("calling of non static method :-\n");
	   System.out.println("objReferanceVar.methodName");
   }
   public static void main(String[] args) {
	   NonStaticMethod1 obj=new NonStaticMethod1();
	   obj.myMethod1();
	   obj.myMethod();
	   obj.syntax();
	   obj.myMethod2();
   }
}
