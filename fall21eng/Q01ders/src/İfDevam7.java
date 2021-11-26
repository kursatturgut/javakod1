import java.util.Scanner;

public class İfDevam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Soru 6) Kullanicidan iki sayi isteyin, 
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
        // sayilarin ikisi farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin, 
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

Scanner scan=new Scanner(System.in);
double sayı1=scan.nextDouble();
double sayı2=scan.nextDouble();

if (sayı1>0 && sayı2>0) {
	System.out.println(sayı1+sayı2);
} else if (sayı1<0  && sayı2<0) {
	System.out.println(sayı1*sayı2);
} else if (sayı1<0  && sayı2>0 || sayı1>0 && sayı1<0) {
	System.out.println("işlem olmaz ");
} else if (sayı1==0 || sayı2==0) {
	System.out.println("sıfır yutar");
}{

} {

}{

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
