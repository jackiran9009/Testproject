package exception;

public class TryFinallyBlock {
public static void main(String[] args) {
	try
	{
	System.out.println("lets begin");
	int a=10;
	int b=0;
	System.out.println(a/b);
	}
	finally
	{
		System.out.println("program has completed successfully");
	}
}
}
