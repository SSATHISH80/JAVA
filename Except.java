import java.lang.*;
public class Except
{	
	public static void main(String[] a)	
		{ 
			try
				{       
					System.out.print("kec");
					int c= 5/0;
					System.out.print("is not a");
				}
			catch(ArithmeticException e)
				{       
					System.out.print(" is a");
				}
			catch(Exception e)
				{       
					System.out.println("good college");
				}
         			finally
				{       
					System.out.print(" best college");
				}
		}
}