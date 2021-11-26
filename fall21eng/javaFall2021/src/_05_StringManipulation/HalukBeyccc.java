package _05_StringManipulation;

import java.util.Scanner;

public class HalukBeyccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz,
  // ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("lütfen adýnýzý soyadýnýzý griniz");	
	String ad=scan.nextLine();
	
	System.out.println(ad.substring(0,ad.indexOf(" ")));	
	System.out.println(ad.substring(ad.indexOf(" ")+1));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
