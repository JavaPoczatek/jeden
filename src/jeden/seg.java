package jeden;

public class seg {
	 public static void main(String[] args)
	 {
		
		int[][] tablica = new int[6][2];
		tablica[0][0] = 1;
		tablica[1][0] = 8;
		tablica[2][0] = 2;
		tablica[3][0] = 0;
		tablica[4][0] = 7;
		tablica[5][0] = 5;
		
		int[][] new_tablica = new int[6][2];
		
		for(int i = 0; i < tablica.length; i++)
		{
		    System.out.println(tablica[i][0]);
		    
		    if (i == 0) {
		    	new_tablica[0][0] = tablica[0][0];
		    } 
		    else
		    {
		    	for(int a = 0; a < new_tablica.length; a++)
		    	{
		    		if (tablica[i][0] > new_tablica[a][0]) 
		    		{
		    			new_tablica[a][0] = tablica[i][0];
				    	for(int b = a; b < new_tablica.length; b++)
				    	{
				    		new_tablica[a][0] = tablica[b][0];
				    	}
		    			a = new_tablica.length;
		    		}
		    	}
		    }
		}
		
		for(int i = 0; i < tablica.length; i++)
		{
		    System.out.println(new_tablica[i][0]);
		}
	 }
}