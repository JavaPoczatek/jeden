package jeden;

public class dwa
{
	private static final long start = System.nanoTime();
 public static void main(String[] args)
 {
 System.out.println("Nie powiemy „Witaj, œwiecie!”");
 for (int i = 1; i <= 100; i++)
 {
         if (i%3==0)
         {
                 if (i%5==0)
                         System.out.println("fizzbuzz");
                 else
                         System.out.println("fizz");
         }
                 else if (i%5==0)
                 System.out.println("buzz");
                else
                 System.out.println(i);
 }
 
 
 System.out.println("Czas wykonania: " + ( System.nanoTime() - start ) + ".");
 }
}