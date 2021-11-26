package day02;

import java.util.Scanner;

public class C04_Scaner {

	public static void main(String[] args) {
		
		
		// kullanýcýdan deger almak için 3 adým takip edilir 
		// 1  scanner objesi oluþturmak 
		
		Scanner scan=new Scanner(System.in);  // obje oluþturduk 
		
		// ikinci adým kullanýcýyaisteðiimiiz söylemek 
		
		System.out.println("Lütfen isminizi yazýnýz");  // istedik 
		
		String isim=scan.next();
				
		System.out.println("isminiz..:"+isim);
		
		
		scan.close();
		
		
		
		
		
		//scan  bir scanner objesidir 
		// isim olarak farklý bir isim yazssak ta çalýýr ama scan tercih edilir 
		// scan  bir obje olduðu için data türü non primitive dir 
		// primitiva data turleri sadece deðer içerrken non primitive deðerin yanýnda method barýndýrýlar 
		// scan .  dediðimizde hazur metodlarý görebiliriz 
	
		
		
		
		
		
		
		

	}

}
