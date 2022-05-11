package Prime;
public class Prime 
{
	public boolean isPrime (int number)
	{
		if (number <= 1)
		{
			return false;
		}
		
		for (int i = 2; i  <= (int) Math.sqrt(number); i++)
		{
			if ( number  % i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main (String []args)
	{
		Prime prime = new Prime ();
		System.out.println(prime.isPrime(4));
	}
}
