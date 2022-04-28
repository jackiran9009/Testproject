package myFirstProject; 

//this is package name.
//right click on src folder->new->package->write package name->click finish
//always start with lower case n second word will be capital.
//it does not contain space in between.
//only "_" "&" "$" these characters are use in it

public class MyIntroInDetail { 
	
	//this is class.
	//right click on package->new->class->write class name.
	//complete code will be written inside class
	//it always start with capital letter.
	//it does not contain space in between.
	//first letter of class cannot be integer value
	//best practice is to not use keywords as class name.
	//to change the name of the class=right click on class name->refactor->rename->write new name->finish
	
	public static void main(String[] args) { 
		
	//this is called main method.
	//public = access specifier         static = keyword
	//void   = return type              main   = method name
	//it is the entry point to start the execution of our program.
	//without main method we cannot run our program.
	//various ways to write main method.
	                //1]static public void main(String[] args)
                    //2]public static void main(String....args)
                    //3]public static void main(String args[])

System.out.println("name=kiran allapure");
System.out.println("address=nanded maharashtra");
}
}
