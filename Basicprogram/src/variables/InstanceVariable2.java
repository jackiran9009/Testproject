package variables;

public class InstanceVariable2 {
int a=50;
int b=40;

public void nike()
{
System.out.println(a*b);	
}
String m="new game "+"start ";
String l="pin perfect";
public void puma()
{
	System.out.println(m+l);
}
int c=400/4;
double d=10*50;
public void reebok()
{
	System.out.print(c+d);
}
public static void main (String[] args) {
	InstanceVariable2 j=new InstanceVariable2();
	j.nike();
	j.puma();
	j.reebok();
}
}