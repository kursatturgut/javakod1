package day13stringmanupuluendwith;

import java.util.Scanner;

public class StrartswithEndvith {

	public static void main(String[] args) {
		// Kullanýcýdan cümle ve kelime alýn 
		// verilen cumlenin  verilen kelime ile baslayýp baslmadýgýný 
		// btip bitmediðini yazdýrýn

	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir cümle");
	String cumle=scan.nextLine();
	System.out.println("kelime");
		String kel=scan.next();
		
		
System.out.println(cumle.startsWith("kel"));
System.out.println(cumle.endsWith("kel"));		
		
		if (cumle.startsWith(kel)) {
			System.out.println("baslýyor");
		} else {
System.out.println("baslamýyor");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
