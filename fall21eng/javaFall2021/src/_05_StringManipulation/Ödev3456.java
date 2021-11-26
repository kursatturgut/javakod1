package _05_StringManipulation;

import java.util.Scanner;

public class Ödev3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	       kullanýcýdan bir e-posta adresi girmesini isteyin, ardýndan "hotmail" içeriyorsa, "gmail" ile deðiþtirin,
	        örneðin: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen mail adresinzi griniz");
	String mail=scan.next();
	
	if (mail.contains("@hotmail")) {
		         System.out.println(mail.replace("@hotmail", "@gmail"));
	} else {
System.out.println(mail);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
