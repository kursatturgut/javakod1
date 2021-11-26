package Day10_Switccase;

import java.util.Locale;

public class StringMnupulelowe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// verilen stringi buyuk ya da kucuk harfe ceviri 
		String isim ="ali"; // aLÝ olarak yazdýralým
		System.out.println(""+isim.toUpperCase().charAt(0)+
				           isim.toLowerCase().charAt(1)+
				           isim.toLowerCase().charAt(2));  // basýna hiçlik koymalýyýz 
		
		
		// turkçe lokal harfler kullanarak tamamýný kuçuk harfe cevirelim
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));  // dili deðiþtirdi.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
