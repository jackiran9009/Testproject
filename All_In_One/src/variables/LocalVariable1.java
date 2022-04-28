package variables;

public class LocalVariable1 {
public static void myFuction()
{
	int a=10;
	String b="India";
	boolean c=true;
	double d=100.1;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
public void myFuction1()
{
	int a=20;
	String b="Bharat";
	boolean c=false;
	double d=200.2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);	
}
public static void main(String[] args) {
	LocalVariable1 jk=new LocalVariable1();
	LocalVariable1.myFuction();
	jk.myFuction1();
}
}
