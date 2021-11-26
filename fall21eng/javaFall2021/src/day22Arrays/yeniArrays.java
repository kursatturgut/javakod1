package day22Arrays;

import java.util.Arrays;

public class yeniArrays {

	public static void main(String[] args) {
		// 

	
	String [] ürünler= {"derskitabý","kitap","kalem","silgi","defter"};
	
Arrays.sort(ürünler);	
	System.out.println(Arrays.toString(ürünler));
	
	ürünler[0]="bigisayar";
	System.out.println(Arrays.toString(ürünler));
	
	Arrays.binarySearch(ürünler, "kitap");
	System.out.println(Arrays.binarySearch(ürünler, "kitap"));
	
	Arrays.binarySearch(ürünler,"halý");
	System.out.println(Arrays.binarySearch(ürünler,"halý"));
	
	
	
	
	
	
	
	
	}

}
