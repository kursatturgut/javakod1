package day08;

import java.util.Scanner;

public class ÝfAlýþtýrma9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	* Soru 3) Kullanicidan gun ismini alin ve 
    //* haftaici veya hafta sonu oldugunu yazdirin 
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir gün griniz:");
		String gün=scan.next().toUpperCase();
		
		if (gün.equals("PAZAR") || (gün.equals("CUMARTESÝ"))) {
			System.out.println("hafta sonu tatil");
		} else {
System.out.println("HAFTA ÝÇÝ TATL DEÐÝL");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
