package day11stringmanýpýlasyon;

public class EqualsÝgnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);        //
		System.out.println(str3.equals(str4));// 
		System.out.println(str3.equalsIgnoreCase(str4)); // case devre dýsý býrak kullanýcýdan gelen verilerde cok kullanacagýz.bosluklara care bulamaz ! case
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
