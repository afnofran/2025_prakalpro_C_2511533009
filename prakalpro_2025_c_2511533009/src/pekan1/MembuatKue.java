package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeBatter();
		memanggang();
		memanggang();
		menghias();
	}
	
	public static void makeBatter() {
		System.out.println("Campur bahan kering.");
		System.out.println("Krim mentega dan gula.");
		System.out.println("Kocong telurnya.");
		System.out.println("Masukkan bahan kering.");
	}
	
	// Langkah 2: Panggang sekumpulan kue.
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengatur waktu.");
		System.out.println("Masukkan kue ke dalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
		
	}
	// Langkah 3: Hiasi Cookie
	public static void menghias() {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting dan taburan.");
	}

}
