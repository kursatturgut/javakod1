package ÝfHalukD;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
      Scanner scan=new Scanner(System.in);
      System.out.println("lütfen yasýnýzý griniz");
		int yas=scan.nextInt();
		System.out.println("lütfen kilonuzu griniz");
		int kýlo=scan.nextInt();
		
		if (yas<18) {
			System.out.println("kan bagýsý yapamazssýnýz");
		} else if (kýlo<50) {
			System.out.println("kan bagýsý yapamaz");
		} else {
System.out.println("kan bagýsý yapabilir");
		}{

		}

		
		
		
		
		
		
		
		
		
		
		 
		
		
		
	}

}
