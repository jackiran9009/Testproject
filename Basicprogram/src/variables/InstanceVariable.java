package variables;

public class InstanceVariable {
int ku=12;
String m="hero";
boolean n;
double p;
public void myVariable()
{
	System.out.println(ku);
	System.out.println(m);
	System.out.println(n);
	System.out.println(p);
}
public static void main(String[] args)
{
	InstanceVariable ei=new InstanceVariable();
	ei.myVariable();
}
}
