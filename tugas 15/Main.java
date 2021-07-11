import operasi.hillcipher;
import operasi.File;

public class Main {

    public static void main(String[] args) throws Exception {
        //pengisian matriks
        // hillcipher.Key();
        
        //Enkripsi
        String TeksInput = File.baca("./pesan.txt");
        String TeksEnkripsi = hillcipher.encrypt(TeksInput);
        File.out("./pesan-dienkripsi.txt", TeksEnkripsi);

        //Dekripsi
        String FileEnkripsi = File.baca("./pesan-dienkripsi.txt");
        String TeksDekripsi = hillcipher.decrypt(FileEnkripsi);
        File.out("./pesan-didekripsi.txt", TeksDekripsi);        

    }
}
