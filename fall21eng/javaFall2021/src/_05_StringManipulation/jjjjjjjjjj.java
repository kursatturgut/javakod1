package _05_StringManipulation;

import java.util.Scanner;

public class jjjjjjjjjj {

	private static final String String = null;

	public static void main(String[] args) {
		
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
		
		String ilkyarý=null;
		
		
		zuznluk(ilkyarý );
		
		
		
	
		
	}

	private static void zuznluk(java.lang.String ilkyarý) {
		
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("çift uuznlukta bir degiþken griniz");
		String uzun=scan.next();
		
if (uzun.length()%2==0) {
	System.out.println(uzun.charAt(0)+uzun.substring(uzun.length()/uzun.length(),uzun.length()/2));	
			
		}else  {
			System.out.println("lütfen cift uzunlukta kelime griniz");
		}
		
		
	}

	

	

}
