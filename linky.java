//gilang permana
//TI20Regular A
//20200040041

package list;

public class linky {

    // representasi dari yang Node yang akan kita gunakan
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    // pendeklarasisan nilai awal dan akhir
    public Node awal = null;
    public Node akhir = null;

    public void tambah(int data){
        Node baru = new Node(data);

        if(awal == null){
            awal = baru;
            akhir = baru;
            akhir.next = awal;
        }else{
            akhir.next = baru;
            akhir = baru;
            akhir.next = awal;
        }
    }

    public void tampil(){
        Node current = awal;
        if(awal == null){
            System.out.println("Data Tidak ada");
        }else{
            System.out.println("Berikut adalah daftar data anda : ");
            do{
                System.out.println(" " + current.data);
                current = current.next;
            }while(current != awal);
        }
    }

    public static void main(String[] args) {
        linky daftar = new linky();

        daftar.tambah(21);
        daftar.tambah(32);
        daftar.tambah(44);
        daftar.tambah(25);
        daftar.tambah(2);
        daftar.tambah(1);

        daftar.tampil();
    }
}
