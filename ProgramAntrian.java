
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramAntrian {
    private static int[]queue=new int[10];
    private static int counters=0;
    
    private static boolean queueStorage(){
        if(counters<queue.length){
            return true;
        }
        else{
            return false;
        }
    }

    private static void createQueue(){
        int loopX =0;
        int alpha =0;
        while(loopX==0){
            System.out.print("Masukkan Data (angka): ");
            Scanner alphaX= new Scanner(System.in);
            try{
                alpha= alphaX.nextInt();
                loopX= 1;
            }catch(InputMismatchException e){
                System.out.println("Masukkan harus berupa Angka!");
                loopX= 0;
            }
        }
        queue[counters]=alpha;
        counters++;
    }
    private static void removeQueue(){
        counters--;
        for(int i=0; i<counters; i++){
            queue[i]=queue[i+1];
        }
        System.out.println("Data Pertama dalam antrian sudah dikeluarkan");
    }
    private static void aListQueue(){
        String aList = null;
        
        System.out.println("Data Pertama dalam antrian sudah dikeluarkan\t:"+aList);
    }
    private static void displayDataQueue(){
        System.out.print("\n");
        System.out.print("Data dalam Antrian : ");
        System.out.print("\n");
        for(int i=0; i<counters; i++){
            System.out.print("["+i+"=>"+queue[i]+"]");
        }
        System.out.println("");
    }
    private static void cleanQueue() {
    counters = 0;
}
    
    private static void quitApp(){
        String quitss ="Y";
        System.out.print("Keluar dari program?(Y/N)");
        quitss=new Scanner(System.in).nextLine();
        if(quitss.equalsIgnoreCase("Y")){
            System.exit(0);
        }
        else{
            menuProgram();
        }
    }
    private static void menuChooser(int choosenMenu){
        switch(choosenMenu){
            case 1:
                boolean insert = queueStorage();
                if(insert){
                    createQueue();
                }
                 insert = queueStorage();
                if(insert){
                    createQueue();
                }
                else{
                    System.out.println("Antrian Penuh! kosongkan salah satu data terlebih dahulu");
                }
                break;
            case 2:
                removeQueue();
                break;
            case 3:
                aListQueue();
                break;
            case 4:
               cleanQueue () ;
                break;
            case 5:
                displayDataQueue();
                break;
            case 6:
                quitApp();
                break;
        }
        menuProgram();
    }
    private static void menuProgram(){
        int loopX = 0;
        int choosenMenu = 0;
        while(loopX==0){
            System.out.println("\n");
            System.out.println("==================================");
            System.out.println("====== Antrian bang mangkiri =====");
            System.out.println("==================================");
            System.out.println("\n");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus 1 data dari Antrian");
            System.out.println("3. menghapus salah satu data dalam Antrian");
            System.out.println("4. Hapus semua data");
            System.out.println("5. tampilkan data Antrian");
            System.out.println("6. Keluar dari Program");
            System.out.println("\n");
            System.out.println("==================================");
            System.out.println("Pilih Menu : ");
            Scanner menuOption = new Scanner(System.in);
            try{
                choosenMenu= menuOption.nextInt();
                loopX =1;
            }catch(InputMismatchException e){
                System.out.println("Masukkan harus Angka!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }
    public static void main(String[]args){
        menuProgram();
    }

    private static void pollQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
  
}

    private static void alistQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void insertQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
