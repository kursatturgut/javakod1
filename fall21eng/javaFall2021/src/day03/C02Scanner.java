package day03;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("lütfen çemberin yarý çapýný giriniz");
		
		double yarýcap=scan.nextDouble();
		
		double alan=3.14*yarýcap*yarýcap;
		
		System.out.println(alan);
		
		double çevre=2*3.14*yarýcap;
		System.out.println(çevre);
		
		
		
		
		
		
		
		
		
	
	}

}
