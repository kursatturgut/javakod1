import java.util.Scanner;

public class HalukÖdev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println("lütfn beş basamkalı bir sayı giriniz:");
		Scanner scan=new Scanner(System.in);
		
		
		int sayı=scan.nextInt();
		
		int sayı1 =sayı%10;
		int sayı2=(sayı/10)%10;
		
		int sayı3=(sayı/1000)%10;
		int sayı4=(sayı/10000);
		
		int son=sayı1+sayı2+sayı3+sayı4;
		System.out.println("istenilen toplam:"+son);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
