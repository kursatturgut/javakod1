import java.util.Scanner;

public class ödevdevam6 {

	public static void main(String[] args) {
// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

  Scanner scan=new Scanner(System.in);
  
System.out.println("lütfen 4 harfli bir kelime griniz");
	String world=scan.next();
	
	System.out.println(""+world.charAt(3)+world.charAt(2)+world.charAt(1)+world.charAt(0));	
		
System.out.println(world.substring(3)+world.substring(2,3)+world.substring(1,2)+world.substring(0,1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
