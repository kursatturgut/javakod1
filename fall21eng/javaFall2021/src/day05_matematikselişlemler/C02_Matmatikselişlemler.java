package day05_matematikseliþlemler;

public class C02_Matmatikseliþlemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayý1=10;
		int sayý2=20;
		
		String str1="ali";
		String str2="can";  //  caný hiç kullanmadýn hacý diyor 
		System.out.println(sayý1+sayý2+str1); //30ali
		System.out.println(str1+sayý1+sayý2);// ali1020  ilk ifade string diye string aldý 
		//ali30 yapmak için parantez lazým 
		System.out.println(str1+(sayý1+sayý2));// ali 30
		
		System.out.println(str1+sayý1*sayý2);	//ali200	  çarpma öncelik 
		
		
		
		
		
		

	}

}
