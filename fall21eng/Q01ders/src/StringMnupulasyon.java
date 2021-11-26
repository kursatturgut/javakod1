import java.util.Locale;

public class StringMnupulasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //concatenatýon
		
		String name="ali can";
	    String surname="ali can"+"";
		String name1=surname+"";
	    
	    
	    System.out.println(name.concat(surname));
		System.out.println(name.charAt(0));
		System.out.println(surname.charAt(2));
		System.out.println(name.toUpperCase());
		System.out.println(surname.toLowerCase());
		System.out.println(name.toUpperCase(Locale.forLanguageTag("Tr")));
		
		System.out.println(name.equals(surname));
		
		System.out.println(name==surname);
		System.out.println(name.equals(surname));
		System.out.println(surname.equals(name1));
		System.out.println(surname==name1);
		
		String pruduct="kabahat";
		String pruducts="KABAHAT";
		System.out.println(pruduct.equals(pruducts));
		System.out.println(pruduct.equalsIgnoreCase(pruducts));
		
		System.out.println(pruducts.length());
		System.out.println(name.length());
		System.out.println(surname.length());
		
		System.out.println(name.indexOf('i'));
		System.out.println(surname.indexOf('n'));
		System.out.println(pruduct.indexOf('v'));
		System.out.println(name.indexOf("can"));
		
		
		
		
		
		
	}

}
