package pekan4;

import java.util.Scanner;

public class NamaBulan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka bulan (1 - 12): ");
		int bulan = scanner.nextInt();
		switch(bulan) {
			case 1:
				System.out.println("Januri");
				break;
			case 2:
				System.out.println("Februari");
				break;
			case 3:
				System.out.println("Maret");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("Mei");
				break;
			case 6:
				System.out.println("Juni");
				break;
			case 7:
				System.out.println("Juli");
				break;
			case 8:
				System.out.println("Agustus");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("Oktober");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("Desember");
				break;
			default:
				System.out.println("Angka tidak valid");
				main(args);
			scanner.close();
		}
	}

}
