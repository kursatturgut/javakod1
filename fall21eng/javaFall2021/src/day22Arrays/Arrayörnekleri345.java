package day22Arrays;

import java.util.Arrays;

public class Array�rnekleri345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//"java �grendim,  &cok para ?kazand�m.,"

		// c�mlesinin kelimelerini noktalama ve �zel karakterler olmadan 
		//	harf s�ras�na g�re yazd�ral�m 
		
		String cumle="java �grendim,  &cok para ?kazand�m.,";
		
	String[]cumle1=cumle.split(" ");
	System.out.println(Arrays.toString(cumle1));
	
	Arrays.sort(cumle1);
	
	System.out.println(Arrays.toString(cumle1));
	}
}
