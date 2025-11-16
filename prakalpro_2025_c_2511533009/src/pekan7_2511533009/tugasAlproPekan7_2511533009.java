package pekan7_2511533009;
import java.util.Scanner;
public class tugasAlproPekan7_2511533009 {

	public static void main(String[] args) {
        String username,email,password;
        int pinAngka;
        Akun_2511533009 akun = new Akun_2511533009();
        Scanner input = new Scanner(System.in);
        System.out.println(" ===== REGISTRASI AKUN BARU =====");
        System.out.print("Masukkan Username: ");
        username = input.nextLine();
        akun.setUsername(username);
        System.out.print("Masukkan Password: ");
        password = input.nextLine();
        akun.setPassword(password);
        System.out.print("Masukkan Email: ");
        email = input.nextLine();
        akun.setEmail(email);
        System.out.printf("Masukkan PIN (6 digit): ");
        pinAngka = input.nextInt();
        akun.setPinAngka(pinAngka);
        if (akun.isPasswordValid()){
            if (akun.isEmailValid()){
                System.out.println("--- REGISTRASI BERHASIL ---");
                System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat");

                System.out.println("\n--- Detail Akun ---");
                System.out.println("Username (Lowecase): " +akun.getUsername().toLowerCase());

                System.out.println("Email (Uppercase): " + akun.getEmail().toUpperCase());

                String concat1 = akun.getUsername() + akun.getPinAngka();
                System.out.println("ID Pengguna (Gabungan): " + concat1);

                System.out.println("\n--- uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");

                int penjumlahan = akun.getPinAngka() + 10;
                System.out.println("PIN (int) + 10        = " + penjumlahan);

                String concat2 = akun.getPinAngka() + "10";
                System.out.println("PIN (String) + \"10\" =" + concat2);
            }else {
                System.out.println("--- REGISTRASI GAGAL ---");
                System.out.println("Email Anda \""+ akun.getUsername() +"\" tidak valid (harus mengandung '@' dan '.'.");
                System.out.println("Silakan coba lagi.");
            }
        }else {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Email Anda \""+ akun.getUsername() +"\" tidak valid (panjang password minimal 8 karakter).");
            System.out.println("Silakan coba lagi.");
        }
    }

}
