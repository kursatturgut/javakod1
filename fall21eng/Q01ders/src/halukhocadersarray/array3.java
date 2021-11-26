package halukhocadersarray;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //bir int Array elemanlarinin iþaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

 int arr[]= {1,2,-3,4,-5,-6};
		
	int dönenarr[]= deðiþtir(arr);
		
  System.out.println(Arrays.toString(dönenarr));
 
	
	}

	private static int[] deðiþtir(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
		arr[i]*=-1;
		
		
	
		}
		
		return arr;
	
	
	
	}

   }
