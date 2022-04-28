package abstraction;

public class Car extends Fuel{

	
	public void petrol() {
          System.out.println("car petrol is being filled in car");		
	}
	public static void main(String[] args) {
		Car a = new Car();
		a.petrol();
		a.raady();
		
		Fuel b = new Car();
		b.petrol();
		b.raady();
		
		
	//	Fuel c = new Fuel();         //we cannot call by this object creation
		
	}

}
