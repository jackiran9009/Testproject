package this_Keyword;

public class UsingThisKeyword {
//int a;
public void fun(int a)
{
	
	System.out.println(a);
	//this a=a;
	
}
public void myMethod(int a)
{
	System.out.println(a);	
}
public static void main(String[] args) {
	UsingThisKeyword t = new UsingThisKeyword();
	t.fun(55);
	t.myMethod(88);
}
}
