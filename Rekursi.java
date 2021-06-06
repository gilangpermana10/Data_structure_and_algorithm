import java.util.Scanner;

public class rekursi {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

            System.out.print("\n");
            System.out.print("------------ Program Rekursi ------------ \n");
            System.out.println("");
            System.out.print("--------------- Pilih Menu -------------- \n");
            System.out.println("");     
            System.out.print("[1] Program Pangkat \n");
            System.out.print("[2] Fibonacci \n");
            System.out.print("[3] Deret \n");
            System.out.print("[4] Repeat Nama \n");
            System.out.print("---------------------------------------- \n");
          System.out.print("Pilih Aksi : ");
          int menu = scanner.nextInt();

          switch(menu){
              case 1:
                System.out.println("masukan angka : ");
                int angka = scanner.nextInt();
                System.out.println("masukan eksponen : ");
                int eksponen = scanner.nextInt();
                System.out.println(pangkat(angka, eksponen));
              break;

              case 2:
                System.out.println("masukan angka fibonacci yang ingin ditampilkan : ");
                int jum = scanner.nextInt();
                for (int i = 0; i < jum; i++) {
                    System.out.println((i + 1) + " : " + fibonacci(i));
                }
              break;

              case 3:
                System.out.println(deret(1));
              break;
              
              case 4:
                 System.out.println("masukan nama : ");
                 String nama = scanner.next();
                  System.out.println(nameRepeat(nama, 1));
                
              break;

              default:
              return;
          }
        }
      
  
  
    public static int pangkat(int angka, int eksponen) {
      if (eksponen == 1 ) {
        return angka;
      } else {
        return angka * pangkat(angka, eksponen - 1); 
      }
    }
  
    public static int fibonacci(int n) {
      if ( n == 0 ) {
        return 0;
      }
      if ( n == 1) {
        return 1;
      }
      if ( n == 2 ) {
        return 1;
      }
      return (fibonacci(n - 2) + fibonacci(n - 1));
      }
  
    public static int deret(int n) {
      System.out.println(n);
      if (n > 100) {
        return n;
      } else {
        return deret(n + 2);
      }
    }
  
    public static String nameRepeat(String nama, int n) {
      System.out.println(nama);
      if (n == 99) {
        return nama;
      } else {
        return nameRepeat(nama, n + 1);
      }
    }
  } 