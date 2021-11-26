import java.util.Scanner;

public class ÝfHýz {

	public static void main(String[] args) {
		
		  /*
        Problem tanimi : 
      Kulanýcýdan aracýnýn hýzýný alýnýz
      Trafik cezasýnýn deðerini hesaplayýn.
          45 hýz sýnýrýdýr.
          Eðer hýzýnýz 55-74 arasýnda ise:
          Ceza 100 $'dýr.

          Eðer hýzýnýz 75 - 84 arasýnda ise:
          Ceza 150 $'dýr.

          Eðer hýzýnýz 85 -94 arasýnda ise:
          Ceza 320 $'dýr.

          Eðer hýzýnýz 94'den daha fazla ise:
          Ceza 500 $'dýr.

          ve ayrýca,
          Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

          Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

          Örn;

          currentSpeed(Hýzýnýz) 87
          ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;

          sonuç 320 olmalýdýr.

          currentSpeed(Hýzýnýz) 65
          ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;

          sonuç 300 olmalýdýr.
   */
Scanner scan=new Scanner(System.in);
System.out.println("dou you have a driver licance please yes or no\n");
char lýcance=scan.next().toUpperCase().charAt(0);
System.out.println("please you write your currentspeed");
 int speed=scan.nextInt();
 
 
	

 
		if (lýcance=='Y') {
			if (speed>94) {
				System.out.println("500$");
			}
			else if (speed>84) {
				System.out.println("320$");	
			}
			else if (speed>74) {
				System.out.println("150$");	
			}
			else if (speed>54) {
				System.out.println("100$");	
			}else {
				System.out.println("yolunuz acýk olsun ");
			}
			
			
			
			
			
		} else {
			if (speed>94 && lýcance=='N') {
				System.out.println("700$");
			}
			else	if (speed>84 && lýcance=='N') {
				System.out.println("520$");	
			}
			else if (speed>74&& lýcance=='N') {
				System.out.println("350$");	
			}
			else if (speed>54 && lýcance=='N') {
				System.out.println("300$");	
			}else {
				System.out.println("cezanýz 200$");
			}
			}
			
			
			
			
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


