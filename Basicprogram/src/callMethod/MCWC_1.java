package callMethod;

public class MCWC_1 {

	static public void main(String[] args) {
		MCWC_1 hp=new MCWC_1();
		MCWC_1.shopping();
		hp.game();
	}
	public static void shopping()
	{
		System.out.print("shopping sites");
		System.out.print(":- flipkart,amazone,ajio,snapdeal");
		System.out.println("etc.");
	}
	public void game()
	{
		System.out.print("my video games");
		System.out.print(":- modern war fare,last day on earth");
		System.out.print("etc.");
	}
}
