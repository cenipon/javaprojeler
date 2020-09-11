package ders1;
import java.util.*;///*kullanýcýnýn girdiklerini okumak için bu þart */


public class ders2 {

	public static void main (String[]args){
			
			//
			
			
			
			/*
			 *int e deðeri= 2
			 *int  b deðeri =5
			 *double c deðeri =2,3
			 *string d "tuncay"
			 * int m"tuncay matematikten"+m;
			 *  int f"tuncay fenden "+ f;
			 *string "turk"
			 */
			
			int e =2,ort; 
			int b=5;
			double c = 2.3;
			
			String d="TUNCAY";
			String t="TÜRK";
			int m;
			int f;
			Scanner giris= new Scanner(System.in);/*kullanýcýn girdiði deðerleri okumak için kullanýyoruz */

			System.out.println("KULLANICININ ADI VE SOYADI :"+d+" "+ t);
			System.out.println("Matematik dersi notunu giriniz ");
			m=giris.nextInt();/*scannerden okuduðumuz deðerkleri yazdýrýyoruz içerisine */

			System.out.println("Fen  dersi notunu giriniz ");
			f=giris.nextInt();
			ort=(m+f)/2;
		
			
		
			System.out.println("Tuncayýn Matematik ve Fen dersinin ortalamasý  "+ort+"'dir.");
			
			System.out.println("Tuncayýn edebiyat notu  "+e+"'dir.");
			System.out.println("Tuncayýn Beden eðitimi notu  "+b+"'dir.");
			System.out.println("Tuncayýn coðrafya notu  "+c+"'dir.");
			
			
			
			
		}
		

}
