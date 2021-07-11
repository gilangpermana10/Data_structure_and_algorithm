import java.util.Scanner;
import java.util.Scanner;

public class MenyisipkanTeks {
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukan teks awal : ");
        String awal = baca.nextLine();

        hitungKata(awal);
    }

    
        static void hitungKata(String text){  
            int count=0;  
            char ch[]= new char[text.length()];     
              
            for(int i=0;i<text.length();i++) {  
                ch[i]= text.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&& (ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0))){
                    count++;  
                    
                } 
            } 
            return count;
          }
}
