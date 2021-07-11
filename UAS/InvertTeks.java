import java.util.*;

public class InvertTeks {
    public static void main(String args[]) {
        
        String awal, invert = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input kata atau kalimat disini : ");
        
        awal = input.nextLine();
        
        for (int i = awal.length() - 1; i >= 0; i--)
        {
            invert += awal.charAt(i);
        }
        
        System.out.println("Hasil kata yang di balik ; " + invert );
    
        }
}