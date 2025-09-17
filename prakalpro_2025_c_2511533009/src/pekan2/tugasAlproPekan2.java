package pekan2;

public class tugasAlproPekan2 {

	/*
	 * Program menampilkan data item game.
	 * menampilkan Item Level, Harga Item, 
	 * Kategori, apakah Tersedia
	 */
	public static void main(String[] args) {
		int levelItem = 69; // Variabel Level Item dengan type data integer
		float hargaItem = 67000.99f; // Variabel harga item di pasar dengan type data float
		char kategoriItem = 'A'; // Variabel kategori item, bisa berupa A,B,C,D dengan type data char
		boolean apakahTersedia = true; // Variabel ketersedian item apakah item tersedia? true/false dengan type data boolean
		
		// Menampilkan data item game
		System.out.println("=== Data Item Game ===");
		System.out.println("Level	: " + levelItem);
		System.out.println("Harga	: " + hargaItem + " $");
		System.out.println("Kategori: " + kategoriItem);
		System.out.println("Tersedia: " + apakahTersedia);
		
	}
}