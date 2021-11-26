package İfHalukD;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	Scanner scan=new Scanner(System.in);
    	System.out.println("lütfen bir sayı griniz");
    	int sayı=scan.nextInt();
    	
    	//  data turu variabla =    (sart)   ?ise  (  )   :değilse   ( ) ;
    	
    	String result = (sayı >= 0)   ?  ( (sayı<10) ? ("rakam"): ("pozitif sayı") ) : ("negatif"); // sonuclara göre sectik deta turunu string 
    	
    	System.out.println(result);
    	
    	if (sayı>=0) {
                 			
    		
    		
		}
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
}
