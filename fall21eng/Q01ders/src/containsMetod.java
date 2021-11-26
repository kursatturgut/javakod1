import java.util.Scanner;

public class containsMetod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Lütfen mail adresinizi griniz");
		String email=scan.nextLine();
  System.out.println(email.contains("@gmail.com"));
		
   boolean ad=email.contains("@gmail.com");
		
		if (ad==true) {
			System.out.println("kaydedildi");
		} else {
System.out.println("mail griniz");
		}
		
		if (email.contains("@gmail.com")==true) {
			System.out.println("kaydedildi");
		} else {
			System.out.println("mail griniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
