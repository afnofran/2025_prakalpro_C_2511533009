package pekan7_2511533009;

public class Mahasiswa_2511533009 {
	//variabel global
	private int nim;
	private String nama,nim2;
	//membuat mutator (setter)
	public void setNim (int nim) {
		this.nim=nim;
	}
	public void setNim2 (String nim2) {
		this.nim2 = nim2;
	}
	public void setNama (String nama) {
		this.nama=nama;
	}
	
	//membuat accessor (getter)
	public int getNim() {
		return nim;
	}
	public String getNim2() {
		return nim2;
	}
	public String getNama() {
		return nama;
	}
	//metode lain
	public void Cetak() {
		System.out.println("Nim : "+nim);
		System.out.println("Nama : "+nama);
	}
	public void Cetak2() {
		System.out.println("Nim : "+nim2);
		System.out.println("Nama : "+nama);
	}
	
}
