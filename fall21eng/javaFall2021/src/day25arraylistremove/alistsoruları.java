package day25arraylistremove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alistsorularý {

	public static void main(String[] args) {
		// 100 den küçük fibonacii sayýsýný  bir list olarak yazdýrýn 
 // 1,1,2,3,5,8,13,21,34
   
		int sýnýr=100;
	List<Integer>fibonaccý=new ArrayList<>();
	fibonaccý.add(1);
	fibonaccý.add(1);
	int sayý=0;
	
		while (sayý<sýnýr) {
			
			sayý=fibonaccý.get(fibonaccý.size()-2)+fibonaccý.get(fibonaccý.size()-1);
			fibonaccý.add(sayý);
			
		}
	System.out.println(fibonaccý);
   fibonaccý.remove(fibonaccý.size()-1);
   System.out.println(fibonaccý);
	
Collections.sort(fibonaccý);
	
	System.out.println(fibonaccý);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
