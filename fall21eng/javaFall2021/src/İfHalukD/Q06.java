package ÝfHalukD;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       
    	 //// Kullanýcýdan aldýðýnýz koordinat noktasýnýn hangi bölgede olduðunu yazdýran bir kod yazýnýz.
Scanner scan=new Scanner(System.in);
System.out.println("lütfen bulundugunuz paralelei yazýnýz ");
System.out.println("lütfen blunduðunuz meridyeni yazýnýz");       
    	int paralel=scan.nextInt();
    	int meridyen=scan.nextInt();
    	
    	if (paralel>90) {
			System.out.println("kuzey yarýmkuredesiniz");
			
			
		}else if (paralel==90) {
			System.out.println("ekvatordasýnýz");
		} else {
			System.out.println("guney yarým kuredesiniz");
		} 
    	
    	
    }
}
