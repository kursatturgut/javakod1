import java.util.Scanner;

public class İfDevam80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
	    en kucuk olanlarini konsola yazdiriniz
	    int num1 
	    int num2 
	    int num3
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("please  tree number write");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if (num1>num2 && num2>num3) {
			System.out.println("buyuk"+num1+"küçük"+num3);
		} else if (num2>num3 && num3>num1) {
			System.out.println(num2+","+num1);
		} else if (num3>num2 && num2>num1) {
			System.out.println(num3+","+num1);
		} else {

		}{

		}{

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
