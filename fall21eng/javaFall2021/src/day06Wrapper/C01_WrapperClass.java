package day06Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayý1=10;  // primitive 
		Integer sayý2=20;// nonprimitive
		
		// stringin içinde matematikel ifadeler varsa wrapper class sayesinde matematikseþ karþýlýðýný veriri 
		//sayý 1 yazdýðýmýzda metod çýkmaz
        // sayý 2 dediðimizde method çýkar 
		
		String tel1="1";
		String tel2="2";
		
	System.out.println(tel1+tel2);	
	//bu sayýlarý toplamak istedim iþlem yapmak istedim diyelim
	System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE); //degerleri görebiliyoruz 
		System.out.println(Integer.MAX_VALUE);
		
		// Integer.valueOf metodu string numaralarý sayýya çeviri ancak ancak ifadede numerik olmayn karakter olursa java hata verir 
		//
		
		String caddeNo="234";
		String sokakNo="768";
		System.out.println(Integer.valueOf(sokakNo)+Integer.valueOf(caddeNo));
		
		
		
		
		
		
		
		
		
		
		
	}

}
