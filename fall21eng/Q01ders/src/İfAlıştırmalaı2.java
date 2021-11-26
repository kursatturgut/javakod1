import java.util.Scanner;

public class ÝfAlýþtýrmalaý2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen bir tam sayý giriniz:");
		int sayý1=scan.nextInt();
		
		if (sayý1%2 ==0) {
			System.out.println("girdiðiniz sayý çift sayýdýr");
		}
		
		if (sayý1%2 !=0) {
			System.out.println("girdiðiniz sayý tek saydýr");
		}
		
	}

}
