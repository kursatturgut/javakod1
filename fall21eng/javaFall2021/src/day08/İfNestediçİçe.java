package day08;

import java.util.Scanner;

public class ÝfNestediçÝçe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen cinsiyetinizi giriniz:erkek için  :E   ;  kadýn için:K");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("lütfen yaþýnýzý giriniz");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
		          if (yas>=65) {
			System.out.println("emeklisiniz");
		}       else {
System.out.println("emekli olamazsýnýz");
		}
			
			
		} else if(cinsiyet=='K') {
               if (yas>=60) {
	System.out.println("emeklisiniz");
}              else {
System.out.println("emekli deðilsiniz");
}
			
			
			
		}else {
			System.out.println("lütfen gecerli bir cinsiyet giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
