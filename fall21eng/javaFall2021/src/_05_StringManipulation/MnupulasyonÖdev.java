package _05_StringManipulation;

public class MnupulasyonÖdev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String text="Good";
	System.out.println(text.indexOf('o'));
	System.out.println(text.indexOf('k'));	
	int indeks=text.indexOf("G");	
	System.out.println(indeks);	
	int indekso=text.indexOf('o');
	
	String çiçek= "günebakan;";
	int index1=çiçek.indexOf('e');
	System.out.println(index1);
			
	System.out.println(çiçek.lastIndexOf('a'));		
		
	String sehir="istanbul";
	
	char harf=sehir.charAt(6);	
		
	System.out.println(harf);	
		
	String kelime="merhaba dunya";
	
	System.out.println(kelime.charAt(3));		
	System.out.println(kelime.charAt(8));	
	
	String ss="her ders Java gibi olsa ";
	System.out.println(ss.substring(10));
	System.out.println(ss.substring(10,13));
	System.out.println(ss.substring(10,11));
	
	// ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin
	
	System.out.println(ss.replaceAll("\\w", "*")+ss.substring(10));
	
	
	String city="     istanbul    ";
	System.out.println(city.trim());
	
	String özellik="hayalperest";
	
	String öz=özellik.replace('a', '@');
	
	System.out.println(öz);
	
String kuruYemiþ="yer  fýstýðý";
System.out.println(kuruYemiþ);
String de=kuruYemiþ.replaceAll("yer", "kuruyemiþ");
	System.out.println(de);
	
	
	String numara="$1800  Milyon";
	
	String num=numara.replaceAll("\\D", "");
	System.out.println(num);
	
	
	
	System.out.println(numara.contains("M"));
	
	String str="merhaba";
	String str1="Nerhanba";
	
	System.out.println(str==str1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
