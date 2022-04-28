package variables;

public class LocalVariable2 {
public static void nj()
{
	char c='p';
	System.out.println(c);	
}
public void nj1()
{
	int s=20;
	System.out.println(s);
}
public static void main(String[] args) {
	nj();
	LocalVariable2 n1=new LocalVariable2();
	n1.nj1();
}


}
