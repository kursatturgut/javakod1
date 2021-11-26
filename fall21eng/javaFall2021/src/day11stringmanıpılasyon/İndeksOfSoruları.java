package day11stringmanýpýlasyon;

import java.util.Scanner;

public class ÝndeksOfSorularý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan bir cumle ve bir harf isteyin,
  //  harfin cumlede var olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle griniz");
		String cumle=scan.nextLine();
		System.out.println("lütfen varlýðýný kontrol etmek için bir harf grin");
		char krk=scan.next().charAt(0);
		
		int index=cumle.indexOf(krk);   // girilen karakterin cümledeki indexsini verir -1 cýksa indek cümlede yok demek 
		
		if (index<0) {  // index == -1  de olur du.
			System.out.println("girdiðiniz harf cümlede yok");
		} else {
System.out.println("girdiðiniz harf cümledevar");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
