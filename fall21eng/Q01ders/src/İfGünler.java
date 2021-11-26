import java.util.Scanner;

public class ÝfGünler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen haftanýn bir gününn ilk harfini giriniz");
		
		char gün=scan.next().toLowerCase().charAt(0);
		
		if (gün=='p') {
			System.out.println("pazartesi"+"\n"+"perþembe"+"\n"+"pazar");
		}
		if (gün=='s') {
			System.out.println("salý");
		}
		if (gün=='c') {
			System.out.println("cuma , CUMARTESÝ");
		}
		if (gün=='ç') {
			System.out.println("çarþamba");
		}
		
		//tum harfleri küçük kabul et dedim bunu diyerek kullanýcý griþi ne olursa olsun ilk harfi küçük yapacak
		if (gün!='c' && gün!='s' && gün!='p'&& gün!='ç'  ) {
			System.out.println("lütfen gün isimlerinden birinin baþ harfini giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
