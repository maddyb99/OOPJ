import java.util.*;
public class primenot
{
	public static void main(String args[])
	{
		int x,i,flag;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		x=sc.nextInt();
		flag=1;
		for(i=2;i<(x/2);i++)
		{
			if(x%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.print(x+" is a prime number!");
		else
			System.out.print(x+" is not a prime number!");
	}
}