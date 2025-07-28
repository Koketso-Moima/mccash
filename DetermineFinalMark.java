import java.util.Scanner;

public class DetermineFinalMark
{
	public static void main(String[] args)
	{
		//instantiation
		Scanner sc=new Scanner(System.in);
		
		//declaration
		
		int test1,test2,test3,exam,testTotal;
		double testAvr,examMark,finalMark,testHalf;
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter marks for for test 1 for student "+(i+1));
			test1=sc.nextInt();
			System.out.println("Enter marks for for test 2 for student "+(i+1));
			test2=sc.nextInt();
			System.out.println("Enter marks for for test 3 for student "+(i+1));
			test3=sc.nextInt();
			System.out.println("Enter the exam  marks for student "+(i+1));
			exam=sc.nextInt();
			testTotal=test1+test2+test3;
			testAvr=(testTotal/3)*0.5;
			examMark=exam*0.5;
			finalMark=testAvr+examMark;
			System.out.println("The final Mark for student "+(i+1)+"="+finalMark);
			
			
		}
	}
}