import java.util.*;
public class sum
{
	public static void main(String args[])
	{
		int x,d,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		x=sc.nextInt();
		temp=x;
		while(temp!=0)
		{
			d=temp%10;
			temp=temp/10;
			sum+=d;
		}
		System.out.print("Sum of the digits of "+x+" is "+sum);
	}
}