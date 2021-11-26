import java.util.Scanner;

public class ders6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("kullanýcýnýn adý \n soyadý \n yas \n \t kilosu \n");
		
		// kullanýcýnýn adý soy adý yasý kilosu alt alta ayzdýýrnýz 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("adýnýzý giriniz:");   // line alt satýrda alýr  olmazssa üst satýr print yazar býrakýsan o satara yazar 
		String name=scan.nextLine();             //System.out.print  yazarsan o satýrda karsýlýk alýrsýn 
		System.out.println("soadýnýzý giriniz:");
		String soyad=scan.nextLine();
		System.out.println("yaþýnýzý giriniz:");
		int yaþýnýz=scan.nextInt();
		System.out.println("kilonuzu giriniz:");
		int kilonuzu=scan.nextInt();
		System.out.println("boyunuzu giriniz:");
		int boyunuz=scan.nextInt();
		
		System.out.println("benim adým:"+name+"\n"+"soyadým:"+soyad+"\n"+"benim yaþým"+yaþýnýz+"kg"+"\n"
		+"benim kilom"+kilonuzu+"\n"+"benim boyum"+boyunuz+"cm");	
		
		
	}

}
