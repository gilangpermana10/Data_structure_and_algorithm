import java.util.Scanner;

public class InvertTeks {
    public static void main(String args[]) {
        String awal, invert = "";
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("Input kata atau kalimat disini : ");
        awal = input.nextLine();
        input.close();
        
        //proses invert
        for (int i = awal.length() - 1; i >= 0; i--){
            invert += awal.charAt(i);
        }

        //output
        System.out.println("Hasil invert ; " + invert );    
        }
    }