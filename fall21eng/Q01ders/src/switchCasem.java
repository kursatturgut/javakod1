import java.util.Scanner;

public class switchCasem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanicidan bir sayi girmesini isteyin

		/*Girilen sayi
		10 ise “Iki basamakli en kucuk sayi
		100 ise “uc basamakli en kucuk sayi”
		1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý griniz");
		int sayý=scan.nextInt();
		
		switch (sayý) {
		case 10:
			System.out.println(" iki basmaklý en kucuk sayý");
			break;
		case 100:
			System.out.println("üç basmaklý en kucuk sayý");
			break;
		case 1000:
			System.out.println("dort basmaklý en kucuk sayý");
			break;
		default:
			System.out.println("sayý degiþtrin");
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
