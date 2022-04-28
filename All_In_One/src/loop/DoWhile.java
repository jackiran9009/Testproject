package loop;

public class DoWhile {
public static void main(String[] args) {
	int a=1;
	do            //at least one output if condition not satisfied
	{
		System.out.println(a);
		a++;
	}
	while(a<=5);
	//while(a>=5);           wrong condition				
}
}
