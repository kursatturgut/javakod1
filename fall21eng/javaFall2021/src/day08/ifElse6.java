package day08;

import java.util.Scanner;

public class ifElse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
				//         Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
				//         60 – 80.000 arasinda ise “Konusabiliriz”,
				//         60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("lütfen maaþ teklifinizi giriniz");
			
			double teklif=scan.nextDouble();
		
		if (teklif>80000) {
			System.out.println("kabul ediyorum");
		} else if(teklif>60000){
			System.out.println("konuþalým");
		}else {
			System.out.println("reddediyorum");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
