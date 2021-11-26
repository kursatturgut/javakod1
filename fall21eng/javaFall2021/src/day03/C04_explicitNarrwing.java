package day03;

public class C04_explicitNarrwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int sayý1 =140;
			
		short sayý2=(short) sayý1;
		
		// eþitliðin sagý ve solu farklý ise jawa mssmatch hatasý verir 
		// jawa uyarýr illa yapacaksan yap diyor
		// otomatik kabul etmez sorumlulugu sen al der 
		
		
		System.out.println(sayý2);
		
		
		byte sayý3=(byte) sayý2;
		
		System.out.println(sayý3);
		
		
		double sayý4=87.3;
		int sayý5=(int) sayý4;
		System.out.println(sayý5); // sayýyý budayarak verdi geri data kaybý oldu deðiþti 
		
		
		int sayý6=27;
		int sayý7=4;
		
		System.out.println(sayý6/sayý7);//  iki sayýda int olduðu için jawa sonucu int olarak yazar algýlar tanýmlaar ve 6 olarak atra 
		double sayý8=4;
		System.out.println(sayý6/sayý8); // iþlem yapýlan sayýlardan geniþ olna double olduðu için sonucu double verdi  6,75
		
		

		
		
		
		
		
		
		
		
	}

}
