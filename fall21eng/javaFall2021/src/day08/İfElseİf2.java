package day08;

import java.util.Scanner;

public class ÝfElseÝf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
				//			Not’u harf sistemine cevirip yazdirin.
				//			50’den kucukse “D”,
				//			50-60 arasi “C”,
				//			60-80 arasi “B”,
				//			80’nin uzerinde ise “A”
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("lütfen notunuzu giriniz ");
			
			double not=scan.nextDouble();
		
			if (not<0 || not>100) {
				System.out.println("lutfen gecerli bir not yazýnýz  ");
			} else if(not<50){
                System.out.println("notunuz  : D");               
			} else if(not<60){
				System.out.println("notunuz: C");
			}else if(not<80){
				System.out.println("notunuz: D");
			}else  
				System.out.println("notunuz: A");
			
				
				

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
