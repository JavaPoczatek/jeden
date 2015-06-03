package jeden;

public class mentorek {
	public static void main(String[] args)
	 {
		// int tab[20] = {36, 17, 34, 92 ,74 ,75 ,79 ,44 ,16 ,42 ,66 ,61 ,23 ,83 ,57 ,79 ,10 ,33 ,87 ,35};
		int[] tab = new int[20];
		tab[0] = 36;
		tab[1] = 17;
		tab[2] = 34;
		tab[3] = 92;
		tab[4] = 74;
		tab[5] = 75;
		tab[6] = 79;
		tab[7] = 44;
		tab[8] = 16;
		tab[9] = 42;
		tab[10] = 66;
		tab[11] = 61;
		tab[12] = 23;
		tab[13] = 83;
		tab[14] = 57;
		tab[15] = 79;
		tab[16] = 10;
		tab[17] = 33;
		tab[18] = 87;
		tab[19] = 35;
		
		System.out.println("Przed sortowaniem:");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp;
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
		
		System.out.println("Po sortowaniu:");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	 }
}
