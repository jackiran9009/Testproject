package exception;

public class MultipleCatchBlock {
public static void main(String[] args) {
	   try 
	   {
		System.out.println("lets begin");
		int a=10;
		int b=0;
		System.out.println(a/b);
	   }
	   catch(ArithmeticException e)  //child
	   {
		   e.printStackTrace();
		   System.out.println("jhfah");
	   }
	   catch(Exception e)    //parent
	   {
		   e.printStackTrace();
		   System.out.println("jkjsdfj");
	   }
}
}
