package Day16forloopmuthiş;

import java.util.Scanner;

public class intervievfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Soru 9 ) Interview Question Kullanicidan bir String isteyin.
//Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
	//	PALİDROM
		Scanner scan=new Scanner(System.in);	
		System.out.println("lütfen kelime ");
		String kelime=scan.next();
		
		
		cagır(kelime);
		
		System.out.println(cagır(kelime));
		
		if (kelime.equals(cagır(kelime))) {
			System.out.println("POLİDROM");
		} else {
System.out.println("değil");
		}
		
		
		
		}

	private static String cagır(String kelime) {
		String yeni="";
		for (int i =kelime.length()-1; i >= 0; i--) {
			yeni+=kelime.substring(i, i+1);
		
		
	}

	return yeni;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
