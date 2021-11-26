package day02;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		int sayý1=10;
		int sayý2=20;
		
		// baþlangýçta sayý =10 ve sayý2 =20 yazdýralým 
		
		System.out.println("baþlangýcta sayý1 = " + sayý1 +  " ve sayý2 = " + sayý2);
				
		// boþ bir variable oluþtur 
		
		int boþ;
		
		boþ=sayý2;
		sayý2=sayý1;
		sayý1=boþ;
		
		System.out.println("baslangýçta sayý1="+sayý1+"ve sayý2=" +sayý2);
			
		int a=12;
		int b=10;
		//7baþlangýçta a==10 b=12 yazdýralým 
				
		int c;
		    c=a;  
		    a=b;  
		    b=c;
		    System.out.println("baþlangýçta a="+a+"baþlangýct b="+b) ;
		   
		
		
				
		
		
		
		

	}

}
