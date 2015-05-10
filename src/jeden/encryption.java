package jeden;

import java.math.BigInteger;
import java.util.Calendar;

public class encryption {

	public static void main(String[] args)
	{
		
		String tabinput = "QTY6789!@#$%^&*UIOP5)(_+FGHŒ£¯ÑASBfg-=mw012}{ertÓê'D34qhjkló¹,zxc.vbCVn¥pR><asdZXœ?yuioJKL;NMÊ³¿Ÿñ][:WE/\\\" ";  //List of characters.
		char[][] tab = new char[tabinput.length()][4];
		int[] last = new int[1];
		
		BigInteger powKey = key().pow(15);  //Key.
		
		for (int i = 0; i < tabinput.length(); i++)  //Assigns original character and 'code'.
		{
			tab[i][0] = tabinput.charAt(i);  //First column, original character.
			tab[i][1] = powKey.toString().charAt(i);  //Second column, code assign to character.
		}
		for (int a = 0; a < tabinput.length(); a++)
		{
			last[0] = last[0] + Character.getNumericValue(tab[a][1]);  //Counts new position of character.
			if (last[0] >= tabinput.length())  //Check if it is not more than all characters in the table.
			{
				last[0] = last[0] - tabinput.length();
			}
			
			if (Character.getNumericValue(tab[last[0]][3]) == 1)  //Check if new position in the third column is already used. Third column is for the encrypted characters.
			{
				outerloop:
					for (int c = a; c < tabinput.length(); c++)
					{
						last[0]++;  //Adds one to last[0] and checks again.
						if (last[0] >= tabinput.length())  //Check if it is not more than characters in the table. Again.
						{
							last[0] = last[0] - tabinput.length();
						}
						
						if (Character.getNumericValue(tab[last[0]][3]) != 1)
						{
							break outerloop;  //If tab[last[0]][3] is not equal to 1, breaks the loop. Which means position is free.
						} else {
							continue;
						}
					}
			}
			tab[last[0]][2] = tab[a][0];  //Assigns the encrypted character in a new place in table.
			tab[last[0]][3] = "1".charAt(0);  //Assigns 1 in a new place in table.
		}		
		
		System.out.println(powKey);
		for (int x = 0; x < tabinput.length(); x++) 
		{
			System.out.println(tab[x]);
		}
	}
	
	 public static BigInteger key()  //Key generation. Once every minute.
	 {
		 Calendar c = Calendar.getInstance();
		 BigInteger Key = new BigInteger("" + c.get(Calendar.DATE) + c.get(Calendar.MINUTE) + c.get(Calendar.YEAR) + c.get(Calendar.MONTH) + "6" + c.get(Calendar.HOUR_OF_DAY));
		 
		 return Key;
	 }
}