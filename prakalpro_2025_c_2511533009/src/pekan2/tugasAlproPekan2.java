package pekan2;
/* 
 * Import class Scanner dari package java.util
 * agar dapat melakukan input
 * 
 * */
import java.util.Scanner;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		/* Buat object scanner 
		 * agar dapat memanggil method nextLine() dan nextInt() 
		 * sehingga dapat melakukan input
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println(" === Data Mahasiswa ===");
		
		// Menerima input NIM dan Nama dengan type data String
		System.out.print("NIM	: ");
		String nim = scanner.nextLine();
		System.out.print("Nama	: ");		
		String nama = scanner.nextLine();

		// Menerima input Umur dengan type data Integer
		System.out.print("Umur	: ");
		int umur = scanner.nextInt();
		
		// Konversi type data NIM dari String menjadi Long
		long longNIM = Long.parseLong(nim);
		
		// Lalu tambahkan NIM dengan Umur
		longNIM += umur;
		
		// Konversi type data UMUR menjadi String
		String stringUMUR = String.valueOf(umur);
		
		/*Tampilkan hasil konversi type data Umur 
		 * dari Integer menajdi String 
		 * dan penjumlahan NIM + Umur 
		 * */
		System.out.println("Umur (String) : " + stringUMUR);
		System.out.println("NIM + Umur	: " + longNIM);
	}
}