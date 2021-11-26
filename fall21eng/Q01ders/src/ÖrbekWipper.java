import java.util.Scanner;

public class ÖrbekWipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("lütfen bir sayý giriniz:");
		
		String sayý1=scan.nextLine();
		
		System.out.println("lütfen bir sayý daha giriniz:");
		
		String sayý2=scan.nextLine();
		
		System.out.println(Integer.valueOf(sayý1+sayý2)); // burda aslýnda string gibi haretet etti.
		
		System.out.println(Integer.valueOf(sayý1)+Integer.valueOf(sayý2));
		
		System.out.println(Integer.valueOf(sayý1)*Integer.valueOf(sayý2));
		
		
		
	}

}
