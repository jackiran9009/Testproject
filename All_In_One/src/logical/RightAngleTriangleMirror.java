package logical;

public class RightAngleTriangleMirror {
public static void main(String[] args) {
	for(int a=1; a<=9; a++)
	{
		for(int b=9; b>=a; b--)      //for(int b=1; b<=a; b++)
		{
			System.out.print("  ");
		}
		for(int b=9; b<=a; b++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	
}
}
