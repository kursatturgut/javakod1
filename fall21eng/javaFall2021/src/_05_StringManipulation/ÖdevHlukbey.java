package _05_StringManipulation;

import java.util.Scanner;

public class ÖdevHlukbey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /*

         * Kullanýcýdan aldýðýnýz  Adý, Soyadý ve kredi kartý numaralarýný aþaðýdaki gibi özel forma dönüþtürün
         * Kredi kartý numarasýný kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartý numarasý" yazdýrýn.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adýn baþ harfleri ve soyadý büyük olmalýdýr)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */	
		
		kontrol();
		
		
		
		
	}

	public static void kontrol() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen adýnýzý sosyadýnýzý ve kredi kartý numaranzýý griniz \n ad yazdýktan sonra enter ve sosyad yazdýktan smra enter basýnýz");
		String ad=scan.nextLine();
		String soyad=scan.nextLine();
		String kart=scan.next();
		 if (kart.length()!=16) {
			System.out.println("gecersiz kart no");
		}else {
		System.out.println(ad.toUpperCase().charAt(0)+(ad.replaceAll("\\w", "*")));	
		System.out.println(soyad.toUpperCase().charAt(0)+(ad.replaceAll("\\w", "*")));
		System.out.println(kart.replaceAll("\\w", "*")+(kart.substring(kart.length()-4)));
		}
		
		
		
	}

}
