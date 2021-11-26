package day08;

import java.util.Scanner;

public class ifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		//			eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
		//			Diger durumlarda ekrana  “Eskenar degil” yazdirin.
       Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen üçgenin 1. kenarýný grin");
		
		double kenar1=scan.nextDouble();
			
System.out.println("lütfen üçgenin 2. kenarýný grin");
		
		double kenar2=scan.nextDouble();
		
System.out.println("lütfen üçgenin 3. kenarýný grin");
		
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eþkenar üçgen");
		} else {
System.out.println("esknar üçgen deðil");
		}
		
	//  haytta iki secenek varsa if else 
		// ikiden fazla seceknek oldugunda ise 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
