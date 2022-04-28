package dataTypes;

public class All_In_One {
	//primitive data types
boolean a=true;
byte b=127;
short c=32767;
int d=214748369;
long e=922337203685477580L;
float f=234.45f;
double g=20.1;
//non primitive data types
String h="camera@250000rs";
public void myCall()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
}
public static void main(String[] args) {
	All_In_One sm = new All_In_One();
	sm.myCall();
}
}