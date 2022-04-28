package logical;

public class Swap2Number {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c;
	System.out.println("before swap "+a+" <-----> "+b);
	c=b;
	b=a;
	a=c;
	System.out.println("after swap "+a+" <-----> "+b);
}
}
