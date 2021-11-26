package days9;

import java.util.Scanner;

public class İfElsedevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    //Kullanicidan bir sifre girmesini isteyin
   // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
   // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
		
	Scanner scan=new Scanner(System.in);	
		
		System.out.println("lütfen bir sifre giriniz");
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {  // buyuk harfleri seçmiş oluruz 
		       if (ilkKarakter=='A') {
				System.out.println("gecerli şifre");
			}   else {
System.out.println("gecersiz sifre");
			}
			
			
			
	} else if((ilkKarakter>='a' && ilkKarakter<='z')){
                 if (ilkKarakter=='z') {
	System.out.println("gecerli sifre");
}                 
                 else {

	System.out.println("gecersiz sifre");
}
			
	}else {// kalanlar ne olacaktı buyuk değil kucuk değil kalan tum karakterler burda 

			
			System.out.println("gecerli olmsı için harfle başlayın ");
		}
		
scan.close();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
