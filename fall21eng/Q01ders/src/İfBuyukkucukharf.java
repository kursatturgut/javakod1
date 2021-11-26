import java.util.Scanner;

public class İfBuyukkucukharf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter griniz");
		char character=scan.next().charAt(0);
		
		if (character>='A' && character<='Z' ) {
			System.out.println("caharacter: buyuk harftir");
		} else if (character>='a' && character<='z' ) {
			System.out.println("caharacter: küçük harftir");
		} else {
System.out.println("hatalı griş");
		}{

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
