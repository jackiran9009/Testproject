package Operators;
//
public class LogicalOR_BitwiseOR {
public static void main(String[] args) {
	int a=10;
	int b=5;
	int c=20;
	
	       //Logical OR (||)  if both condition is false then output is false otherwise true
	System.out.println(c>b || b>a);    //true  || false = true
	System.out.println(a<b || b<a);    //false || true  = true
	System.out.println(a<b || b>c);    //false || false = false
	       //1)dosen't check second condition if first is true
	       //2)it check second condition only if first is false
	
	      //Bitwise OR (|)    if both condition is false then output is false otherwise true
	System.out.println(a<b | a<c);     //false | true  = true
	System.out.println(a>b | b>c);     //true  | false = true
	System.out.println(b>a | c<a);     //false | false = false
          //1)it always check both condition whether first condition is true or false
}
}
