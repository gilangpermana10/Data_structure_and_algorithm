import java.util.Scanner;
import java.util.Stack;

public class playlistLagu {
    
    public static void main(String[] args) {
        playlistLagu LaguSaya = new playlistLagu();
        
        
        int c =0;
        while(c != 1){
            System.out.println("===============================================");
            System.out.println("===============* Daftar Lagu *=================");
            System.out.println("===============================================");
            System.out.println("");
            LaguSaya.tampilkanLagu();
            System.out.println("");;
            
            ViewMenu("Utama");

            Scanner in = new Scanner(System.in);
            System.out.print("Pilih Menu : ");
            int menu = in.nextInt();

            System.out.println("");

            switch(menu){
                case 1:
                    LaguSaya.tambahLagu();
                    break;
                case 2:
                    LaguSaya.hapusLagu();
                    break;
                case 3:
                    LaguSaya.hapusSemuaLagu();
                    break;
                case 0:
                    c = 1; 
                break;
            }
        }
    }

    Stack <String> lagu;
    
    playlistLagu(){
        lagu = new Stack<String>();
    }

    public static void ViewMenu(String menu) {
        switch(menu){
            
            case "Utama":
                System.out.println("=================* Menu Utama *================");
                System.out.println("\n");;
                System.out.println("[1] Tambah Lagu");
                System.out.println("[2] Hapus Lagu");
                System.out.println("[3] Hapus Semua Lagu");
                System.out.println("[0] Keluar");
                System.out.println("\n");
                System.out.println("===============================================");
                break;
            case "Tambah-Lagu":
                System.out.println("===============* Tambah Lagu *=================");
                System.out.println("[1] Tambah Lagu");
                System.out.println("[0] Kembali");
                break;
            case "Hapus-Lagu":
                System.out.println("================* Hapus Lagu *=================");
                System.out.println("[1] Hapus Lagu");
                System.out.println("[0] Kembali");
                break;
            case "Hapus-Semua-Lagu":
                System.out.println("=============* Hapus Semua Lagu *==============");
                System.out.println("[1] Yakin ? ");
                System.out.println("[0] Kembali");
            break;
            
        }
    }

    void tampilkanLagu(){
        if(lagu.empty()){
            System.out.println("Lagu Kosong");
        }else{
            for(String a: lagu){
                System.out.println("* " + a);
            }
        }
    }

    void tambahLagu(){
        int c =0;
        while(c != 1){
            System.out.println("");
            
            ViewMenu("Tambah-Lagu");

            Scanner in = new Scanner(System.in);
            System.out.print("Pilih Menu : ");
            int menu = in.nextInt();

            System.out.println("");

            switch (menu){
                case 1:
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Penyanyi: ");
                    String penyanyi = scan.next();
                    penyanyi += scan.nextLine();
                    
                    System.out.print("Judul: ");
                    String judul = scan.next();
                    judul += scan.nextLine();

                    lagu.add(penyanyi + " - " +judul);
                    break;

                case 0:
                    c = 1;
                    break;
            }
        }
    }

    void hapusLagu(){
        int c = 0;
        while(c != 1){
            System.out.println("");

            ViewMenu("Hapus-Lagu");

            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();

            System.out.println("");

            switch(menu){
                case 1:
                    lagu.pop();
                    c = 1;
                    break;
                case 0:
                    c = 1;
                    break;
            }
        }
    } 

    void hapusSemuaLagu(){
        int c = 0;
        while(c != 1){
            System.out.println("");

            ViewMenu("Hapus-Semua-Lagu");

            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();

            System.out.println("");

            switch(menu){
                case 1:
                    lagu.clear();
                    c = 1;
                    break;
                case 0:
                    c = 1;
                    break;
            }
        }
    } 

}
