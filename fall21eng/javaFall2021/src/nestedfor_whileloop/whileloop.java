package nestedfor_whileloop;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 
  // 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
	
	
	
	for (int i = 100; i < 1000; i++) {
		
		if (i%15==0 && i%20==0 && i%90==0) {
			System.out.println(i);
		}
		
		
	}
	
	int a=100;
	
	
	while ( a<1000 ) {
		if (a%15==0 && a%20==0 && a%90==0) {
			System.out.println(a);
		}
		a++;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
