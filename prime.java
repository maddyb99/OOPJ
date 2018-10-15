import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		int x,y,flag,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of X:");
		x=sc.nextInt();
		System.out.print("Enter value of Y:");
		y=sc.nextInt();
		System.out.println("Prime numbers between "+x+" and "+y+" are:");
		for(i=x;i<=y;i++)
		{
			flag=1;
			for(j=2;j<(i/2);j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.print(i+", ");
		}
	}
}