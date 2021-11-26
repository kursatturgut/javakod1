package Day10_Switccase;

import java.util.Scanner;

public class ternarysoruNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir
		// Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.
		

 // scaner olusturmak yerne TEST DATALARINI VARÝABE OLAARK OLUSTRUP YAZILIM BÝTTÝÐÝNDE DATALARI DEÐÝÞTÝREREK KODLARIMIZI TEST EDEBÝLÝRÝZ 	
	
		char cinsiyet ='K';
    	int   yas=55;	
		
		
		String sonuc =cinsiyet=='K'?     (yas>=60 ? "emeklisin":"deðilsin"):
			                             (yas>=65? "emeklisin":"degilsin");
		
		
		System.out.println(sonuc);
		
		
		
		
		
	}

}
