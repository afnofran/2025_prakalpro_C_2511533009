package pekan5_2511533009;

public class tugasAlproPekan5_2511533009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 4;
        int maxTitik = 4;
        //Untuk Membuat Atap
        System.out.printf("#");
        //menggunakan rumus max*maxTitik untuk rumus atap agar dapat menyesuaikan dengan pola belah ketupat
        for(int i = 0;i<max*maxTitik;i++){
            System.out.printf("=");
        }
        System.out.printf("#");
        System.out.println(); //Akhir dari line
        String s = "<>"; //Agar Memudahkan Pembacaan Kode
        //Pengulangan pertama untuk segitiga atas 
        for (int i = 0;i<max;i++){//Loop untuk line
            System.out.print("|");
            for (int j = i;j<(max*2-i)-2;j++){//Loop untuk spasi
            	//Menggunakan rumus (max*2-i)-2 untuk mendapatkan pola spasi
                System.out.printf(" ");
            }
            //Lalu digabungkan dengan segitiga "<>"
            System.out.print(s);
            //kemudia membuat pola titik dimana selalu ditambahkan 4
            for (int j = 0;j<i*maxTitik;j++){
            	//menggunakan rumus i*maxtitik untuk mendapatkan pola titik
                System.out.print(".");
            }
            System.out.print(s);
            //Menggunakan rumus yang sama seperti pengulangan di atas untuk membuat pola dinding luar
            for (int j = i;j<(max*2-i)-2;j++){
                System.out.printf(" ");
            }
            System.out.println("|");
        }
        //Pengulangan kedua untuk membuat segitiga terbalik
        for (int i = 0;i<max;i++){
            System.out.print("|");
            //Menggunakan rumus i*2 untuk mendapatkan pola spasi
            for (int j = 0;j<i*2;j++){
                System.out.printf(" ");
            }
            System.out.print(s);
            //menggunakan rumus maxTitik*(max-1)-i*4 untuk mendapatkan pola titik yang terbalik 
            for (int j = 0;j<maxTitik*(max-1)-i*4;j++){
                System.out.print(".");
            }
            System.out.print(s);
            //menggunakan rumus yang sama pada pengulangan pertama untuk membuat pola spasi
            for (int j = 0;j<i*2;j++){
                System.out.printf(" ");
            }
            System.out.println("|");
        }
        System.out.printf("#");
        //menggunakan rumus max*maxTitik untuk rumus atap agar dapat menyesuaikan dengan pola belah ketupat
        for(int i = 0;i<max*maxTitik;i++){
            System.out.printf("=");
        }
        System.out.printf("#");
        System.out.println();
	}

}
