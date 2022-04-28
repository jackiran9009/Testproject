package logical;

public class ArmstrongNo {
public static void main(String[] args) {
	int num=153,temp,rev=0,arms=num;
	    while(num>0)
	    {
	    	temp=num%10;
	    	rev=rev+temp*temp*temp;
	    	num=num/10;
	    }
	    System.out.println(rev);
	    if(arms==rev)
	    {
	    	System.out.println("armstrong no");
	    
	    }
	    else
	    {
	    	System.out.println("not armstrong no");
	    }
}
}
