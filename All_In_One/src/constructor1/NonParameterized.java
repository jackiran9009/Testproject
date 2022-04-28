package constructor1;

public class NonParameterized {
NonParameterized()     //also called zero argument constructor n non parameterized constructor
{
	System.out.println("simple");
}
public static void main(String[] args) {
	new NonParameterized();  // we can also call to constructor----classname objReferanceVar = new constructorname
}
}
