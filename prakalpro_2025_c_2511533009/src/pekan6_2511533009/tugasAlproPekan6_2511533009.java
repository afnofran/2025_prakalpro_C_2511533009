package pekan6_2511533009;
import java.util.Scanner;
import java.util.Random;
public class tugasAlproPekan6_2511533009 {

	public static void main(String[] args) {
        boolean playing = true; //Indikator jika masih bermain atau tidak
        int percobaan=0; // Total percobaan
        
        Random random = new Random(); // Membuat Object Random
        Scanner input = new Scanner(System.in); // Membaut Object Scanner
        
        String inputBermain; // Sebagai Input untuk melepar dadu atau tidak
        
        while (playing){
            percobaan++;
            
            int dadu1 = random.nextInt(6) + 1;// Ditambah 1 karena akan mengambil nilai acak 0-5
            int dadu2 = random.nextInt(6) + 1;
            int jumlah = dadu1 + dadu2;// Menjumlahkan
            System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);
            
            if (jumlah == 7){ // jika total dadu 7 maka tebakan benar, perulanagn di hentikan
            	
                playing = false; // Mengubah value playing menjadi false untuk menghentikan perulangan
                
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
            }else{
                /* jika total dadu tidak 7 maka akan diberikan 2 opsi
                * ya untuk melanjutkan perulangan
                * tidak untuk menghentikan perulangan
                * */
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah ingin lempar dadu (iya/tidak): ");
                inputBermain = input.nextLine();
                if (inputBermain.equalsIgnoreCase("tidak")){
                    playing=false;
                    System.out.println("Anda gagal menang");
                }
            }
        }
    }

}
