package upcastingWithoutOverriding;

class Son extends Father {
      int age=29;
      
      void bike()
      {
    	  System.out.println("son's bike");
      }
      void job()
      {
    	  System.out.println("son's job");
      }
      public static void main(String[] args) {
		Father f=new Son();
              f.home();
              f.farm();
              System.out.println(f.age);
      }
}
