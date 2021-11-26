package day08;

import java.util.Scanner;

public class çalýþma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
			
		
		System.out.println("lütfen maaþ teklifinizi giriniz");
		
		double teklif=scan.nextDouble();
	
	if (teklif<60000) {
		System.out.println("kabul etmiyorum");
	} else if(teklif>80000){
		System.out.println("kabul etdiyorum");
	}else {
		System.out.println("konuþalým");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
