package pekan5_2511533009;

public class perulanganFor3_2511533009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumlah=0;
		for(int i = 1;i<=10;i++) {
			System.out.print(i);
			jumlah= jumlah+i;
			if(i<10) {
				System.out.print(" + ");
			}
		}
		System.out.println();
		System.out.println("Jumlah = "+jumlah);
	}

}
