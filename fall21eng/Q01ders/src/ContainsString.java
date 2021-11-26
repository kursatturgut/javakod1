import java.util.Scanner;

public class ContainsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// contains() metodu degerin var olup olmadýgýný sorgular varsa true getirir
		//Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
	//iceriyorsa “Email adresiniz kaydedildi”, icermiyorsa “Lutfen gmail mail adresinizi
//	giriniz.. “ yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen emailinizi griniz");
		String mail=scan.next();
		
		if (mail.contains("@gmail.com")) {
			System.out.println("kaydedildi");
		} else {
System.out.println("yeniden griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
