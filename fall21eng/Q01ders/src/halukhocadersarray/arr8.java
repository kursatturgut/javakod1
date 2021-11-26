package halukhocadersarray;

import java.util.Arrays;

public class arr8 {

	public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		
		
		
		System.out.println(str);
	String	arr[]=str.split(" ");
	System.out.println(Arrays.toString(arr));
	int topDolar=0;
	int topEuro=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i].contains("$")) {
			topDolar+=Integer.parseInt(arr[i].replace("$", ""));
		}else {
			topEuro+=Integer.parseInt(arr[i].replace("£", ""));
		}
	}
	System.out.println(topDolar);
	System.out.println(topEuro);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
