package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class araylist11 {

	public static void main(String[] args) {
		// 
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
				
				int arr[]= {3,4,5,6,3,5};
				int silinecekEleman=3;
	
	List<Integer> geçici=new ArrayList <>();
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i]!=silinecekEleman) {
			geçici.add(arr[i]);
		}
		
		
	}
	// System.out.println(geçici);
	
	
	int yeniArray[]=new int[geçici.size()];
	
	for (int i = 0; i <geçici.size() ; i++) {
		
	yeniArray[i]=geçici.get(i);
	
	}
	
	System.out.println(Arrays.toString(yeniArray));
	
	
	
	
	
	
	
	
	
	
	}

}
