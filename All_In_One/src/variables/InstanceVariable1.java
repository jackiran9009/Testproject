package variables;

public class InstanceVariable1 {
		
int a=10;
String fun="sweet";
double to=200;
boolean b=true;
int c;
String d;
double e;
boolean f;
static String m="team";

//if you call instance variable in static method then write static before variable.

public void myMethod()
{
System.out.println(c);
System.out.println(d);	
System.out.println(e);	
System.out.println(f);
System.out.println(a);
System.out.println(fun);
System.out.println(to);
System.out.println(b);
}
public static void myMethod1() {
	System.out.println(m);
	
}
public static void main(String[] args) {
	InstanceVariable1 hj=new InstanceVariable1();
	hj.myMethod();
	InstanceVariable1.myMethod1();
}
}