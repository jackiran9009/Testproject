package logical;

public class Fabonacci {
public static void main(String[] args) {
	int a=0;int b=1; int c;
	System.out.print(a+" "+b);
	   for(int f=1;f<=10;f++)
	   {
		   c=a+b;
		   System.out.print(" "+c);
		   a=b;
		   b=c;
	   }
}

}
