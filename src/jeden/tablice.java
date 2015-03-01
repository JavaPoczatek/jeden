package jeden;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class tablice {
	
	static int[] tableka = new int[10];
	
	public int z = 5;

	public static void main(String[] args)
	{
		int jeden = pie();
		

		
		System.out.println(tableka[3]);
		System.out.println(kaszka());
		
		int a = 15;
		
		int[] numbers = new int[a];
		for (int i = 0; i < numbers.length; i++){
			int h = (int) (Math.random() * 18);
			numbers[i] = h;
			System.out.println(jeden - h);
		}
		
		 Arrays.sort(numbers);
		 for (int s : numbers) {
			 System.out.println(s);
		 }
	}
	
	 public static int pie()
	 {
		 
			tableka[0] = 5;
			tableka[1] = 3;
			tableka[2] = 1;
			tableka[3] = 5;
			tableka[4] = 45;
		 
		 int jeden = tableka[4] - 5;
		 
		 tableka[5] = jeden;
		 
		 return jeden;
	 }
	 
	 public static int kaszka()
	 {
		 int dwa = 0;
		 
		 try 
		 {
			 Thread.sleep(1000);
		 } 
		 catch (InterruptedException e) 
		 {
			 dwa++;
			 e.printStackTrace();
		 }
		 
		 return dwa;
	 }
	
}