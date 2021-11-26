package Day17_devam;

import java.util.Scanner;

public class forlooptersinedon {

	public static void main(String[] args, Object String) {
		
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin 
       // ve Stringi tersine ceviren bir method yazin.
				
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen String griniz");
		String d=scan.next();
		
		
	ters(d);
	
	System.out.println(ters(d));	
		
	String	tersine="";
	}

	public static String ters(String d) {
		
		for (int i =d.length()-1; i <= 0; i--) {
		String tersine = d.substring(i,+1);
			
	
		}
		return d;
		
		
		
	
	
	
	}

}
