package _05_StringManipulation;

public class hhhhhh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //  String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
	       String  str="%13.99";
	       String str1="%10.55";
	      //  ipucu: Double.parseDouble() methodunu kullanabilirsiniz.	
		
	     
	      String b= str.replaceAll("\\W", "");
	     String a=  str1.replaceAll("\\W","");
	    System.out.println(b);
	    System.out.println(a);
	
	
		System.out.println(Integer.valueOf(b));
		System.out.println(Integer.valueOf(a));
		
		System.out.println(Integer.valueOf(b)+Integer.valueOf(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Integer IntegerValueoff(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int parseInt(Integer yeni1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
