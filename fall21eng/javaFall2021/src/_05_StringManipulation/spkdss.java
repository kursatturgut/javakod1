package _05_StringManipulation;

import java.util.Scanner;

public class spkdss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir kelime griniz");
		String kelime=scan.next();
	
	length(kelime);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void length(String kelime) {
		if (kelime.length()>=3) {
			System.out.println(kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2));
		} else {
System.out.println(kelime);
		}
		
	}

}
