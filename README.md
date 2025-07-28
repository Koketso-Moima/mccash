import java.util.Scanner;

public class Arrays
{
	public static void main(String[] args)
	{
		//instantiation
		Scanner sc=new Scanner(System.in);
		
		//declaration
		
		/*int[] results={50,30,50,85,90};
		double total=0,avarage=0;
		
		//input values
		System.out.println("Results");
		for(int i=0;i<results.length;i++)
		{
			System.out.println( results[i]);
		}
		for(int i=0;i<results.length;i++)
		{
			total=total+results[i];
			avarage=total/results.length;
		}
		System.out.println("avarage "+avarage);
		System.out.println("The Adjusted results");
		for(int i=0;i<results.length;i++)
		{
			System.out.println( results[i]+5);
		}
		
		int highest=0;
		int index=0;
		for(int i=0;i<results.length;i++)
		{
			if(results[i]>highest)
			{
				highest=results[i];
				index=i;
				
			}
		}
		System.out.println("The highest is "+highest+" Found at index "+index);*/
		
		
		
		//question2
		
		int[] students=new int[5];
		System.out.println("Enter the results of the quiz");
		for(int i=0;i<students.length;i++)
		{
			double results=sc.nextDouble();
			if(results>=1 || results<=100)
			{
				System.out.println("results "+results);
			}
			else
			{
				System.out.println("Invalid Marks");
			}
		}

		
		
	}
}
