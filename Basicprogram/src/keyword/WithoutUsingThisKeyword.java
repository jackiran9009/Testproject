package keyword;

public class WithoutUsingThisKeyword {
int a;
public void fun(int f)
{
	System.out.println(a);
}
public void myMethod()
{
	System.out.println(a);
}
public static void main(String[] args) {
	WithoutUsingThisKeyword t = new WithoutUsingThisKeyword();
	t.fun(33);
	t.myMethod();
}
}
