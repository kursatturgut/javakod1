import java.util.Scanner;

public class ÝfÇ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		//gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
		//ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir gün ismi griniz:");
		String gun=scan.next().toUpperCase();
		
		
		if (gun.equals("CUMA")) {
			System.out.println("MÜSLÜMANLAR ÝÇÝN KUTASALDIR");
		}
		
		if (gun.equals("CUMARTESÝ")) {
			System.out.println("yahudiler için kutsaldýr ");
		}
		
		if (gun.equals("PAZAR")) {
			System.out.println("hristiyanlar için kutsaldýr");
		}
		if (gun !="CUMA" && gun != "CUMARTESÝ" && gun != "PAZAR") {
			System.out.println("normal bir gündür");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
