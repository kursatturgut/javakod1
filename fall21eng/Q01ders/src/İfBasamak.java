import java.util.Scanner;

public class İfBasamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen pozitif bir sayı griniz");
		int sayı=scan.nextInt();
		
		if (sayı>=100 && sayı<1000) {
			System.out.println("üç basamaklı");
		} else if (sayı%2==0) {
			System.out.println("üç basmaklı olmayan çift sayı");
		} else {
System.out.println("üç basmaklı olmayan tek sayı");
		}{

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
