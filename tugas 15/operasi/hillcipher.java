package operasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class hillcipher {
 
    public static String charlib = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_-+={}[]|:;’<>,.?/ ";
    public static String[] HURUF = charlib.split("");
    public static int MODULO = charlib.length();
    
    //==========
    //Masih Ada error di bagian dinamis
    //==========

    // public static int[][] ENCRYPTION_KEY = {{0,0},{0,0}};
    // public static Scanner in =new Scanner(System.in);
    
    // public static int Key(){
    //     for(int i=0; i <= 1; i++){
    //         System.out.println("\nMatriks A");
    //         System.out.println("Masukan nilai matriks ke-" + i);
    //         int a = in.nextInt();
    //         ENCRYPTION_KEY[0][i] = a;
    //     }
        
    //     for(int j=0; j<=1; j++){
    //         System.out.println("\nMatriks B");
    //         System.out.println("Masukan nilai matriks ke-" + j);
    //         int b = in.nextInt();
    //         ENCRYPTION_KEY[1][j] = b;
    //     }

    //     // syarat(ENCRYPTION_KEY);
    //     int det = (ENCRYPTION_KEY[0][0]*ENCRYPTION_KEY[1][1])-(ENCRYPTION_KEY[0][1]*ENCRYPTION_KEY[1][0]);
    
    //     if( det == 1){
    //         System.out.println("Matriks memenuhi syarat");
    //         System.out.println("Cek File.");
    //     }else{
    //         System.out.println("Matrik tidak memenuhi syarat");
    //         System.exit(0);
    //     }
    //     return 0;
    // }
    

    public static int[][] ENCRYPTION_KEY = {
        {3, 2},
        {7, 5}
    };

    public static int[][] DECRYPTION_KEY = {
        { ENCRYPTION_KEY[1][1], -(ENCRYPTION_KEY[0][1]) + MODULO },
        { -(ENCRYPTION_KEY[1][0]) + MODULO, ENCRYPTION_KEY[0][0] }
    };

    public static boolean ganjil(int nilai) {
        if(nilai % 2 != 0 && nilai != 0){
            return true;
        }
        return false;
    }

    public static int[] CariDenganPartial(List<Character> partial) {
        int[] ArrayNomor = new int[2];
        
        for(int i=0; i < partial.size();i++){
            ArrayNomor[i] = CariNumerikDariHuruf(partial.get(i));
        }
        return ArrayNomor;
    }

    public static int CariNumerikDariHuruf(Character Huruf) {
        String stringHuruf = Character.toString(Huruf);
        int kodeNumerik = -1;

        for(int i=0; i< HURUF.length;i++){
            if(stringHuruf.equals(HURUF[i])){
                kodeNumerik = i;
            }
        }
        return kodeNumerik;
    }

    public static String CariHurufDariNumerik(int kodeNumerik) {
        String huruf = "";
        int PembagianNumerik = kodeNumerik % MODULO;
    
        for (int i = 0; i < HURUF.length; i++) {
          if (PembagianNumerik == i) {
            huruf = HURUF[PembagianNumerik];
          }
        }
    
        return huruf;
      }
    
      
      public static String UbahKeHuruf(int[] ArrayNo, String processKey) {
        int numOne = 0, 
            numTwo = 0;
    
        switch(processKey) {
          case "1":
            numOne = (
              (ArrayNo[0] * ENCRYPTION_KEY[0][0]) + 
              (ArrayNo[1] * ENCRYPTION_KEY[1][0])
            );
            numTwo = ( 
              (ArrayNo[0] * ENCRYPTION_KEY[0][1]) + 
              (ArrayNo[1] * ENCRYPTION_KEY[1][1]) 
            );
            break;

          case "2":
            numOne = (
              (ArrayNo[0] * DECRYPTION_KEY[0][0]) + 
              (ArrayNo[1] * DECRYPTION_KEY[1][0]) 
            ) % MODULO;
    
            numTwo = ( 
              (ArrayNo[0] * DECRYPTION_KEY[0][1]) + 
              (ArrayNo[1] * DECRYPTION_KEY[1][1]) 
            ) % MODULO;
            break;
        }
    
        return CariHurufDariNumerik(numOne) + CariHurufDariNumerik(numTwo);
      }


    // Enkripsi
    public static String encrypt(String Input) {
        String In = Input;
        String hasil = "";
        int panjangInput = In.length();
        int[] HurufDalamAngka;
        List<Character> partialIn;
        ArrayList<Character> teks = new ArrayList<>();

        for (int i = 0; i < panjangInput; i++) {
            if (i == panjangInput && ganjil(panjangInput)) {
                teks.add(' ');
            }else if(i < panjangInput){
                teks.add(In.charAt(i));
            }
        }

        for (int i = 0; i < teks.size(); i++) {
            if(i != 0 && i%2 == 0){
                partialIn = teks.subList(i-2, i);
                HurufDalamAngka = CariDenganPartial(partialIn);
                hasil += UbahKeHuruf(HurufDalamAngka, "1");
            }
        }
        return hasil;
    }


    //Dekripsi
    public static String decrypt(String Input) {
        String In = Input;
        String hasil = "";
        int panjangInput = In.length();
        int[] HurufDalamAngka;
        List<Character> partialIn;
        ArrayList<Character> teks = new ArrayList<>();

        for(int i = 0; i< panjangInput;i++){
            teks.add(In.charAt(i));
        }

        for(int i=0; i < panjangInput; i++){
            if(i != 0 && i%2 ==0){
                partialIn = teks.subList(i-2, i);
                HurufDalamAngka = CariDenganPartial(partialIn);
                hasil += UbahKeHuruf(HurufDalamAngka, "2");
            }
        }
        return hasil;
    }




}
