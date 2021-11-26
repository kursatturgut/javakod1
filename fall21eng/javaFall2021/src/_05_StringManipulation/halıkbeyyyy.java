package _05_StringManipulation;

import java.util.Scanner;

public class halýkbeyyyy {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

Scanner scan=new Scanner(System.in);
System.out.println("lütfen 4 harfli iminizi giriniz");
String kelime=scan.next();

System.out.println(""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));		
		
System.out.println(kelime.substring(4)+kelime.substring(3, 4)+kelime.substring(2, 3)+kelime.substring(1, 2)+kelime.substring(0, 1));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
