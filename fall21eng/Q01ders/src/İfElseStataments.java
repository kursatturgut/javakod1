import java.util.Scanner;

public class ÝfElseStataments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup

//		olmadigini yazdirin

//		Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup

//		olmadigini yazdirin
	Scanner scan=new Scanner(System.in);	
		System.out.println("lütfen dörtgenin\n 1 kenar  griniz");
		int kenar1=scan.nextInt();
		System.out.println("lütfen dörtgenin\n 2 kenar  griniz");
		int kenar2=scan.nextInt();
		System.out.println("lütfen dörtgenin\n 3 kenar  griniz");
		int kenar3=scan.nextInt();
		System.out.println("lütfen dörtgenin\n 4 kenar  griniz");
		int kenar4=scan.nextInt();
		
		
		if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4) {
			System.out.println("karedir");
		} else {
System.out.println("kare deðildir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
