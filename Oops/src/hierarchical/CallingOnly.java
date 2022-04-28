package hierarchical;

public class CallingOnly {
public static void main(String[] args) {

	 /*	 Animal a = new Animal();
	     a.eat();a    */
 
/*    Animal a = new Dog();
	   a.eat();     */
	
/*	Animal a = new Cat();
	 a.eat();a        */
	
	//Cat a = new Animal();        if objRefVer is of Animal only them we can create object of Animal
	//Dog a = new Animal();        other wise we found error
	
/*	Cat a = new Cat();
	a.eat();
	a.meow();       // or   Cat.meow();    */
	
/*	Dog a = new Dog();
	a.eat();
	a.bark();    // or     Dog.bark();     */
	
	//Cat a = new Dog();         they not connected by extends keyword so found error 
	//Dog a =new Cat();
	
 }
}
