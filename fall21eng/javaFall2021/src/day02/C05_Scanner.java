package day02;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullanýcýdan isim soy isim ayrý ayrý isteyip 
		// grilen ismi asagýdaki gibi yazdýrýnýz 
		// girilen iism :mehmet bulutoz 
		
	Scanner scan= new Scanner(System.in);
	System.out.println("lütfen isminizi giriniz ...");
			
	String isim =scan.next();
	
	System.out.println("lütfen soyisminizi giriniz ...");
	
	String soyisim =scan.next();
	
	System.out.println("ismniz ...="+isim+"  soyisminiz..="  +soyisim);

	}

}
