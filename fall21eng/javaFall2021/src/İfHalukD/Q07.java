package İfHalukD;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter griniz");
	//char karakter=scan.	
	    char karakter=scan.next().charAt(0);
	    
	if (karakter>='A' && karakter<='Z') {
		System.out.println("girdiğiniz karakter buyk harftir");
	}else if (karakter>='a'  && karakter<='z') {
		System.out.println("girdiğiniz harf kucuk harftir");
	}else {
		System.out.println("lütfen gcerli bir karakter griniz");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
