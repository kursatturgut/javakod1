import java.util.Scanner;

public class SwitchCaseDonustur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gün numarasýna göre gün isimlerini yazduýrýlým
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen gün numarasýný griniz");
		
		int gunNo=scan.nextInt();
		
		switch (gunNo) {
		case 1 :
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("salý");
			break;
		case 3 :
			System.out.println("çarsamba");
			break;
		case 4:
		 System.out.println("persembe");	
		 break;	
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("ctesi");
			break;
		case 7 :
			System.out.println("pazar");
			break;
			default:
				System.out.println("lütfen gecerli bir numara yazýnýz ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
