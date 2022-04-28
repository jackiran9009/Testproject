package abstraction;

public class Car extends Fuel {


	public void petrol()
	{
        System.out.println("car petrol is being filled in car");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.petrol();
		c.ready();
		                       //both ways to call method are possible
		
		Fuel f=new Car();
		f.petrol();
		f.ready();
	}
      
}
