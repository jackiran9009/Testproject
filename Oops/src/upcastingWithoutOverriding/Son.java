package upcastingWithoutOverriding;

public class Son extends Father{
       int age=25;
       public void job()
       {
    	   System.out.println("son has own job");
       }
       public void bike()
       {
    	   System.out.println("son has own bike");
       }
       public static void main(String[] args) {
		  Father f=new Son();          //without method overloading me sirf superclass ke hi method call hote hai
		  f.form();
		  f.house();
	}
}
