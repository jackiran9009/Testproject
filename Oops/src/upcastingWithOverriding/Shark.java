package upcastingWithOverriding;

public class Shark extends Animal {
String name="Shark var";
       public void nature()
       {
    	   System.out.println("aquatic animal");
       }
       public static void main(String[] args) {
		Animal a=new Shark();           //this is called upcasting
		a.nature();                  //in overriding upcasting always call subclass method 
	    System.out.println(a.name);
	
	    System.out.println("---------------------------------");
	    
	    Shark b = new Shark();
	    b.nature();
	    System.out.println(a.name);
	    
	    System.out.println("------------------------------");
	    
	    Animal c=new Animal();
	    c.nature();
	    System.out.println(c.name);
	    
       }
}
