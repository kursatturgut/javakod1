import java.util.Scanner;

public class ÝfHalukHocaÖdevleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen 1. sayýyý griniz ");
		double sayý1=scan.nextDouble();
		System.out.println("lutfen 2. sayýyý griniz");
		double sayý2=scan.nextDouble();
		System.out.println("iþlemler için basýlacak numaraalr :\n toplama için 1 \n çýkarma için 2 \n bölme için 3\n çarpa için 4  ");
		int iþlem=scan.nextInt();
		
		if (iþlem==1) {
			System.out.println(sayý1+sayý2);
		}if (iþlem==2) {
			System.out.println(sayý1-sayý2);
		}if (iþlem==3) {
			System.out.println(sayý1/sayý2);
		}if (iþlem==4) {
			System.out.println(sayý1*sayý2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
