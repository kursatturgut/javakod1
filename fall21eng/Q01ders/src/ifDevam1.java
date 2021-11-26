import java.util.Scanner;

public class ifDevam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Soru 2) Kullanicidan bir karakter girmesini isteyin ve 
        //         girilen karakterin harf olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter griniz");
		
		char krk=scan.next().charAt(0);
		
		if (krk>='A'&&krk<='Z'|| krk>='a'&& krk<='z') {
			System.out.println("harftir");
		} else {
System.out.println("lütfen gecerli bir karakter griniz ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
