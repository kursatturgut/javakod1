
public class Çalýþma1 {

	public static void main(String[] args) {
		
		
		String Kredi1="hýzlý kýredi";
		String Kredi2="yavaþ kredi";
		String Kredi3="cok hýzlý kredi";
		String Kredi4="uþtra  kýredi";
		String Kredi5="pas kredi";
		String Kredi6="tas hýzlý kredi";
		
		System.out.println(Kredi1);
		System.out.println(Kredi2);
		System.out.println(Kredi3);
		System.out.println(Kredi4);
		System.out.println(Kredi5);
		System.out.println(Kredi6);
		
		String [] kirediler=
			{
					"hýzlý kýredi",
					"yavaþ kredi",	
					"cok hýzlý kredi",
					"uþtra  kýredi",
					"pas kredi",
					"tas hýzlý kredi",
					"hhhh kredisi",
					
			};
		//for each
		for(String kredi:kirediler) {
		System.out.println(kredi);	
			}

	for(int i =0; i< kirediler.length;i=i+1) {
		System.out.println(kirediler[i]);
		
		
		
		
	};
	
	
	
	
	
	
	
	}
}