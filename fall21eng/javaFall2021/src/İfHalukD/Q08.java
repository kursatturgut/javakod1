package İfHalukD;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("lütfen aldığınız urunun önce adedini sonra fiyatını griniz");
		double adet=scan.nextDouble();
		double fiyat=scan.nextDouble();
		System.out.println("müşeteri kartınız var mıdır ? var ise 1 i yoksa 0 tuslaynız");
	int kart=scan.nextInt();
	
	if (kart==1) {
		   if (adet>10) {
			System.out.println(fiyat*20/100);
			  double fiyat2=fiyat-(fiyat*20/100);
			  System.out.println("ödenecek tutar="+adet*fiyat2);
		}else {
			System.out.println(fiyat*15/100);
			 double fiyat3=fiyat-(fiyat*15/100);
			  System.out.println("ödenecek tutar="+adet*fiyat3);
		}
	}if (kart==0) {
		  if (adet>10) {
			System.out.println(fiyat*15/100);
			 double fiyat4=fiyat-(fiyat*15/100);
			  System.out.println("ödenecek tutar="+adet*fiyat4);
		}else {
			System.out.println(fiyat*10/100);
			 double fiyat5=fiyat-(fiyat*15/100);
			  System.out.println("ödenecek tutar="+adet*fiyat5);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
