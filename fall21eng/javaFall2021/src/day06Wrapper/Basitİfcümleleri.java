package day06Wrapper;

import java.util.Scanner;

public class BasitÝfcümleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin                              // bu sayfayý gözden geçir
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen gün ismini yazýnýz :");
		String gun=scan.next().toLowerCase();
		
	if (gun.equals("pazar") || gun.equals("cumartesi")  ) {
		
		System.out.println("haftasonu");
	}
		
//if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("çarsamba" || gun.equals("perþembe") ) {
		
		System.out.println("haftasonu");
	}
		
		
		
		
		
		
		
		
		
	}


