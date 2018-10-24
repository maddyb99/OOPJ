import java.util.*;
import java.lang.InterruptedException;
class Mythread extends Thread
{
    String msg;
    int value,i;
    Mythread(String msg, int val)
    {
    	this.msg=msg;
    	this.value=val;
    }
    public void run()
    {
    	System.out.println(this.getPriority());
    	System.out.println(this.getName());
    	for (int i=0;i<100;i++)
    	{
    		System.out.print(msg+(value+i));
    	}
    }
}
public class Demo
{
	public static void main(String args[])
	{
		Mythread obj=new Mythread("thread 1",10);
		Mythread obj1=new Mythread("thread 2",20);
		obj.setPriority(1);
		obj1.setPriority(3);
		obj.setName("Obj 1");
		obj1.setName("Obj 2");
		obj.start();
		obj1.start();
    	for(int i=0;i<100;i++)
    	{
    		System.out.print("Main Thread Running");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{}
    	}
	}
}