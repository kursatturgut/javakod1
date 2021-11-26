package day05_matematikselişlemler;

import java.util.Scanner;

public class yeniödev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner Scan=new Scanner(System.in);
		
		System.out.println("lutfen 4 basmaklı bi sayı giriniz");
		
		int sayı=Scan.nextInt();
		//rakamlar toplamını yaz 
		//1 yol
	  int ilkRakam=sayı%10;
      int ikincirakam=(sayı/10)%10;
      int üçüncüRakam=(sayı/100)%10;
      int düncüRakam=(sayı/1000)%10;
	System.out.println(ilkRakam+ikincirakam+üçüncüRakam+düncüRakam);	
	System.out.println("ilk sayı"+ilkRakam+"\nikinci sayı"+ ikincirakam);	
		
	
     
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
