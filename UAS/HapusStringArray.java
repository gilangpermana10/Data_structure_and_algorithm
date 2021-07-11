import java.util.Scanner;

public class HapusStringArray {
    public static String Teks[] = {"Saya", "sedang","belajar","struktur","data"};

    public static void main(String[] args) {

        for(int i=0; i < Teks.length;i++ ){
            System.out.println(Teks[i]+" ");
        }
        
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukan indeks yang akan dihapus : ");
        int in = baca.nextInt();

        
    }
}
