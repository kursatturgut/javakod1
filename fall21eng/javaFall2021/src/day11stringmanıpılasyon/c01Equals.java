package day11stringmanıpılasyon;

public class c01Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b= a+0;
		System.out.println(a==b); // degere bakıyor ref olmadıgı için zaten bakması gerekmez 
		
		char c='k';
		char d= 'k'+0;
		System.out.println(c==d);  // sayısal degere bakıyor  ref olmadıgı için zaten bakması gerekmez 
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);        //degerler eşit ama referanslar esit değil diye false verir önemli
		System.out.println(str3.equals(str4));// referanslara bakmaz degerlere bakar true yazdrır .steak ve heap hafızayla alakalı.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
