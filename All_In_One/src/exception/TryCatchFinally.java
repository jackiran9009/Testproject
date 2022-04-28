package exception;

public class TryCatchFinally {
public static void main(String[] args) {
	   try
	   {
		   System.out.println("lets begin");
		   int a=10;
		   int b=0;
		   System.out.println(a/b);
	   }
	   catch(ArithmeticException e)   //child
	   {
		   e.printStackTrace();
		   System.out.println("ajdfaj");
	   }
	   finally
	   {
		   System.out.println("program has completed successfully");
	   }
}
}
