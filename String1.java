/*Accpt name from user   - Use String Class from java Doc

	https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

	1) display message to user Hello <name> [upper case]
		
	2)  display message to user Hello <name> [lower case]
	3) check your name starts with A then display that message
		name starts with A 
	4) check name ends with G then display message 
		name ends with G */

import java.util.*;
import java.lang.*;

class String1
{
    String name;
    Scanner sc=new Scanner(System.in);
    public String1()
    {
         System.out.println("Enter any string");
         name=sc.next();    
    }
    public void lowerCase()
    {
         System.out.println("Lowercase String is "+name.toLowerCase());
    }
    public void upperCase()
    {
         System.out.println("Uppercase String is "+name.toUpperCase());
    }
    public void start()
    {
         boolean res=name.startsWith("A");
         if(res==true)
            System.out.println("String name starts with 'A'");
         else
            System.out.println("String name not starts with 'A'");
    }
     public void end()
    {
         boolean res=name.endsWith("G");
         if(res==true)
            System.out.println("String name ends with 'G'");
         else
            System.out.println("String name not ends with 'G'");
    }
    public static void main(String[] args)
    {
        String1 obj1=new String1();
        obj1.lowerCase();
        String1 obj2=new String1();
        obj2.upperCase();
        String1 obj3=new String1();
        obj3.start();
        String1 obj4=new String1();
        obj4.end();
    }
}