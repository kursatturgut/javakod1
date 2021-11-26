import java.util.Scanner;

public class ÖrnekDrumlar {

	public static void main(String[] args) {
/*
		Soru 3) Kullanicidan isim isteyin. Eger

	- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
	- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
	- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
*/		Scanner scan=new Scanner(System.in);
	  System.out.println("lütfen bir isim griniz");	
		String name=scan.next();
		
		if (name.contains("a")) {
			System.out.println("harf var");
		} else if (name.contains("Z")) {
			System.out.println("z içeriri");
		} else if (!name.contains("a")&& !name.contains("Z")) {
			System.out.println("a ve Z içermiyor");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
