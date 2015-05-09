package jeden;

public class fib
{
public int sumaIteracja(int n) {
	int suma = 0;
	while(n > 0) {
		suma = suma+n;
		n--;
	}
	return suma;
}

public int sumaRekurencja(int n) {
	if(n>0) {
		return n + sumaRekurencja(n-1);
	} else {
		return 0;
	}
}

public static void main(String[] args) {
	fib r = new fib();
	int iteracja, rekurencja = 0;

	iteracja = r.sumaIteracja(9);
	rekurencja = r.sumaRekurencja(9);

	System.out.println("Iteracja: "+iteracja);
	System.out.println("Rekurencja: "+rekurencja);
}
}