package Day17_devam;

import java.util.Scanner;

public class forlooppractised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Soru 10 ) Kullanicidan iki sayi isteyin. 
		 Girilen sayilar ve aralarindaki tum tamsayilari toplayip, 
		 sonucu yazdiran bir program yaziniz

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý griniz 1 sayýdan sonra enter yapýnýz ");
	     int sayý1=scan.nextInt();
	     int sayý2=scan.nextInt();
	     int kucuk;
	     int buyuk;
	     
	if (sayý1<sayý2) {
		kucuk=sayý1;
		buyuk=sayý2;
				
	} else {
       buyuk=sayý1;
       kucuk=sayý2;
	}
	     int toplam=0;
	     
	     for (int i = kucuk; i <= buyuk; i++) {
		toplam+=i;
	}
	System.out.println(toplam);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
