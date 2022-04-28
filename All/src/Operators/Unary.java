package Operators;

public class Unary {       
public static void main(String[] args) {
	int a=10;               // postfix (expr++) increment
System.out.println(a);      //10
System.out.println(a++);    //10      10+1
System.out.println(a++);    //11      11+1
System.out.println(a);      //12

int b=15;                   // postfix (expr--) decrement
System.out.println(b);      //15
System.out.println(b--);    //15      15-1
System.out.println(b--);    //14      14-1
System.out.println(b);      //13

int c=20;                   // prefix (++expr) increment 
System.out.println(c);      //20       1+20
System.out.println(++c);    //21       1+21
System.out.println(++c);    //22
System.out.println(c);      //22

int d=5;                    // prefix (--expr) decrement
System.out.println(d);      //5        -1+5
System.out.println(--d);    //4        -1+4
System.out.println(--d);    //3
System.out.println(d);      //3
}
}
