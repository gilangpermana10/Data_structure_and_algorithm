import java.util.Scanner;

public class HurufVokalKonsonan {
    public static void main (String args[]){
        int vokal = 0, konsonan = 0;
        
        //input
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukan teks : ");
        String teks = baca.nextLine();

        //Proses menghitung
        for (int i = 0; i < teks.length(); i ++){

            char kar = Character.toLowerCase(teks.charAt(i));
            
            if (kar == 'a' || kar == 'i' || kar == 'u' || kar == 'e' || kar == '0'){
                vokal ++;
            }else if (Character.isLetter (kar)){
                konsonan ++;
            } 
        }

        System.out.println("\nDalam teks "+teks + " terdapat :" ); 
        System.out.println(vokal + " huruf vokal"); 
        System.out.println(konsonan + " huruf kosonan"); 
        System.out.println("total huruf :" + (konsonan + vokal)); 
    }
}