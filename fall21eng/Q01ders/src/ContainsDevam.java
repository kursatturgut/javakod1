import java.util.Scanner;

public class ContainsDevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
	//cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
	//yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
	//yazdirin.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen cümle");
		String cumle=scan.nextLine();
		
		if (!cumle.contains("buyuk")&& !cumle.contains("kucuk")) {
			System.out.println("içermiyor");
		} else if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		}{

		}{

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
