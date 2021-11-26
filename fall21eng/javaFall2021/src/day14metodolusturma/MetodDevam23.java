package day14metodolusturma;

import java.util.Scanner;

public class MetodDevam23 {

	public static void main(String[] args) {
		
		// kullanýcýdan iki sayý isteyelim
				// sayýlarý karelerini ve küplerini toplayýp yazdýran  iki ayrý metot yazýn
				// kullanýcýya us  sorun
				// 2 yazarsa karleri toplamý yapan metod 
				// uc yazarsa kupler toplamýný yapan metod calýssýn 
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý griniz\n ilk sayýdan ssonra entere basýn");
		
		double sayý1=scan.nextDouble();
		double sayý2 =scan.nextDouble();
		System.out.println("girilen syýlarýn kareler top için 2 \n küptp için 3 basýn");
		int secim=scan.nextInt();
		
		// kareTopla(sayý1,sayý2);	 // cagýrmamamgerek yok sildim
		// kupTopla(sayý1,sayý2);  // ihtýyac kalmadý sil
		switch (secim) {
		case 2:
			kareTopla(sayý1,sayý2);
		break;
		case 3:
			kupTopla(sayý1,sayý2);
		break;
			default:
				System.out.println("lütfen doðru tercih yapýn");
		
		}
		
		
		}

	public static void kupTopla(double sayý1, double sayý2) {
		double kuplerToplamý=sayý1*sayý1*sayý1+sayý2*sayý2*sayý2;
		System.out.println("kuptoplamý="+ kuplerToplamý);
	}

	public static void kareTopla(double sayý3, double sayý4) { // sayýlar degiþir önemli degil
		double karelerToplamý=sayý3*sayý3+sayý4*sayý4;
		System.out.println("karetop="+karelerToplamý);
	}

}
