package ÝfHalukD;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
Scanner scan=new Scanner(System.in);
System.out.println("lütfen boyunuzu cm olarak griniz");
double boy=scan.nextDouble();

System.out.println("lütfen kilonuzu kg olarak griniz");
double kilo=scan.nextDouble();		
		
	double bmý=kilo/((boy/100)*(boy/100));
	
	
	if (bmý<=20) {
		System.out.println("zayýfsýn baya");
	}else if (bmý<=25) {
		System.out.println("normal kilo");
	}else if (bmý<=30) {
		System.out.println("sýsman");
	}else if (bmý>30) {
		System.out.println("obez");
	} 
		
		
		
		
		
		
		
		
		
    }

}
