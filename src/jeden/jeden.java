package jeden;

public class jeden
{
	private static int a = 1;
	private static int limit = 100;
	private static int fizz = 8;
	private static int buzz = 7;
	private static String wynik;
	
	public static void main(String[] args)
		{
		while (a <= limit) 
		{			
			if (a % (fizz * buzz) == 0)
			{
				wynik += ", fizzbuzz"; 
			}
			else if (a % fizz == 0)
			{
				wynik += ", fizz"; 
			}
			else if (a % buzz == 0)
			{
				wynik += ", buzz"; 
			}
			else
			{
				wynik += ", " + a;
			}
			a++;
		}
			System.out.println("Limit iloœci licz: " + limit);
			System.out.println("Wynik: " + wynik);
		}
}