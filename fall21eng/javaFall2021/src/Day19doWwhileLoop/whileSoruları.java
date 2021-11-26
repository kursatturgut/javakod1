package Day19doWwhileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class whileSorularý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen sayý griniz rakamlarýný toplayacagým");
	int sayý=scan.nextInt();
	
	int rakamlarToplamý=0;
	int rakam=0;
	
	while (sayý>0) {
		rakam=sayý%10;
		rakamlarToplamý+=rakam;
		sayý/=10;
		
	}
	System.out.println(rakamlarToplamý);
	
	
	rakamlarToplamý=0;
	String Sayýstr=""+sayý;  // basýna hiçlik eklersek string olur !!!!!!!!!!!!!!!!
 for (int i = 0; i < Sayýstr.length(); i++) {
	     rakam=sayý%10;
		rakamlarToplamý+=rakam;
		sayý/=10;

 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
