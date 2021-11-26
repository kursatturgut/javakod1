package days9;

import java.util.Scanner;

public class ÝfNestedÝf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Soru12)Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. Girdiði sayi 5’e  bölünüyorsa son rakamýný kontrol edin.
		//Son rakamý 0 ise ekrana “5’e bölünen  çift sayý” yazdýrýn. 
		//Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.  Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		
         Scanner scan=new Scanner(System.in);	
		
		System.out.println("lütfen 4 basmaklý bir sayý  giriniz");
		int sayý=scan.nextInt();
		
		if (sayý<1000 || sayý>9999) {
			System.out.println("4 basmaklý sayý grin dedik");
		} else {
                 if (sayý%5==0) {
	                      if (sayý%10==0) {
						     System.out.println("5 e bölünen  çift sayý bölünür");
					}           else {
                                      System.out.println("5 e bölünen tek sayý");
					}
	
	
	              }else {
System.out.println("lütfen tekrar deneyin");
}
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
