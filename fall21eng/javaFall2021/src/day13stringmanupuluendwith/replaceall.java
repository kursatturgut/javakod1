package day13stringmanupuluendwith;

public class replaceall {

	public static void main(String[] args) {
		
		String str="*java 98ogrenmek c..ok k876olay";
		//replaceall metodlarý kullanarak java öðrenmek cok kolay yapacagým
		
		str=str.replaceAll("\\d", "");
		System.out.println(str);
		
		str=str.replaceAll("\\s", "x");
		
		
		
		
		
		String cumle = "java     çok zevkli";
		cumle=cumle.replaceAll("\s+", " ");
		
		System.out.println(cumle);
		
		cumle=cumle.replaceAll("[a-k]", "");
		
		System.out.println(cumle);
		
		
		
		
		
		
		
		
		
		
		
	}

}
