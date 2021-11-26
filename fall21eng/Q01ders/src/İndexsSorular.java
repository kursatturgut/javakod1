import java.util.Scanner;

public class ÝndexsSorular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup

	// olmadigini yazdirin
Scanner scan=new Scanner(System.in);

System.out.println("lütfen bir scümle griniz");		
String word=scan.nextLine();
System.out.println("lütfen bir harf griniz");
char letter=scan.next().charAt(0);
int indexs=word.indexOf(letter);

if (word.indexOf(letter)<0) {
	System.out.println("harf yoktur");
}else {
	System.out.println("harf vardýr");
}






if (indexs<0) {
	System.out.println("harf yoktur");
}		else {
	System.out.println("harf vardýr");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
