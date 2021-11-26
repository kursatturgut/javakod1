package day05_matematikseliþlemler;

import java.util.Scanner;

public class C05Modulus {

	public static void main(String[] args) {
		//  kullanýcýdan 6 basamklý sayý alýn ve rkamlar toplamýný yazýn 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen 6 haneli bir sayý giriniz");
		int sayý=scan.nextInt();
		
		int rakamlarToplamý=0;  // neden int olmadan kabul etmiyor 
		int rakam=sayý%10;
		rakamlarToplamý+=rakam;      // neden baþýna int giremiyoruz 
		sayý/=10;
		
	    rakam=sayý%10;
	    rakamlarToplamý+=rakam;
	    sayý/=10;
	    
	    
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
