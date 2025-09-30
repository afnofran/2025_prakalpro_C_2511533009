package pekan3;
import java.util.Scanner;
public class OperatorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A1;
        int A2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input angka-1: ");
        A1 = keyboard.nextInt(); //Input 10
        System.out.println("Input angka-2:");
        A2 = keyboard.nextInt();
        keyboard.close();// Input 5
        System.out.println("Assignment penambahan");
        A1 += A2;//Penambahan sekarang A1 = 15
        System.out.println("Penambahan: " + A1);
        System.out.println("Assignment pengurangan");
        A1 -= A2;// Pengurangan, sekarang A1 = 10
        System.out.println("Pengurangan: " + A1);
        System.out.println("Assignment perkalian");
        A1 *= A2;// Perkalian, sekarang A1 = 50
        System.out.println("Perkalian: "+ A1);
        System.out.println("Assignment hasil bagi");
        A1 /= A2;// Hasil bagi, sekarang A1 = 10
        System.out.println("Pembagian: " + A1);
        System.out.println("Assignment sisa bagi");
        A1 %= A2;// Sisa bagi, sekarang = 0
        System.out.println("Sisa bagi: " + A1);

	}

}
