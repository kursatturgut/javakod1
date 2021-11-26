package day03;

import java.util.Scanner;

public class Cödevilkharfalma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("adýnýzý giriniz");
		
		char adilkharf=scan.nextLine().charAt(3);  // ilk harf tek karakter olduðu için char kullandýk ve parantez içine 3 yazarak sistemin 4 harfini çaðýrmýþ olduk 
		
		System.out.println(adilkharf);
		
		System.out.println("soyadýnýnýzý giriniz");
		
		char soyad=scan.nextLine().charAt(0);
		System.out.println(soyad);
				
	
		
		
		
		
		
		
		

	}

}
