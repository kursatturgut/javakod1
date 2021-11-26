package day02;

import java.util.Scanner;

public class day2Ödev {

	public static void main(String[] args) {
	   
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir tam sayý giriniz");
		
		int sayý=scan.nextInt();

		System.out.println("bir tam sayýdaha giriniz");
	
		int sayý2=scan.nextInt();
	
		System.out.println(sayý+sayý2);
		System.out.println(sayý-sayý2);
		System.out.println(sayý*sayý2);
		
		System.out.println("karenin bir kenar uzunluðunu giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println(4 * kenar1);
		
		System.out.println("çemberin yarý çapýný griniz ");
		
		int çemberyarýçap=scan.nextInt();
		
		System.out.println("çember çevre ="+ çemberyarýçap*2*3);
		
		System.out.println("çember alan ="+ çemberyarýçap*çemberyarýçap*3);
				
		
		
		
		
		
	}
	
	
	
	

}
