
public class StringMnupulasyonAlýþ {

	public static void main(String[] args) {
	/*
		Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz

	String str1 = “$13.99”
	String str2 = “$10.55”
	ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
*/		
		
		String str1 = "$13.99";
		String str2 = "$10.55";
	
		String a=str1.replaceAll("\\D", "");
		String b=str2.replaceAll("\\D", "");
		
		Integer m=Integer.valueOf(a);
		Integer c=Integer.valueOf(b);
		
	System.out.println(m+c);
		
		
		
		
		
		
		
		
		
		
	}

}
