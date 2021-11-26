import java.util.Scanner;

public class ÝfÖrnekÇalýþmalr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen herhangi bir günün ilk hrfini griniz harf giriniz");
		
		char harf=scan.next().toUpperCase().charAt(0);
		
		
		if (harf=='P' || harf=='C' || harf=='S' || harf =='Ç') {
			if (harf=='P') {
				System.out.println("pazartesi,pazar,perþembe");
			}
			if (harf=='C') {
				System.out.println("cuma");
			}
			if (harf=='S' ) {
				System.out.println("salý");
			}
			if (harf =='Ç') {
			System.out.println("çarþamba");	
			}
			
			
			
			
		} else {
System.out.println("lütfen geçerli bir harf griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
