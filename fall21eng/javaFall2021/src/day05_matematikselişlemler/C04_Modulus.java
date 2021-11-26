package day05_matematikseliþlemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		
		// kullanýcýdan 4 basmaklý sayý alýp rakmlar toplamýný yazdýrýn 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen 4 haneli sayý giriniz");
		
	      int sayý=scan.nextInt();
	      
	     int rakamlarToplamý=0;
	     int  rakam=sayý%10;
	     rakamlarToplamý+=rakam;  // neden int yazamýyoruz 
	     sayý/=10;
	     
	     rakam=sayý%10;  // neden int kabul etmiyor baþýna 
	     rakamlarToplamý+=rakam;
	     sayý/=10;
	     
	     rakam=sayý%10;
	     rakamlarToplamý+=rakam;
	     sayý/=10;
	     
	     rakam=sayý%10;
	     rakamlarToplamý+=rakam;
	     sayý/=10;
	    
	    	System.out.println(rakamlarToplamý);	  
	      
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
