class CmdLineArg
 {
	public static void displayArray(String [ ]  a)
	{
		System.out.println(a[0]);
                System.out.println(a[1]);
	}

	public static void main(String [] args)   	
	{
		displayArray(args);

		displayArray(new String[] {"a" , "b"});  
	

		System.out.println("Length= " + args.length);

		/*for(int i = 0  ; i < args.length ; i++)
		{ 
			System.out.println(args [ i ]);
		}*/

		for(int i = 0  ; i < args.length ; i++)
		{ 
			System.out.println(Integer.parseInt(args [ i ]));
		}
	
		/*for(String  s : args)   
		{
			System.out.println(s);
		}*/
	}
}
