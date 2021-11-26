package days9;

public class Ternoryif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x =10;
	//	x%2==0 ? "çiftsayı"  : "teksayı;"   //kodu kabul etmedi variable olusturmamız lazım  değişken olmalı ve data türü lazım
			
	String tekMiÇiftMi	=	x%2==0 ? "çiftsayı" : "teksayı";
		System.out.println(tekMiÇiftMi);
		// döndürdüğü sey neyse ona göre data türü olur
		
	System.out.println(x%2==0 ? "çiftsayı" : "teksayı");	
		
		// ternary iki şekilde kullanılabilir ya dönen sonuca göre atama yaparız 
	// ya da syo ile yazar ve yazdırırız 
	// eger ternary de sonuçlar farklı data türü ise atama yapamayız sadece yazdırabiliriz 
	//  sonuç=x>5 ? "aferin"	: 4;   //hangi data türüne atama yapacak zor 
	System.out.println(x>5 ? "aferin"	: 4);	
		
		
		
		
		
		
		
		
	}

}
