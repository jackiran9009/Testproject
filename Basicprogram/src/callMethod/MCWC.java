package callMethod;

public class MCWC {
	public static void myMethod()
	{
		System.out.println("Im in static method");
	}
   public void myMethod1()
   {
	   System.out.println("Im in non static method");
   }
public static void main(String[] args)
{
	
	MCWC.myMethod();
	MCWC obj = new MCWC();
	obj.myMethod1();
}
}
