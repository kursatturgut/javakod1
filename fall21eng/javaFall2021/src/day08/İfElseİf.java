package day08;

import java.util.Scanner;

public class İfElseİf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini 
		//yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere 
		//sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, sayilardan sifira esit olan varsa
		//“sifir carpmaya gore yutan elemandir” yazdirin.
		
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("lütfen 1.sayıyı grin");
			
			double sayı1=scan.nextDouble();
		
			System.out.println("lütfen 2.sayıyı grin");

			double sayı2=scan.nextDouble();
		
		if (sayı1>0 && sayı2>0) {
			System.out.println("sayıların toplamı :"+ (sayı1+sayı2));
		} else  if(sayı1<0 && sayı2<0) {                                                                 //else 
			System.out.println("sayıların çarpımı :"+ sayı1*sayı2);
		}  else if (sayı1*sayı2<0){
			System.out.println("farklı işaretlerde işlem yapamazssın");
		}else {
			System.out.println("sıfır çarpmaya göre yutan elmandır ");
		}
		
		
		
		
		
		
		
	}

}
