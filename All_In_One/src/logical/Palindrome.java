package logical;

public class Palindrome {
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		char[] a=str.toCharArray();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("is pali");
		}
		else {
			System.out.println("is not pali");
		}
	}
}
