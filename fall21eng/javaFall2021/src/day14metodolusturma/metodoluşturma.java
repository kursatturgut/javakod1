package day14metodolusturma;

public class metodoluþturma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// verilen iki sayýnýn toplamýný ve carpýmýný yapýp yazdýran iki ayrý metod oluþturun

//  3 adýmda metod	
	// 1  metod call ( mainýin içine )
	// 2 metoda arguman yazacakmýyýz karar ver 
	// 3 1 ve ikiyi yaptýktan sonra javadan yardým alýp metodu oluþturuz 
	
	int a=20;
	int b=40;
	
	topla(a,b);
	
	carp(a,b);
	
	
	
	
	
	
	}

	private static void carp(int a, int b) {
		System.out.println(a*b);
	}

	public static void topla(int v, int j) {
		System.out.println(v+j);
		
	}

	
		
	

	

}
