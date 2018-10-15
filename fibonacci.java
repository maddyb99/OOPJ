import java.util.*;
public class fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c=1,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N:");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("The "+n+"th element of fibonacci series is "+c);
	}
}