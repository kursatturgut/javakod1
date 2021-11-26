package Day16forloopmuthiþ;

import java.util.Scanner;

public class ÝnterviewSoru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	oru 7 ) Interview Question Kullanicidan bir String isteyin ve 
    //       Stringi tersten yazdirin.
		Scanner scan=new Scanner(System.in);	
		System.out.println("lütfen kelime ");
		String kelime=scan.next();
		
		
		for (int i = kelime.length()-1; i >= 0; i--) {
			System.out.println(kelime.substring(i, i+1));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
