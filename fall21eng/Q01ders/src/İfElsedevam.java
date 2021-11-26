import java.util.Scanner;

public class ÝfElsedevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
		//“Eskenar degil” yazdirin.
		Scanner scan =new Scanner(System.in);
		System.out.println("lürtefen üçgenin \n 1 kenar uzunluðunu giriniz");
		double kenar1=scan.nextDouble();
		System.out.println("lürtefen üçgenin \n 2 kenar uzunluðunu giriniz");
		double kenar2=scan.nextDouble();
		System.out.println("lürtefen üçgenin \n 3 kenar uzunluðunu giriniz");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("üçgeniniz eskenar içgendir");
		} else {
        System.out.println("üçgeniniz eþsiz kenardýr");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
