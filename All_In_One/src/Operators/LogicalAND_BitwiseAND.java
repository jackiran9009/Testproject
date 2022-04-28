package Operators;

public class LogicalAND_BitwiseAND {
public static void main(String[] args) {
	int a=50;
	int b=10;
	
	        //Logical AND (&&)       if both conditions is true then output is true otherwise false
	System.out.println(b<a && a<b);   //true && false = false
	System.out.println(a<b && b<a);   //false && true = false
	System.out.println(a>b && b<a);   //true && true  = true
	    //1)dosen't check second condition if first condition is false
	    //2)it check second condition if first condition is true
	
	
	       //Bitwise AND (&)         if both conditions is true then output is true otherwise false
	System.out.println(a<b & b>a);    //false & false = false
	System.out.println(b>a & a>b);    //false & true  = false
	System.out.println(a>b & b>a);    //true & true   = true
	System.out.println(b<a & a>b);
        //1)it always check both condition whether first condition is true or false
}
}
