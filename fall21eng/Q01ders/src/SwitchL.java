import java.util.Scanner;

public class SwitchL {

	public static void main(String[] args) {
		// : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen kaçýncý ayda oldugumuzu griniz");
		int ay =scan.nextInt();
		
		switch (ay) {
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("subat");
		case 3:
			System.out.println("mart");
			break;
		case 4:
			System.out.println("nisan");
			break;
		case 5:
			System.out.println("mayýs");
			break;
		case 6:
			System.out.println("hazýran");
			break;
		case 7:
			System.out.println("tem");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("octomber");
			break;
		case 11:
			System.out.println("novomber");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("please write clear mounth");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
