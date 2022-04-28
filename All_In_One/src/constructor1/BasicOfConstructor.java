package constructor1;

public class BasicOfConstructor {
String name;
int weight;
BasicOfConstructor()       //constructor name same as class name    
{
	name="kiram";
	weight=74;
	System.out.println("name is " +name+ " weight is " +weight);
}
public static void main(String[] args) {
	new BasicOfConstructor();    //no need to create an object
}
}
