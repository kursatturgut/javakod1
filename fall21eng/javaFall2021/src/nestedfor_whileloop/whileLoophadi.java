package nestedfor_whileloop;

import java.util.Scanner;

public class whileLoophadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // kullanýcýdan toplanmak üzere sayýlar isteyin b
		// sayý adedi 10 u gecerse veya toplam 500 u gecerse 
	// bu kadar sayý yeter 
		// ... adet sayý girdin toplamý yazdýrýn 
		Scanner scan=new Scanner(System.in);
		
	int sayý=0;
	int adet=0;
	int toplam=0;
	
	while(!(adet>10) && !(toplam>=500)) {
		System.out.println("lütfen toplamk istediðiniz sayýlarý griniz");
		sayý=scan.nextInt();
		toplam+=sayý;
		adet+=1;
		
		
		
	}
	System.out.println(adet);
	System.out.println(toplam);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
