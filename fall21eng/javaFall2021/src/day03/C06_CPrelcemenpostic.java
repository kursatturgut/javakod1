package day03;

public class C06_CPrelcemenpostic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// preincrement ve postincrement sadece sayý++ veya sayý -- yazýmý için gecerlidir 
		
		int sayý =10;
		sayý++;  // kalýcý artýrýrý 
	
		sayý++;  
		sayý++;  // kalýcý artýrýr 
		System.out.println(sayý); //13  yazdýrdý 
		System.out.println(sayý++); // önce yazdýr sonra atam ayaptý  13 yazdý hala cuku önce yaz dedik sonr atadý ama yazdýrmadýk 
		//  önce artýrmak 
		System.out.println(++sayý);//15 oldu önce artýrdý sonra yazdý
		
		System.out.println(sayý);
		System.out.println(++sayý); // artýdý ve yazdýrdý 
		System.out.println(sayý++); // artýrdý ama önce yazdýgý için artýrma sonraki yazmamya kalmadý 
		
		
		
		
		
		
		
		
		
		
		

	}

}
