package callMethod;

public class MCAWC {
  public static void mobile(int g)
  {
	  System.out.println("I have an mi phone");
  }
  public void laptop(double d)
  {
	  System.out.println("I have hp laptop");
  }
  public void bike(String f)
  {
	  System.out.println("I have pulser bike");
  }
  public static void main(String[] args)
  {
	  MCAWC obj=new MCAWC();
	  MCAWC.mobile(54);
	  obj.laptop(56.1);
	  obj.bike("mh");
  }
}
