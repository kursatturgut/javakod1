import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {
		// kullanýcdan ýký tam sayý alýp 2 tamsayýnýn 4 iþlem sonucunu yazdurunuz 
		
	Scanner scan=new Scanner(System.in);
	System.out.println("brinci tamsayýyý giriniz ");
	int sayý1=scan.nextInt();
			System.out.println("ikinci tamsayýyý giriniz ");
	int sayý2=scan.nextInt();
					
System.out.println("grilen sayýlarýn toplamý:"+(sayý1+sayý2));
System.out.println("grilen sayýlarýn farký:"+(sayý1-sayý2));
System.out.println("grilen sayýlarýn bölümü:"+(sayý1/sayý2));  //7 double kullanmadýðý için
System.out.println("grilen sayýlarýn toplamý:"+(sayý1*sayý2));
	
		
		
		
		
		
		
		
		
	}

}
