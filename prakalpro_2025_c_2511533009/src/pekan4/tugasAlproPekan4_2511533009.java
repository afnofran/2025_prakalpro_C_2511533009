package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511533009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String namaPembeli;
        int jumlahTiket,waktuTayang,jenisStudio,hari,hargaTiket;
        double biayaTambahanJam = 5.0/100.0;
        double biayaTambahanHari = 10.0/100.0;
        double biayaTambahan=0.0;
        int Regular = 10000;
        int Deluxe = 15000;
        int Premium = 20000;

        /**
         * Input:
         * a. Nama pembeli (String)
         * b. Jumlah tiket (integer)
         * c. Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu)
         * d. Waktu tayang (1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00)
         * e. Jenis studio (1=Regular, 2=Deluxe, 3=Premium)
         *
         * Rules:
         * untuk hari Sabtu-Minggu harga tiap tiket bertambah 10% dari harga normal untuk tiap jenis studio
         * untuk jam Malam mendapatkan biaya tambahan 5%
         * Harga tiap jenis studio:
         * Regular: 10000
         * Deluxe : 15000
         * Premium: 20000
         * **/

        Scanner input = new Scanner(System.in);
        System.out.println("]========|PEMBELIAN TIKET BIOSKOP|========[");
        System.out.print("Nama Pembeli      : ");

        namaPembeli = input.nextLine();

        System.out.println("-{!}- Silahkan Pilih Hari -{!}-");
        System.out.println("[1] Senin-Kamis\n[2] Jumat\n[3] Sabtu-Minggu");
        System.out.print("Hari              : ");

        hari = input.nextInt();
        if (hari>3){
            System.out.println("[!] Hari tidak ditemukan [!]\nMenutup program...");
            return;
        }

        System.out.println("-{!}- Silahkan Pilih Waktu Tayang Anda -{!}-");
        System.out.println("[1] Pagi(10:00-12:00)\n[2] Siang(12:00-17:00)\n[3] Malam(17:00-22:00)");
        System.out.print("Waktu Tayang      : ");

        waktuTayang = input.nextInt();
        if(waktuTayang>3) {
            System.out.println("[!] Waktu tidak ditemukan [!]\nMenutup program...");
            return;
        }

        System.out.println("-{!}- Silahkan Pilih Jenis Studio -{!}-");
        System.out.println("[1] Regular     [2] Deluxe\n[3] Premium");
        System.out.print("Jenis Studio      : ");

        jenisStudio = input.nextInt();
        if (jenisStudio == 1) hargaTiket = Regular;
        else if (jenisStudio==2) hargaTiket = Deluxe;
        else if (jenisStudio==3) hargaTiket = Premium;
        else {
            System.out.println("[!] Jenis tidak ditemukan [!]\nMenutup program...");
            return;
        }

        System.out.print("Jumlah Tiket      : ");

        jumlahTiket = input.nextInt();

        System.out.println("");
        System.out.println("");
        System.out.println("]========|DETAIL PEMBELIAN TIKET BIOSKOP|========[");
        System.out.println("Harga Dasar: Rp " + hargaTiket + "/iket");

        if (hari == 3){
            biayaTambahan += biayaTambahanHari;
            System.out.println("Biaya Hari Minggu: +10% ");
        }
        if (waktuTayang==3) {
            biayaTambahan += biayaTambahanJam;
            System.out.println("Biaya Jam Malam: +5% ");
        }
        hargaTiket+=hargaTiket*biayaTambahan;

        System.out.println("Harga per Tiket: Rp " + hargaTiket);

        hargaTiket*=jumlahTiket;

        System.out.println("Subtotal    : Rp " + hargaTiket);

        if (jumlahTiket>3){
            hargaTiket -= hargaTiket*20/100;
            System.out.println("Diskon 20%: Rp " +hargaTiket);
        }

	}

}
