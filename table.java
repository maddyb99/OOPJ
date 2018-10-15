import java.util.*;
public class table
{
	public static void main(String args[])
	{
		int x,y,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of X:");
		x=sc.nextInt();
		System.out.print("Enter value of Y:");
		y=sc.nextInt();
		for(i=1;i<=y;i++)
			System.out.println(x+"x"+i+"="+(x*i));
	}
}