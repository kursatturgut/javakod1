
public class ders1 {

	public static void main(String[] args) {
	
		// 12345 sayýýnýn rakama deðerlerini yukardan aþagý yazýnýz 
		// konsolda alt satýr için ters sýlaþ n kullanýlýr 
		System.out.println(12345);
		int sayý=12345;
		int birler=sayý%10;
		int onlar=(sayý/10)%10; 
		int yüzler=(sayý/100)%10;
		int binler=(sayý/1000)%10;
		int onbinler=(sayý/10000)%10;
		System.out.println(birler);
		System.out.println(onlar);
		System.out.println(yüzler);
		System.out.println(binler);
		System.out.println(onbinler);
		System.out.println(onbinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);  // tersýlþ n bir alt satýra atar yazým önemli
		
		
		
		

	}

}
