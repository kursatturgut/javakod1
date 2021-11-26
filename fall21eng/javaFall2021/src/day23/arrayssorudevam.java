package day23;

public class arrayssorudevam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	oru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini 
    // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
	
	
	int arr[][]= {{1, 2, 3}, {4, 5}, {6}};
	
	int sonuç=1;
	for (int i = 0; i < arr.length; i++) {
		
	 int sonindex=arr[i].length-1;
	sonuç*=arr[i][sonindex];
	}
	System.out.println(sonuç);
	
	
	
	
	
	
	
	
	
	
	}

}
