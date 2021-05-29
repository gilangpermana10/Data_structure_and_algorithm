import java.util.Scanner;

class searchNumerik{

    public static void main(String[] args) {
        int l[]={12,23,1,23,42,21,231,222,2321,412,42,0};
        int posisi = -1;

        Scanner in =new Scanner(System.in);
        System.out.println("Masukan nilai yang akan di cari : ");
        int x = in.nextInt();
        
        int j = 0; 
        
        while(j < l.length){
            if(l[j] == x){
                posisi = j;
                System.out.println( "Data "+x + " Ditemukan di " + (posisi+1));
                break;
            }else{
                j++;
            }
        }
        System.out.println("\nData " + x + " Tidak ditemukan");

        


    }
}
