package exception;

public class VariouWayToPrintException {
public static void main(String[] args) {
	try
	{
		System.out.println("lets begin");
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	catch(Exception e)
	{
		e.printStackTrace();  //best way to print exception.....most widely used
		//exception name
		//description
		//stack trace
		System.out.println("==========================================");
		
		System.out.println(e);
		//exception name
		//description
		System.out.println("===========================================");
		System.out.println(e.getMessage());
		//description
	}
	
}
}
