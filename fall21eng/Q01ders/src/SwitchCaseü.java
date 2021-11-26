import java.util.Scanner;

public class SwitchCaseü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen haftanýn kaçýncý gününde oldugunuzu griniz");
		int gun=scan.nextInt();
		
		switch (gun) {
		case 1: {
             System.out.println("pazartesi");			
		break;	
		}
		case 2:{
			System.out.println("salý");	
			break;
		}case 3:{
			System.out.println("carsamba");	
			break;
		}case 4:{
			System.out.println("persembe");	
			break;
			
		}case 5:{
			System.out.println("cuma");	
			break;
		}case 6:{
			System.out.println("cumartesi");	
			break;
			
		}case 7:{
			System.out.println("pazar");
			break;
		}
			
		default:
			System.out.println("lütfen gecerli bir sayý griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
