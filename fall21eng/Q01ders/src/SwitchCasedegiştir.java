import java.util.Scanner;

public class SwitchCasedegiþtir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gunleri yazdýrýn
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen gün bir gün numarasý griniz griniz");
		int gun=scan.nextInt();
	
		
		
		switch (gun)  {
		
		case 1:
			System.out.println("pazartesi pazar perþembe");
			break;
		case 2:
			System.out.println("salý");
			break;
		case 3:
			System.out.println("çarþamba");
			break;
		case 4:
			System.out.println("cuma");
		break;
		
		default :
			System.out.println("lutfen gecerli griniz");
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
