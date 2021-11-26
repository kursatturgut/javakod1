package Day15metodcretion;

import java.util.Scanner;

public class Metodsorularý2 {

	public static void main(String[] args) {
		/*
		Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve
sayilarin toplamini yazdirin. Kullanici toplamak istedigi sayi adedini
4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
*/  
		Scanner scan=new Scanner(System.in);
	System.out.println("lütfen \n 2 sayý toplamk için 2 \n 3 sayý toplamk için 3 \n 4 sayý tplamak için 4 ");
	int tercih=scan.nextInt();
	
	switch (tercih) {
	
	case 2:
		ikiTopla();
	break;
	case 3:
		ucTopla();
		break;
	case 4:
		dortTopla();
		break;
	default :
		System.out.println("lütfen gecerli sayý griniz ");
	
	
		}
		
		
		
		
	}

	private static void dortTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 4 sayý griniz her sayýdan ssonra entere basýnýz sonraki sayýyý grinz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		double sayý4=scan.nextDouble();
		System.out.println(sayý1+sayý2+sayý3);
		
	}

	private static void ucTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 3 sayý griniz her sayýdan ssonra entere basýnýz sonraki sayýyý grinz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		System.out.println(sayý1+sayý2+sayý3);
		
	}

	private static void ikiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý griniz ilk sayýdan ssonra entere basýnýz ikinci sayýyý grinz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		System.out.println(sayý1+sayý2);
	}

}
