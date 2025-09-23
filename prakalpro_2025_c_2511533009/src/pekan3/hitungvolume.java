package pekan3;
import java.util.Scanner; // Import class Scanner agar dapat menerima input dari keyboard
public class hitungvolume{
	/*
	 * Program menghitung volume tabung
	 * Denagn rumus V = PI * r * r * t
	 * Dengan input: jari-jari (r), tinggi (t)
	 * 
	 * */
	public static void main(String[] args) {
		
		double PI = 3.14; // Inisiasikan variabel PI dengan tipe data double
		double r,t,volume; // Inisiasikan variabel r,t dan volume dengan tipe data double
		Scanner keyboardInput = new Scanner(System.in); // Membuat object Scanner
		System.out.println("===|Program Menghitung Volume Tabung|===");
		System.out.println("Rumus: V = PI * r * r * t");
		System.out.print("Masukan jari-jari tabung: ");
		r = keyboardInput.nextDouble(); // Menerima input untuk variabel r
		System.out.print("Masukan tinggi tabung   : ");
		t = keyboardInput.nextDouble(); // Menerima input untuk variabel t
		keyboardInput.close();
		volume = PI * r * r * t;// Menghitung volume dengan jari-jari dan tinggi yang sudah dimasukan
		System.out.println("Volume tabung = " + volume);// Menampilkan hasil
		
	}

}
