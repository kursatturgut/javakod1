package day02;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// scanner iþleminde strin için iki method vardýr scan.next dediðinizde tek kelime alýr 
		// dah fazal kelime gelme drumu varsa scan.nextline kullanmalýyýz 
		//

		Scanner scan=new Scanner (System.in);  // nasýl import edlir 
		
		System.out.println("Adýnýzý yazýnýz ");
		
		String ad= scan.nextLine();
		
		System.out.println("soyadýnýzý  yazýnýz ");
				
		String soyad=scan.nextLine();
		
		System.out.println("adýnýz= "+ad+"soyad="+soyad);
				
		
		
		
		
		
		
		
		
	}

}
