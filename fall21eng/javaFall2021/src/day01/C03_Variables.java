package day01;

public class C03_Variables {

	public static void main(String[] args) {
		
		int sayý1 =10;
		int sayý2 =20;
		
		String sayý3="10";
		String sayý4 ="20";
		System.out.println(sayý1+sayý2); // rakam olarak tanýdý 
		
		System.out.println(sayý3+sayý4);   // yazý gibi tanýdý
		
		
		// farklý data turleri ayný degeri tasýyabilir ama önemli olan deðiþkenlerin hangi turde iþlem yapacagýmýzdýr 
		String harf1="A";
		char harf2 ='A';
		
		System.out.println(harf1);
		System.out.println(harf2);
		
		//deðiþkenleri kullanarak 30a yazdýrýn
		System.out.println(sayý1+sayý2+harf1); // 30a yazdý string yazý metni algýladý 
		System.out.println(sayý1+sayý2+harf2); // 95 yazdý cünkü a yý rakamsal degeini kabul etti char matematiksel iþlemlere girebilir 
		
		harf1="b";
		System.out.println(harf1);
		
		System.out.println(harf1+sayý1+sayý2); //   önce strin varsa yanyan ayazar stringe cevirir iþlem önceliði var 

		System.out.println(harf1+(sayý1+sayý2));  //
	}

}
