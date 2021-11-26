import java.util.Scanner;

public class ArtýkYýlSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// artik yil sorusu

				Scanner scan = new Scanner(System.in);
				System.out.print("Lütfen bir yýl giriniz : ");
				int year = scan.nextInt();
				System.out.println ("   ***   if cözumu   ***   ");
				if (year % 100 == 0 && year % 400 == 0) {
					System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL");
				} else if (year % 100 != 0 && year % 4 == 0) {
					System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL");
				} else {
					System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL deðildir.");
				}

				//  ternary cozumu ...
				System.out.println ("   ***   ternary cözumu   ***   ");

				String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
						: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
				System.out.println(result);
				

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
