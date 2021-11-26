import java.util.Scanner;

public class HlukhocaÖdev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*  Problem Tanýmý
        Kullanýcýdan bir tarihi gün, ay ve yýl þeklinde alýp bu tarihi
        ay, gün, yýl ve yýl, ay, gün sýralarýna çevirerek yazan bir kod yazýnýz.
    	TRICK: her else komutundan sonra return; komutu kullanýnýz...

        Örnek Ekran Çýktýsý
        Lütfen günü giriniz: 10
        Lütfen ayý giriniz: 02
        Lütfen yýlý giriniz: 2009
        Gün ay yýl: 10.02.2009
        Ay gün yýl: 02.10.2009
        Yýl ay gün: 2009.02.10
        */	
		Scanner scan=new Scanner(System.in);
		System.out.print("lütfen günü rakm olarak griniz");
		int gun=scan.nextInt();
		System.out.print("lütfen ayý rakama olarak griniz");
		int ay=scan.nextInt();
		System.out.print("lütfen yýlý rakama olarak griniz");
		int yýl=scan.nextInt();
		
System.out.println("tarih :"+ay+"."+gun+"."+yýl);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
