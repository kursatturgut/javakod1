import java.util.Scanner;

public class ÝfÇaliþma12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		//  gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun

//		isimlerini yazdirin
//		Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”

//		ilkHarf=S output = “Sali”

	//	*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen  haftanýn bir gününün ilk hargini griniz");
		char harf=scan.next().toUpperCase().charAt(0);
		
		if (harf=='P') {
			System.out.println("Pazar,\n Pazartesi \n Persembe”");
		}
		if (harf=='S') {
			System.out.println("salý");
		}
		if (harf=='C') {
			System.out.println("çarsamba \n cuma\n cumartesi ");
		}
		if(harf != 'P' && harf !=  'S' && harf != 'C'  ) {
			System.out.println("lütfen doðru bir harf griniz");
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
