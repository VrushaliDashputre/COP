import java.util.Scanner;

public class Account
{   Scanner sc=new Scanner(System.in);
    public void uppercase()
    {
    	String s;
    	System.out.println("Enter a name");
    	s=sc.next();
    	String l=s.toUpperCase();
    	System.out.println("Hello "+l);
    	
    }
	
    public void lowercase()
    {
    	String s;
    	System.out.println("Enter a name");
    	s=sc.next();
    	String l=s.toLowerCase();
    	System.out.println("Hello "+l);
    	
    }
    public void start()
    {
    	String s;
    	System.out.println("Enter a name");
    	s=sc.next();
    	boolean b;
    	b=s.startsWith("A");
    	if(b==true)
    		System.out.println("name starts with A");
    	else
    		System.out.println("name NOT starts with A");
    }
	public void endswith()
	{
		String s;
    	System.out.println("Enter a name");
    	s=sc.next();
    	boolean b;
    	b=s.endsWith("G");
    	if(b==true)
    		System.out.println("name ends with G");
    	else
    		System.out.println("name NOT ends with g");
		
		
	}
	public static void main(String[] str)
	{
		Account a=new Account();
		a.uppercase();
	    a.lowercase();
		a.start();
		a.endswith();
	}
	
}
