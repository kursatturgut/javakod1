package halukhocadersarray;

public class arraysevv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarýnýn ayni olup olmadýðýný kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int[] arr = {2, 6, 4, 8, 2, 6, 2};

	
	for (int i = 0; i < arr.length; i++) {
		if (arr[0]==arr[arr.length-1]) {
			System.out.println("ilk ve son elamn eþittir");
		}else {
			System.out.println("ilk ve son elamn eþit deðildir");
		}
		break;
	}
	
	
	
	
	
	
	
	}

}
