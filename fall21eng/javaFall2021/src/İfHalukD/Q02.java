package ÝfHalukD;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farký diger kenardan büyük olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen 
			 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayý griniz");
	    System.out.println("lütfen bir tam sayý dah griniz");
		System.out.println("lütfen 3. tamsayýnýzý griniz");
		                int sayý1=scan.nextInt();
				        int sayý2=scan.nextInt();
						int sayý3=scan.nextInt();
		if (sayý1+sayý2>sayý3 && sayý3>sayý1-sayý2) {
		       if (sayý1+sayý3>sayý2 && sayý2>sayý1-sayý3) {
				if (sayý2+sayý3>sayý1 && sayý1>sayý2-sayý3) {
					System.out.println("üçgendir");
					if (sayý1==sayý2 &&sayý2==sayý3) {
						System.out.println("eþkenar üçgen");
					}
				}
			}	
		}else {
			System.out.println("lütfen üçgen griniz");
		}
		
		
		
		
		
	

				

	}

}
