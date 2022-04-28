package upcastingWithOverriding;

public class Shark extends Animal{
        
	      String name="sharkVar";
	      public void nature()
	      {
	    	  System.out.println("aquatic animal");
	      }
	      public static void main(String[] args) {
			 Animal a=new Shark();
			 a.nature();
			 System.out.println(a.name);
		}
}
