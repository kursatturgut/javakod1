package day05_matematikseliþlemler;

import java.util.Scanner;

public class C03_modulus {

	public static void main(String[] args) {
		
		int a=15%4;                                 //modulus kalan verir ve isþareti yuzde iþaretidr
	System.out.println(a);
		
     // kullanýcýdan 3 basmaklý sayý alup rakamlar toplamýný yazdýran program yazýnýz 
	    
	 Scanner scan=new Scanner(System.in);
	System.out.println("lutfen 3 basmaklý sayý giriniz ");
	int sayý=scan.nextInt();
	
	// bulmak istediðiimz seye degiþken atarýz baska yolu yok 
	// önce 3 u bulduk 10 bölerek 
	
	int rakamlarToplamý=0;
	int rakam=sayý%10;
    rakamlarToplamý+=rakam;  // NEDEN BAÞINA ÝNT YAZINCA KABUL ETMÝYOR 
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
