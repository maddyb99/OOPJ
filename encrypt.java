import java.util.*;
public class encrypt
{
	public static void main(String args[])
	{
		int x,a=0,b=0,c,d,i,temp,sum=0;
		String enc;
		char dec[100],key[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		enc=sc.nextLine();
		for(i=0;i<enc.length();i++)
		{
			for(j=0;j<26;j++)
				if(enc.charAt(i)==key[j])
					dec[i]=enc.charAt(i)-j;
		}
		System.out.print("Decrypted string is " +dec);
	}
}