
import java.util.*;

public class Test
{
	public static void main(String argv[])
	{
		int year=0;
		System.out.println("Enter the year");
		Scanner sobj=new Scanner(System.in);
		year=sobj.nextInt();
		int count=0;
		int temp=year;
		while(year!=0)
		{
			year=year/10;
			count++;
		}
		if(count==4)
		{
			if(temp % 4==0)
			{
				System.out.println("This is a leap year");
			}
			else
			{
				System.out.println("This is a not leap year");
			}
		}
		else
		{
			System.out.println("Invalid Input");
			
		}
		
		
		
	}
}

