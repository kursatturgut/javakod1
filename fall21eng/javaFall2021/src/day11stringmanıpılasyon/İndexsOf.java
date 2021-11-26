package day11stringmanýpýlasyon;

public class ÝndexsOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// paraametre grilen char ya da stringin ilk indexsini verir 
		String str="Çalýþýrsanýz, java öðrenmek çok kolay";
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf('q'));
		// sayýnýn olmadýgýný bize -1 le dönuyor 
		
		int index=str.indexOf("r"); // indexs herzaan int  data verisi döner 
		System.out.println(str.indexOf("Ç"));
		System.out.println(str.indexOf("java")); // ilk olan bakýyor baþldýgý indeksi verir 
		System.out.println(str.indexOf('a',11)); // 11 dahil sonraký a yý arra 
		System.out.println(str.indexOf("va öð")); // charSquence  arasakta tek paket yapar ilk garfinin indeksini verir paketin baþlangýç indeksini 
	
	
	
	}

}
