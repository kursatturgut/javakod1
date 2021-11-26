package ÝfHalukD;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lütfen bir sayý griniz");
		double sayý1=scan.nextDouble();
		System.out.print("lütfen bir sayý daha griniz");
		double sayý2=scan.nextDouble();
		
		System.out.println("toplama için -> 1 \n cýkarmaiçin -> 2 \n carpmama için -> 3 \n bölmeiçin -> 4 ");
		// kullanýcýdan veri gelecegi için int  atadým 
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.print(sayý1+sayý2);
		}else if (islem==2) {
			System.out.print(sayý1-sayý2);
		}else if (islem==3) {
			System.out.print(sayý1-sayý2);
		}else if (islem==4) {
			System.out.print(sayý1/sayý2);
		}else {
			System.out.print("hatalý griþ yaptýnýz");
		}
		 
		
		
		
	
	
	
	
	
	}

}
