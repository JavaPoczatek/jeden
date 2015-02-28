package jeden;

public class tablice {
	
	static int[] tableka = new int[10];

	public static void main(String[] args)
	{
		pie();
		
		tableka[0] = 5;
		tableka[1] = 3;
		tableka[2] = 1;
		tableka[3] = 0;
		tableka[4] = 45;
		
		System.out.println(tableka[5]);
		
		pie();
		
		int r = (int) (Math.random() * 10);
		System.out.println(r);
		
	}
	
	 public static int pie()
	 {
		 int jeden = tableka[4] - 27;
		 
		 tableka[5] = jeden;
		 
		 System.out.println(tableka[5]);
		 
		 return jeden;
	 }
	
}