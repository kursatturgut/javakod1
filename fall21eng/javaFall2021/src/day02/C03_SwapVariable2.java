package day02;

public class C03_SwapVariable2 {

	public static void main(String[] args) {
		
		//verilen sayı 1 ve sayı 2 leri 3 bir variable olmadan swap program yapımnız 
		// sayı1=10   sayı2 =20
		
		int sayı1=15;
		int sayı2=20;
		
		System.out.println("önce sayı="+sayı1+"veikinci say="+sayı2);
		
		// ikinci bir veriable kullanmayacaksak sayıların farkından isitifade ederiz 
		
		
		// 1 saıların farkını ilk sayıya atıyorum assıng 
		// 2 fark ile sayı 2 yi toplayıp sayı2 ye assin ediyorum 
		// 3 sayı1 e sayı 2 eksi fark assing ediyorum 
		
		sayı1=sayı1-sayı2;
		sayı2=sayı1+sayı2;
		sayı1=sayı2-sayı1;
		
		System.out.println("öncesayı ="+sayı1+"veikinci say="+sayı2);
				
		
	
		 //System.out.println("önce sayı="+sayı1+"veikinci say="+sayı2); neden sayı1 den önce ve sonra + koyuyoruz 
		
		
		//verilen iki değerin yerini değiştirme 
		System.out.println("başlangıçta takım="+50+"başlangıçta zakım="+80);
		
		int takım=50;
		int zakım=80;
		    takım=takım-zakım;  //-30
		    zakım=takım+zakım;// 50
		    takım=zakım-takım;
		System.out.println("başlangıçta takım="+takım+"başlangıçta zakım="+zakım);    
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
