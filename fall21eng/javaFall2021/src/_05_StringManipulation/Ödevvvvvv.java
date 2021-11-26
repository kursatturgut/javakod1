package _05_StringManipulation;

import java.util.Scanner;

public class Ödevvvvvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir isim griniz");
		String isim=scan.next();
		
		
		length(isim);
		
		
		
		
		
		
		
		
	}

	private static void length(String isim) {
	 if (isim.length()==3) {
		   if (isim.charAt(0)==isim.charAt(1)&& isim.charAt(1)==isim.charAt(2)) {
			   System.out.println("harfler ayný");
		} else {
System.out.println("harfler farklý");
		}
		 
		 
		 
	} else {
System.out.println("lütfen üharfli griniz");
	}
		
	}

}
