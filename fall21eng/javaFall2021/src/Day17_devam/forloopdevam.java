package Day17_devam;

import java.util.Scanner;

public class forloopdevam {

	public static void main(String[] args) {
		/*
		Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
		  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
		- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
		- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayý griniz");
		int sayý=scan.nextInt();
		
		for (int i = 1; i <=sayý; i++) {
			
			if (i%3==0  && i%5==0) {
				System.out.println("sayý guzeldir");
			} else if (i%3==0) {
				System.out.println("java");
			} else if (i%5==0) {
				System.out.println("guzeldir");
			}else {
				System.out.println(i);
			}
			
			
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
