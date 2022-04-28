package polymorphismRun;

public class Icecream extends Panipuri {
       void eat()
       {
    	   System.out.println("i want to eat icecream");
       }
       public static void main(String[] args) {
	//	Icecream a=new Panipuri();        //error
    	   
	/*	Panipuri a=new Icecream();
		a.eat();    */        //calling icecream

    	   Icecream a=new Icecream();
    	   a.eat();
    	   Panipuri b=new Panipuri();
    	   b.eat();
	}
}
