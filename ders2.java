package ders1;
import java.util.*;///*kullan�c�n�n girdiklerini okumak i�in bu �art */


public class ders2 {

	public static void main (String[]args){
			
			//
			
			
			
			/*
			 *int e de�eri= 2
			 *int  b de�eri =5
			 *double c de�eri =2,3
			 *string d "tuncay"
			 * int m"tuncay matematikten"+m;
			 *  int f"tuncay fenden "+ f;
			 *string "turk"
			 */
			
			int e =2,ort; 
			int b=5;
			double c = 2.3;
			
			String d="TUNCAY";
			String t="T�RK";
			int m;
			int f;
			Scanner giris= new Scanner(System.in);/*kullan�c�n girdi�i de�erleri okumak i�in kullan�yoruz */

			System.out.println("KULLANICININ ADI VE SOYADI :"+d+" "+ t);
			System.out.println("Matematik dersi notunu giriniz ");
			m=giris.nextInt();/*scannerden okudu�umuz de�erkleri yazd�r�yoruz i�erisine */

			System.out.println("Fen  dersi notunu giriniz ");
			f=giris.nextInt();
			ort=(m+f)/2;
		
			
		
			System.out.println("Tuncay�n Matematik ve Fen dersinin ortalamas�  "+ort+"'dir.");
			
			System.out.println("Tuncay�n edebiyat notu  "+e+"'dir.");
			System.out.println("Tuncay�n Beden e�itimi notu  "+b+"'dir.");
			System.out.println("Tuncay�n co�rafya notu  "+c+"'dir.");
			
			
			
			
		}
		

}
