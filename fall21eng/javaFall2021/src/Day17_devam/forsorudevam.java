package Day17_devam;

import java.util.Scanner;

public class forsorudevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	oru 10 ) Kullanicidan iki sayi isteyin.
//Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
//sonucu yazdiran bir program yaziniz
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen iki sayý griniz");
	int sayý1=scan.nextInt();
	int sayý2=scan.nextInt();
	
	int küçük=0;
	int buyuk=0;
	
	if (sayý1>sayý2) {
		buyuk=sayý1;
		küçük=sayý2;
	} else {
buyuk=sayý2;
küçük=sayý1;
	}
	
	 int topmlamý=0;
	 for (int i = küçük; i <=buyuk; i++) {
		
		topmlamý+=i; 
	}
	System.out.println(topmlamý);
	
	
	
	}

}
