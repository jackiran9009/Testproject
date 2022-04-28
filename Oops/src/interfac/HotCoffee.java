package interfac;

public class HotCoffee implements Milk,Coffee,Sugar,Chocolate {
public static void main(String[] args) {
	HotCoffee a = new HotCoffee();
	a.addmilk();
	a.addsugar();
	a.addcoffee();
	a.addchocolate();
}
	
	public void addchocolate() {
		System.out.println("add chocolate in the coffee");
		System.out.println("now the drink is ready to serve");
	}

	
	public void addsugar() {
		System.out.println("add sugar in the milk");
		
	}

	
	public void addcoffee() {
		System.out.println("add 1 teaspoon of coffee");		
	}

	
	public void addmilk() {
	System.out.println("take a hot milk in a glass");
		
	}

}
