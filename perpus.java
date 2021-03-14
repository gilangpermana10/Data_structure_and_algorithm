import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class perpus {
  public static void main(String[] args) {

    int keluar = 0;
    ArrayList <Mahasiswa> dataMahasiswa = new ArrayList<>(); 

    dataMahasiswa.add(new Mahasiswa("20200040041", "Gilang Permana"));
    dataMahasiswa.add(new Mahasiswa("20200040042", "Muhamad Falah"));
    dataMahasiswa.add(new Mahasiswa("20200040043", "M Ilhamudin"));
    dataMahasiswa.add(new Mahasiswa("20200040044", "Permana prasetya"));
    dataMahasiswa.add(new Mahasiswa("20200040045", "Sandi Maulana"));

    ArrayList <Buku> dataBuku = new ArrayList<>(); 

    dataBuku.add(new Buku("001", "Bumi"));
    dataBuku.add(new Buku("011", "Python fo beginer"));
    dataBuku.add(new Buku("021", "5cm"));
    dataBuku.add(new Buku("031", "KBBI"));
    dataBuku.add(new Buku("041", "java, zero to hero"));

    ArrayList <Transaksi> dataTransaksi = new ArrayList<>(); 

    dataTransaksi.add(new Transaksi(
          dataMahasiswa.get(0).nim,
          dataMahasiswa.get(0).nama,
          dataBuku.get(0).judul,
          3
        ));

    while(keluar != 1) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\n");
      System.out.print("------------ Perpustakaan -------------- \n");
      System.out.print("\n");
      System.out.print("------------     Menu     -------------- \n");
      System.out.print("[1] Mahasiswa \n");
      System.out.print("[2] Buku \n");
      System.out.print("[3] Transaksi \n");
      System.out.print("[4] Keluar dari Aplikasi \n");
      System.out.print("---------------------------------------- \n");
      System.out.print("Pilih Menu : ");
      int menu = scanner.nextInt();

      switch(menu) {
        case 1: 
          menuMahasiswa(dataMahasiswa);
          break;
        case 2: 
          menuBuku(dataBuku);
          break;
        case 3: 
          menuTransaksi(dataTransaksi, dataBuku, dataMahasiswa );
          break;
        case 4:
          System.out.print("Keluar dari Aplikasi [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();

          keluar = confirm;
          break;
      }


    }
    
  }

  public static void menuMahasiswa(ArrayList <Mahasiswa> dataMahasiswa) {
    int keluar = 0;
    Scanner scanner = new Scanner(System.in);

    while(keluar != 1) {
      System.out.print("\n");
      System.out.print("--------------- Daftar Mahasiswa -------------- \n");
      for (Mahasiswa mahasiswa:dataMahasiswa) {
          System.out.println(mahasiswa.nim + " - " + mahasiswa.nama);
      }
      System.out.println("");
      System.out.print("--------------- Pilih Menu -------------- \n");
      System.out.println("");     
      System.out.print("[1] Tambah Data Mahasiswa \n");
      System.out.print("[2] Hapus Data Mahasiswa \n");
      System.out.print("[3] Keluar dari Menu Mahasiswa \n");
      System.out.print("---------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();

      switch(menu) {

        case 1: 
        System.out.println("Masukan Data Mahasiswa");
        System.out.print("Nim : ");
        String nim = scanner.next();

        System.out.print("Nama : ");
        String nama = scanner.next();
        nama += scanner.nextLine();

        dataMahasiswa.add(new Mahasiswa(nim, nama));
          break;

        case 2:
          System.out.println("");
          for (Mahasiswa mahasiswa:dataMahasiswa) {
            System.out.println(mahasiswa.nim + " - " + mahasiswa.nama);
          }

          System.out.print("Masukan Index untuk dihapus (dimulai dari 0): ");
          int index = scanner.nextInt();

          dataMahasiswa.remove(index);
          break;

        case 3:
          System.out.print("Keluar dari Menu Mahasiswa [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();

          keluar = confirm;
          break;

        default:
          break;
      }
    }



  } 

  public static void menuBuku(ArrayList <Buku> dataBuku) {
    int keluar = 0;
    Scanner scanner = new Scanner(System.in);

    while(keluar != 1) {
      System.out.print("\n");
      System.out.print("-------------- Daftar Buku -------------- \n");
      System.out.println("");
      for (Buku buku:dataBuku) {
        System.out.println("- " + buku.kode + " - " + buku.judul);
      }
      System.out.println("");
      System.out.print("--------------- Pilih Menu -------------- \n");
      System.out.println("");
      System.out.print("[1] Tambah Data Buku \n");
      System.out.print("[2] Hapus Data Buku \n");
      System.out.print("[3] Keluar dari Menu Buku \n");
      System.out.print("---------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();

      switch(menu) {

        case 1:
          System.out.println("Masukan Data Buku");

          System.out.print("Kode : ");
          String kode = scanner.next();

          System.out.print("Judul : ");
          String judul = scanner.next();
          judul += scanner.nextLine();

          dataBuku.add(new Buku(kode, judul));
          break;

        case 2:
          System.out.print("Masukan Index untuk dihapus : ");
          int index = scanner.nextInt();

          dataBuku.remove(index);
          break;

        case 3:
          System.out.print("Keluar dari Menu Buku [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();

          keluar = confirm;

          break;

        default:
          break;
      }
    }


  } 

  public static void menuTransaksi(
      ArrayList <Transaksi> dataTransaksi,
      ArrayList <Buku> dataBuku,
      ArrayList <Mahasiswa> dataMahasiswa
      ) {
    int keluar = 0;
    Scanner scanner = new Scanner(System.in);

    while(keluar != 1) {
      System.out.print("\n");
      System.out.print("----------- Daftar Transaksi ------------ \n");
        System.out.println("");
        for (Transaksi transaksi:dataTransaksi) {
          System.out.println(
                transaksi.nim + 
                " - " + 
                transaksi.nama_mahasiswa + 
                " - " + 
                transaksi.judul_buku + 
                " - " + 
                transaksi.jumlah_buku 
              );
        }
        System.out.println("");
        System.out.print("--------------- Pilih Menu -------------- \n");
        System.out.println("");
      System.out.print("[1] Tambah Data Transaksi \n");
      System.out.print("[2] Hapus Data Transaksi \n");
      System.out.print("[3] Keluar dari Menu Transaksi \n");
      System.out.print("---------------------------------------- \n");
      System.out.print("Pilih Aksi : ");
      int menu = scanner.nextInt();
      
      switch(menu) {
        
        case 1: 

        
          System.out.println("Masukan Data Transaksi");
          System.out.println("");
            for (Mahasiswa mahasiswa:dataMahasiswa) {
              System.out.println(mahasiswa.nim + " - " + mahasiswa.nama);
            }
            System.out.println("");
  
          System.out.print("Nomor Index Mahasiswa : ");
          int indexMahasiswa = scanner.nextInt();

          System.out.println("");
          for (Buku buku:dataBuku) {
            System.out.println("- " + buku.kode + " - " + buku.judul);
          }
          System.out.println("");
          System.out.print("Nomor Index Buku : ");
          int indexBuku = scanner.nextInt();
    
          System.out.print("Jumlah Buku yg ingin dipinjam: ");
          int jumlah_buku = scanner.nextInt();
    
          dataTransaksi.add(new Transaksi(
                dataMahasiswa.get(indexMahasiswa).nim,
                dataMahasiswa.get(indexMahasiswa).nama,
                dataBuku.get(indexBuku).judul,
                jumlah_buku
                ));
          break;

        case 2:
          System.out.print("Masukan Index untuk dihapus : ");
          int index = scanner.nextInt();

          dataTransaksi.remove(index);
          break;

        case 3:
          System.out.print("Keluar dari Menu Transaksi [1 = ya, 0 = tidak ] ? : ");
          int confirm = scanner.nextInt();
          keluar = confirm;

          break;

        default:
          break;
      }
    }

  } 


}

class Mahasiswa {
  String nim, nama;

  public Mahasiswa(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
  }
}

class Buku {
  String kode,judul;

  public Buku(String kode, String judul) {
    this.kode = kode;
    this.judul = judul;
  }

}


class Transaksi {
  String nim, nama_mahasiswa, judul_buku;
  int jumlah_buku ;

  public Transaksi(String nim, String nama_mahasiswa, String judul_buku, int jumlah_buku) {
    this.nim = nim;
    this.nama_mahasiswa = nama_mahasiswa;
    this.judul_buku = judul_buku;
    this.jumlah_buku = jumlah_buku;
  }
}