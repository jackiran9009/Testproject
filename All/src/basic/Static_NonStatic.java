package basic;

public class Static_NonStatic {
public static void method1()
{
	System.out.println("static method");
}
public void method2()
{
	System.out.println("non static method");
}
public static void main(String[] args) {
	Static_NonStatic.method1();        //we can call without object to static method
	Static_NonStatic obj=new Static_NonStatic();  //we need to create object to call non static method 
	obj.method2();    //
}
}
