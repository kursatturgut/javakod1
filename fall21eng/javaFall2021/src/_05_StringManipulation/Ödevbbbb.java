package _05_StringManipulation;

import java.util.Scanner;

public class Ödevbbbb {

	public static void main(String[] args) {
		 //Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
        // Örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 3 kelimelik isminiiz yazýnýz ");
		String isim=scan.nextLine();
		
		System.out.println(isim.charAt(0)+"."+(isim.charAt(isim.indexOf(" ")+1)+"."+isim.charAt(isim.lastIndexOf(" ")+1))+".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
