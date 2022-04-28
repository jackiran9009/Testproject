package constructor;//

public class Parameterized {      //  also called argument constructor
	Parameterized(int a)
	{
		System.out.println("one argument pass");       // we can create multiple constructor by using following conditon
	}                                                  // 1)no.of argument should be different
	Parameterized(int a,int b)                         // 2)no.of datatype should be different 
	{                                                  // 3)sequence of datatype should be different
		System.out.println("two argument pass");
	}
	Parameterized(int a,int b,int c)
	{
		System.out.println("three argument pass");
	}
	Parameterized(String a,boolean c)
	{
		System.out.println("different datatype");
	}
	Parameterized(boolean c,String a)
	{
		System.out.println("differnt sequence of datatype");
	}
	public static void main(String[] args) {
		new Parameterized(2);
		new Parameterized(2,3);
		new Parameterized(4,7,55);
		new Parameterized("ht",true);
		new Parameterized(true,"ht");
	}
	
}
