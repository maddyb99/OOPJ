import java.util.*;
public class power
{
	public static void main(String args[])
	{
		int x,y,p=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of X:");
		x=sc.nextInt();
		System.out.println("Enter value of Y:");
		y=sc.nextInt();
		for(i=0;i<y;i++)
			p*=x;
		System.out.println(x+"^"+y+"="+p );
	}
}