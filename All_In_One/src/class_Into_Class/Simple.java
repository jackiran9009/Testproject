package class_Into_Class;

public class Simple {
	public static void main(String[] args) {
		//		Samp s=new Samp();
		//		s.show1();
		Samp.show2();
	}
	public static void show()
	{
		System.out.println("it is show");
	}
	public class Samp{
		public void show1()
		{
			System.out.println("it is show1");
		}
		public static void show2()
		{
			System.out.println("it is show2");
		}
		public static void main(String[] args) {
			Simple.show();
		}
	}
}
