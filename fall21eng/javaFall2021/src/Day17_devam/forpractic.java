package Day17_devam;

import java.util.Scanner;

public class forpractic {

	public static void main(String[] args) {
		// T
		// Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 10dan küçük tamsyaı giriniz");
		int sayı=scan.nextInt();
		
		
		
		int fak=1;
		
		for (int i = sayı; i > 0; i--) {
		
			
			fak*=i;
			
			
			
			
			
			
			
			
			
			
			
		}
		
		System.out.println("istenen sayının faktöriyeli="+fak);
		
		
		
		
		
		
		
		
		
		
		
	}

}
