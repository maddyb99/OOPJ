import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
class Mythread extends Thread
{
    String msg,name;
    int value,op1,op2;
    Mythread(String msg, int val)
    {
    	this.msg=msg;
    	this.value=val;
    }
    public void run()
    {
    	name=this.getName();
        try{
            File f=new File("E:\\Users\\Madhav\\Documents\\2nd Year\\JAVA\\operands.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                op2=0;
                op1=0;
                if(name.equals("Add"))
                {
                    op1=sc.nextInt();
                    if(sc.hasNextLine())
                        op2=sc.nextInt();
                    System.out.println(op1+op2);
                }
                else if(name.equals("Subtract"))
                {
                    op1=sc.nextInt();
                    if(sc.hasNextLine())
                        op2=sc.nextInt();
                    System.out.println(op1-op2);
                }
                else if(name.equals("Multiply"))
                {
                    op1=sc.nextInt();
                    if(sc.hasNextLine())
                        op2=sc.nextInt();
                    System.out.println(op1*op2);
                }
                else if(name.equals("Divide"))
                {
                    op2=1;
                    op1=sc.nextInt();
                    if(sc.hasNextLine())
                        op2=sc.nextInt();
                    if(op2!=0)
                        System.out.println(op1/op2);
                }
            }
        }
        catch(FileNotFoundException e)
        {}
        
    }
}
public class calc
{
    public static void main(String args[])
    {
        Mythread obj=new Mythread("thread 1",10);
        Mythread obj1=new Mythread("thread 2",20);
        obj.setName("Add");
        obj1.setName("Subtract");
        obj.start();
        obj1.start();
    }
}   