package Day17_devam;

import java.util.Scanner;

public class Fordevamhadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin 
// ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý griniz 10 dan küçük olsun");
		int sayý1=scan.nextInt();
	
	int fakroriyel=1;
	
	for (int i = sayý1; i >0 ; i--) {
		
	fakroriyel*=i;
	}
	
	System.out.println(fakroriyel);
	
	
	
	
	
	
	
	
	
	
	
	}

}
