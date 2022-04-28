package polymorphismCompile;
        //Compile time polymorphism//
public class MethodOverLoading {
      void multiply(int a,int b)
      {
    	  System.out.println(a*b);
      }
      void multiply(int c,int d,int e)
      {
    	  System.out.println(c*d*e);
      }
      void multiply(int e,int c,double d)
      {
    	  System.out.println(d*e*c);
      }
      public static void main(String[] args) {
    	  MethodOverLoading a=new MethodOverLoading();
    	  a.multiply(2,5);
    	  a.multiply(9,6);
    	  a.multiply(5,4,2.0);
	}
}
