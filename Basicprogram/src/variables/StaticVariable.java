package variables;

public class StaticVariable {
static int m=100;
static int n=50;
public void multi()
{
	int o=m*n;
	System.out.println(o);
	System.out.println(n);	
}
public static void division()
{
	int p=m/n;
	System.out.println(m);
	System.out.println(p);
}
public static void main(String[] args) {
	StaticVariable gh=new StaticVariable();
	gh.multi();
	division();
}
}
