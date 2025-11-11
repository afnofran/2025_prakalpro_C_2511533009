package pekan7_2511533009;
import java.util.Scanner;
public class PanggilMahasiswa2_2511533009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("NIM: ");
		String x= input.nextLine();
		System.out.print("Nama: ");
		String y= input.nextLine();
		Mahasiswa_2511533009 a= new Mahasiswa_2511533009();
		a.setNim2(x);
		a.setNama(y);
		if(x.startsWith("25")) {
			System.out.println(y + " anda angkatan 2025");
		}
		if(x.contains("1153")) {
			System.out.println("Anda Mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();
	}

}
