package day06Wrapper;

import java.util.Scanner;

public class Ýfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// eðer (hava güzl olursa) {pikniðe gideriz} alt satýra gecer 
	//	if (boolen sart)  {sart ok se istene  kod çalýþýr} alt satýr 
		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
	
	Scanner scan=new Scanner(System.in);
	System.out.println(" lütfen gün isimlerinden brinin ilk harfini giriniz:");
	
	char ilkHarf=scan.next().charAt(0);
	
	if (ilkHarf=='P') {
		System.out.println("Pazar,pazartesi veya Peþembe:");
	}
	if (ilkHarf=='C') {
		System.out.println("cuma,cumartesi veya çarþamba:");
	}
	if (ilkHarf=='S') {
		System.out.println("Salý:");
	}
	
	
	
	
	
	
	
	
	
	}

}
