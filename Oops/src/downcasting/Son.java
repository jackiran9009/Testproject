package downcasting;//

public class Son extends Father {
       int age=21;
       public void bike()
       {
    	   System.out.println("son has bike");
       }
       public void job()
       {
    	   System.out.println("son has job");
       }
       public static void main(String[] args) {
	//	Father a=new Son();        //upcasting ----subclass to superclass
		
		//Son b = new Father();     //we cannot wright parent class at constructor place
		
    		Father a=new Son();        //upcasting ----subclass to superclass
    	   Son f = (Son)a;
		f.farm();
	    f.house();
	    f.job();
	    f.bike();
	    System.out.println(f.age);
		
	}
}
