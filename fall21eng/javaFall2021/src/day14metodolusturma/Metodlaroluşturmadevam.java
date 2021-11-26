package day14metodolusturma;

import java.util.Scanner;

public class Metodlaroluþturmadevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullanýcýdan iki sayý isteyelim
		// sayýlarý karelerini ve küplerini toplayýp yazdýran  iki ayrý metot yazýn
		// kullanýcýya us  sorun
		// 2 yazarsa karleri toplamý yapan metod 
		// uc yazarsa kupler toplamýný yapan metod calýssýn 
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfn iki sayý griniz\n ikinci sayý için entere basnýz");
	int sayý1=scan.nextInt();
	int sayý2 =scan.nextInt();
	System.out.println("lütfen kare toplam için 2 küp için 3 griniz");

	int istek=scan.nextInt();
	switch (istek) {
	case 2:
			karelerToplamý(sayý1,sayý2);	
		break;
	case 3 :
		küplerToplamý(sayý1,sayý2);
		break;
		default:
			System.out.println("lütfen istene iki griþi yaoýnýz");
	}
		
		
		
		
	}

	public static void küplerToplamý(int sayý1, int sayý2) {
		System.out.println((sayý1*sayý1*sayý1)+(sayý2*sayý2*sayý2));
	}

	public static void karelerToplamý(int sayý1, int sayý2) {
		System.out.println((sayý1*sayý1)+(sayý2*sayý2));
	}

	

}
