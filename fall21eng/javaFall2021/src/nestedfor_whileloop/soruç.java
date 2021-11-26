package nestedfor_whileloop;

import java.util.Scanner;

public class soruç {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Soru 5 ) Kullanicidan bir sifre etti. 
	 Girilen sifreyi asagidaki sartlara gore kontrol edin 
	 ve sifredeki hatalari yazdirin.
	Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
ve gecerli sifre girdiginde "Sifreniz Kabil edilmiþtir" yazdirin.
- Sifre küçük harf icererek
- Sifre buyuk harf icererek
- Sifre ozel karakter icererek
	- Sifre en az 8 karakter olmalidir.
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen þifre");
	String sifre=scan.nextLine();
	
String  küçükharf="abcdefghýijklmnoöprsþtuüvyz";
String  buyukharf="ABCÇDEFGHIÝJKLMNOÖPRSÞTUÜVYZ";	
String  özel="!+^&%(/)=?_é";
	
for (int i = 0; i < sifre.length(); i++) {
	if (sifre.substring(i).equals(küçükharf.indexOf(i))) {
		
	}


}
	
	
	
	
	
	
	
	
	}

}
