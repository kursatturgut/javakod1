package halukhocadersarray;

public class java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */
		int input[][] = {{1,2,-3},{41,55},{-61,-17,80}};
		
	
	System.out.println(maksimumDger( input, 0));
	
	
	}

	private static int maksimumDger(int[][] input,int maksimum) {
		int maksimum1=0;
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = 0; j < input[i].length; j++) {
		if (input[i][j]>maksimum1) {
			maksimum1=input[i][j];
		
		
		}
				
				
			}
			
		}
		return maksimum1;
		
		
	}
	
}
