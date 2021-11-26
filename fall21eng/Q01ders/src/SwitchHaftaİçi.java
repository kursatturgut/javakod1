import java.util.Scanner;

public class SwitchHaftaÝçi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen gun ismini griniz");
		
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "salý":
		case "çarþamba":
		case "perþembe":
		case "cuma":
			System.out.println("haftaiçi");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("haftasonu");
			break;
		default:
			System.out.println("lütfen dogru gun griniz");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
