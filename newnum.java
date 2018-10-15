import java.util.*;
public class newnum
{
	public static void main(String args[])
	{
		int x,a=0,b=0,c,d,i,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		x=sc.nextInt();
		temp=x;
		i=0;
		while(temp!=0)
		{
			d=temp%10;
			temp=temp/10;
			if(i%2==0)
			{
				a*=10;
				a+=d;
			}
			else
			{
				b*=10;
				b+=d;
			}
			i++;
		}
		temp=a;
		c=0;
		while(temp!=0)
		{
			d=temp%10;
			temp=temp/10;
			c*=10;
			c+=d;
		}
		a=c;
		temp=b;
		c=0;
		while(temp!=0)
		{
			d=temp%10;
			temp=temp/10;
			c*=10;
			c+=d;
		}
		b=c;
		if(a>b)
			System.out.print(a);
		else
			System.out.println(b);
	}
}