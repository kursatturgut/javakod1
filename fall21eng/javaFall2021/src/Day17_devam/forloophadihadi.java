package Day17_devam;

import java.util.Scanner;

public class forloophadihadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. 
		//Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfn bir string griniz");
		String a=scan.next();
		
		

		String tersyazým ="";
		
		for (int i = a.length()-1; i >=0; i--) {
		
			tersyazým+=a.substring(i, i+1);
			
		
		}
		System.out.println(tersyazým);
		
		if (a.equalsIgnoreCase(tersyazým)) {
			System.out.println("palidrome");
		} else {
System.out.println("not palýdrome");
		}
		
		
		
		
		
		
	}

}
