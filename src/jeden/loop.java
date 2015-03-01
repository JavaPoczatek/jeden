package jeden;

import java.util.Calendar;

public class loop {
	public static void main(String[] args) throws Exception
	{
		int obecnie = (int) ObecnaData();
		int last = obecnie;
		
		System.out.println(obecnie);
		System.out.println(last);
		
		while (true)
		{
			obecnie = (int) ObecnaData();
			
			Thread.sleep(500);
			if (obecnie > last)
			{
				last = obecnie;
				
				System.out.println(obecnie);
			}
		}
	}
	
	 public static long ObecnaData()
	 {
			Calendar c = Calendar.getInstance();
			int minutes = c.get(Calendar.MINUTE);
			
			int obecnie = minutes;
			
			return obecnie;

	 }
}
