import java.util.Scanner;

public class switchc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.

		Kullanici S girerse “Software”
		D girerse “Developer”
		E girerse “Engineer”
		T girerse “In Testing” yazdirin	
*/	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen SDET kelimesinin harflerinden brini giriniz");
		char krt=scan.next().toUpperCase().charAt(0);
		
		switch (krt) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Developer");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("ýn teting");
			break;

		default:
			System.out.println("please write a kod");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
