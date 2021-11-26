import java.util.Scanner;

public class ÖdevKoordinat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //// Kullanýcýdan aldýðýnýz koordinat noktasýnýn hangi bölgede olduðunu yazdýran bir kod yazýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen koordinatý griniz");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1 bölge");
		}
		
		if (x<0 && y>0) {
			System.out.println("2 bölge");
		}
		
		
		if (x<0 && y<0) {
			System.out.println("3 bölge");
		}
		if (x>0 && y<0) {
			System.out.println("4 bölge");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
