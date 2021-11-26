package day05_matematikseliþlemler;

public class C01_Matematikseliþlemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(4*(2+5)/2);  // iþlem sýrasý 
		
		System.out.println(4*(2+5)/3); // 9 verdi  iþlem yapýlan sayýlar int data türü olduðu için virgül yazmadý int cinsinden cýktý 
		// sonucu virgüllü olsun istersek 
		
		double sonuç=4*(2+5)/3;
		System.out.println(sonuç);  //9.3  göstermedi  9.0 çýktý because deðeri bulur assing eder deðeri 9 bulur 9 u doouble yap dersen 9.0 yazar 
		// önce sonucu buldu sonra atam yaptý 
		
		
		
		 sonuç=(double)4*(2+5)/3; //  burda 4 ü double tanýmladýk sonuç deðiþti 
         sonuç=4.0*(2+5)/3;
         System.out.println(sonuç); // genelde kullanýcýdan deger aldýðýmýz için onu deðiþemeyiz ama onu double diye tanmlaya biliriz 
         
         int sayý1=5;
         int sayý2=2;
         double sayý3=2;
         System.out.println(sayý1/sayý2);// sonuc int tamsayý 5/2 =2
         System.out.println(sayý1/sayý3);// 5/2   =2.5  sayýnýn bri double olduðu için sonuç double 
         
         
        		 
        		 
         
         
         
	}

}
