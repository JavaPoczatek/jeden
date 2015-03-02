package jeden;

import java.util.Calendar;

public class loop {
	public static void main(String[] args) throws Exception
	{
		int obecnie = (int) ObecnaData();
		int ostatnio = obecnie;
		
		System.out.println(obecnie);
		
		while (true)
		{
			obecnie = (int) ObecnaData();
			
			Thread.sleep(500);
			
			if (obecnie > ostatnio)
			{
				ostatnio = obecnie;
				
				System.out.println(obecnie);
			}
		}
	}
	
	 public static int ObecnaData()
	 {
		 Calendar c = Calendar.getInstance();
		 int dzien = c.get(Calendar.DAY_OF_YEAR);
		 int rok = c.get(Calendar.YEAR);
		 
		 int obecnie = rok * 1000 + dzien;
		 
		 return obecnie;
	 }
}
