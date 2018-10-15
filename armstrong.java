import java.util.*;
public class armstrong
{
	public static void main(String args[])
	{
		int x,i,d,j,pr,temp,arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		x=sc.nextInt();
		temp=x;
		i=0;
		while(temp!=0)
		{
			temp/=10;
			i++;
		}
		temp=x;
		while(temp!=0)
		{
			d=temp%10;
			pr=1;
			temp=temp/10;
			for(j=0;j<i;j++)
				pr=pr*d;
			arm+=pr;
		}
		if(arm==x)
			System.out.print(x+" is an armstrong number!");
		else
			System.out.print(x+" is not an armstrong number!");
	}
}