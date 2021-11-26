package halukhocadersarray;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
	Scanner scan=new Scanner(System.in);
	
	System.out.println("arrayýn size griniz");
	
	int size =scan.nextInt();
	
	int[]arr=new int[size];
	
	for (int i = 0; i < arr.length; i++) {
	System.out.println("arrayýn "+(i+1)+ "elemanýnýzý griniz");	
	arr[i]=scan.nextInt();
	
	
	
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	System.out.println(arr[size-1]-arr[0]);
	
	
	
	
	
	
	
	
	
	}

}
