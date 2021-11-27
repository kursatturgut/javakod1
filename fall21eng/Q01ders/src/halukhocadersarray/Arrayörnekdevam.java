package halukhocadersarray;

import java.util.Arrays;

public class Arrayörnekdevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
         * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */
	
	String kelime="Congratulations";
	String arr[]=kelime.split("");
	System.out.println(Arrays.toString(arr));
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i].equals("a") || arr[i].equals("o") || arr[i].equals("u")) {
			arr[i]="i";
			
		}
	}
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	}

}
