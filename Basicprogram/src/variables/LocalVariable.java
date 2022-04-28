package variables;

public class LocalVariable {
public void myMethod()
{
	int a=20;
	int b=55;
	System.out.println(a);
	System.out.println(b);
}
public void myMethod1()
{
	String a="price";
	boolean b=true;
	System.out.println(a);
	System.out.println(b);
}
public static void myMethod2()
{
	double c=55;
	System.out.println(c);
	
}
public static void main(String[] args) {
	LocalVariable hp=new LocalVariable();
	hp.myMethod();
	hp.myMethod1();
	LocalVariable.myMethod2();
}
}
