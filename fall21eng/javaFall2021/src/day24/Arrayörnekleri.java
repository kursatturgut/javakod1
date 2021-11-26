package day24;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayörnekleri {
public static void main(String[]arg) {

	// kullanýcý girdigi sayi kadar int dizisi oluþtur ve dizi elemanlarini kullanýcýdan alan
		// ve girilen dizisi elemanlarinin en buyuk ile en küçük elemaninin arasinki farki gosteren
		// java programý yazin
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen dizi sayýsýný griniz");
	int dizisayýsý=scan.nextInt();
	
	int arr[]=new int[dizisayýsý];
	
	
	
	int fark=0;
for (int i = 0; i < dizisayýsý; i++) {
	System.out.println("lütfen dizi rlelmanýný griniz");
	arr[i]=scan.nextInt();
	
	
	                           }
System.out.println(Arrays.toString(arr));

Arrays.sort(arr);
System.out.println(Arrays.toString(arr));

System.out.println(arr[(arr.length-1)]-arr[0]);



	                 }
}




































