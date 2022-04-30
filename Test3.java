
import java.util.*;
class NumberX
{
	public void CheckPrime(int num)
	{
		int i,j,isPrime;
		for(i=2; i<=num; i++)
		{
        /* Check 'i' for factor of num */
			if(num%i==0)
			{
			/* Check 'i' for Prime */
            isPrime = 1;
				for(j=2; j<=i/2; j++)
				{
					if(i%j==0)
					{
						isPrime = 0;
						break;
					}
				}

            /* If 'i' is Prime number and factor of num */
				System.out.println("Prime Factors Of Given number are:");
				if(isPrime==1)
				{
					System.out.println(""+ i);
				}
			}
		}
	}
}


class Test3
{
	public static void main(String argv[])
	{
		int number=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sobj.nextInt();
		NumberX nobj=new NumberX();
		nobj.CheckPrime(number);
		
	}
}