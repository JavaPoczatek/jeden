package jeden;

import java.math.BigInteger;
import java.util.Calendar;

public class encryption {

	public static void main(String[] args)
	{
		String input = "A katol to niestety te¿ zda³.";  //List of characters.
		String output = "";  //List of characters.
		String deoutput = "";  //List of characters.
		
		String tabinput = "QTY6789!@#$%^&*UIOP5)(_+FGHŒ£¯ÑASBfg-=mw012}{ertÓê'D34qhjkló¹,zxc.vbCVn¥pR><asdZXœ?yuioJKL;NMÊ³¿Ÿñ][:WE/\\\" ";  //List of characters.
		char[][] tab = new char[tabinput.length()][4];
		int[] last = new int[1];
		
		BigInteger powKey = new BigInteger("66166").multiply(key().pow(17));  //Key.
		
		for (int a = 0; a < tabinput.length(); a++)  //Assigns original character and 'code'.
		{
			tab[a][0] = tabinput.charAt(a);  //First column, original character.
		}
		for (int a = 0; a < tabinput.length(); a++)
		{
			tab[a][1] = powKey.toString().charAt(a);  //Second column, code assign to character.
			last[0] = last[0] + Character.getNumericValue(tab[a][1]);  //Counts new position of character.
			if (last[0] >= tabinput.length())  //Check if it is not more than all characters in the table.
			{
				last[0] -= tabinput.length();
			}
			
			if (tab[last[0]][2] != '\u0000')  //Check if new position in the third column is already used. Third column is for the encrypted characters.
			{
				outerloop:
					for (int c = 0; c < tabinput.length(); c++)
					{
						last[0]++;  //Adds one to last[0] and checks again.
						if (last[0] >= tabinput.length())  //Check if it is not more than characters in the table. Again.
						{
							last[0] -= tabinput.length();
						}
						
						if (tab[last[0]][2] == '\u0000')
						{
							break outerloop;  //If tab[last[0]][1] is equal to -1, breaks the loop. Which means position is free.
						} else {
							continue;
						}
					}
			}
			tab[last[0]][2] = tab[a][0];  //Assigns the encrypted character in a new place in table.
		}
		
		last[0] = last[0] % 6;
		for (int a = 0; a < tabinput.length(); a++)
		{
			last[0]++;
			if (last[0] >= tabinput.length())  //Check if it is not more than all characters in the table. one more time.
			{
				last[0] -= tabinput.length();
			}
			tab[last[0]][3] = tab[a][2];  //Assigns the encrypted character in a new place in table.
		}
		
		//Encrypting.
		last[0] = last[0] % 5;
		for (int a = 0; a < input.length(); a++)
		{
			outerloop:
				for (int c = 0; c < tabinput.length(); c++)
				{
					if (Character.toString(input.charAt(a)).equals(Character.toString(tab[c][0])) == true) {
						output += tab[c][3];
						break outerloop;  //Ends.
					} else {
						continue;
					}
				}
		}
		System.out.println(output);
		
		//Decrypting.
		for (int a = 0; a < output.length(); a++)
		{
			outerloop:
				for (int c = 0; c < tabinput.length(); c++)
				{
					if (Character.toString(output.charAt(a)).equals(Character.toString(tab[c][3])) == true) {
						deoutput += tab[c][0];
						break outerloop;  //Ends.
					} else {
						continue;
					}
				}
		}
		System.out.println(deoutput);
		
		//Just checking.
		System.out.println(powKey);
		for (int x = 0; x < tabinput.length(); x++)
		{
			System.out.println(tab[x]);
		}
	}
	
	 public static BigInteger key()  //Key generation. Once every minute.
	 {
		 Calendar c = Calendar.getInstance();
		 BigInteger Key = new BigInteger("6" + c.get(Calendar.DATE) + c.get(Calendar.MINUTE) + "616" + c.get(Calendar.HOUR_OF_DAY));
		 
		 return Key;
	 }
}