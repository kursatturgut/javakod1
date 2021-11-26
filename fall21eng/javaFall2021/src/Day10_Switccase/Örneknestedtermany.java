package Day10_Switccase;

public class Örneknestedtermany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru2 : Kullanicidan bir harf isteyin
				// kucuk harf ise consola “Kucuk Harf” ,
				// buyuk harfse consola “Buyuk Harf”
				// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		
		char karakter='s';
		
		String sonuc= (karakter>='a' && karakter<='z')? "küçük harf":( (karakter>='A'&& karakter<='Z')? "büyük harf":"karakter değildir" );
		
		
		System.out.println(sonuc);
		
		
		
		
		
		
		
		
		
		
		
	}

}
