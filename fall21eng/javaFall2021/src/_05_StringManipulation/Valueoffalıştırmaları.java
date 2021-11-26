package _05_StringManipulation;

public class Valueoffalýþtýrmalarý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String paraErkek="1900";
		String paraKadýn="2000";
		
		//ailenin toplam gelirirni bulunuz 
		
		Integer a=Integer.valueOf(paraErkek);
		Integer b=Integer.valueOf(paraKadýn);
		System.out.println("toplam gelir:"+(a+b));
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadýn));
		
		
		int maaþ=1200;
		int maaþ2=2200;
		
		String.valueOf(maaþ);
		String.valueOf(maaþ2);
		System.out.println(String.valueOf(maaþ)+String.valueOf(maaþ2));
		
		String kelime="65";
		
		int sayýHali=Integer.parseInt(kelime);
		System.out.println(sayýHali);
		
      String bgþ1="500";
      String bgþ2="1500";
      
      int sayý=Integer.valueOf(bgþ1);
    	int sayý1=Integer.valueOf(bgþ2);	  
		
	topla(sayý,sayý1);	
	
	// Soru :String olarak verilen karenin 1 kenar uzunluðundan
    // karenin çevresinin uzunluðunu bulunuz.
	String kenar="8";
	
	Integer kenar1=Integer.valueOf(kenar);
	int cevre=kenar1+kenar1+kenar1+kenar1;
	System.out.println(cevre);
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void topla(int sayý, int sayý1) {
		System.out.println(sayý+sayý1);
		
	}

}
