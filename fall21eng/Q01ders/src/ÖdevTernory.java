import java.util.Scanner;

public class ÖdevTernory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
Scanner scan=new Scanner(System.in);
System.out.println("lütfen bir sayı griniz");
int sayı=scan.nextInt();

   String sonuc=  (sayı>=0) ? (sayı<10? "rakam" :"pozitif sayı"  )  : "negatif sayı"  ; 
System.out.println(sonuc);		
		
	if (sayı>=0) {
		   if (sayı<10) {
			System.out.println("rakam");
		} else {
System.out.println("pozitif sayı");
		}
		
		
		
	} else {
System.out.println("negatif sayı");
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
