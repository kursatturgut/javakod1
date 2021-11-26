
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ornek="javada rakamlar      1234567890";

	System.out.println(ornek.replace('a', 'x'));	
	System.out.println(ornek.replace('r', 'ç'));	
	System.out.println(ornek.replace(' ', '/'));	
	System.out.println(ornek.replace("javada", "s"));	
		
		System.out.println(ornek.replace("rakam", "m"));
		
	System.out.println(ornek.replaceAll("\\s", "*"));	
	System.out.println(ornek.replaceAll("\\S", "*"));	
		
	System.out.println(ornek.replaceAll("\\w", "0"));	
	System.out.println(ornek.replaceAll("\\W", "*"));	
	System.out.println(ornek.replaceAll("\\d", "*"));	
	System.out.println(ornek.replaceAll("\\D", "X"));	
		
		
		
		
		
		
		
		
		
	}

}
