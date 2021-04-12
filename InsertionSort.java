import java.util.Scanner;
 
public class InsertionSort{
    public static void main(String[] args)
    {
       Scanner dataIn = new Scanner(System.in);
         
        //  Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    
        int jlh_data = dataIn.nextInt();
         
        //  Array Data untuk menampung nilai Data
        int[] data = new int[jlh_data];
         
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++){
                            System.out.print("Data ke-"+(a+1)+" : ");   data[a] = dataIn.nextInt();
                        }
                         
        
        System.out.println("\nProses Insertion Sort");
        for(int a = 0; a < jlh_data-1; a++)
        {
            System.out.println("Iterasi "+(a+1));
            for(int b = 0; b < jlh_data; b++)
                System.out.print(data[b]+"\t");
             
            System.out.print("   --> Bandingkan "+data[a+1]+" dengan "+data[a]);
             
            for(int b = a+1; b > 0; b--)
            {
                String pesan = "   --> Tidak ada pertukaran";
                if(data[b] < data[b-1])
                {
                    pesan = "   --> "+data[b]+" tukar posisi dengan "+data[b-1];
                     
                    //  Proses Pertukaran
                    int temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                     
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                }
                 
                else
                {
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                        break;
                }
            }
            System.out.println("\n");
        }
         
        //  Tampilkan hasil Sorting
        System.out.print("\nData setelah di Sorting : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+" ");
         
    }
}
