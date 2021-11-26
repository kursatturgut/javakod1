package Day19doWwhileLoop;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen sayý griniz rakamlarýný toplayacagým");
		int sayý=scan.nextInt();
		
		int rakamlarToplamý=0;
		int rakam=0;
	//ÝNT Ý STRÝNGE CEVÝRÝP BASAMAK SAYISINI BULMAK ÖNEMLÝ
	
		String Sayýstr=""+sayý;  // basýna hiçlik eklersek string olur !!!!!!!!!!!!!!!!
		 for (int i = 0; i < Sayýstr.length(); i++) {
			     rakam=sayý%10;
				rakamlarToplamý+=rakam;
				sayý/=10;

		 
		 }
	System.out.println(rakamlarToplamý);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
