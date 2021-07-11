import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[][] matriks = {{0,0},{0,0}};

        Scanner in =new Scanner(System.in);
        int i=0;
        int j=0;
        for(i=0; i <= 1; i++){
            System.out.println("Matriks A");
            System.out.println("Masukan nilai matriks ke-" + i);
            int a = in.nextInt();
            matriks[0][i] = a;
        }
        
        for(j=0; j<=1; j++){
            System.out.println("Matriks B");
            System.out.println("Masukan nilai matriks ke-" + j);
            int b = in.nextInt();
            matriks[1][j] = b;
        }

        for(int k=0; i<2;k++){
            for(int l=0; l<2;l++){
                System.out.println("Matriks A" + matriks[k][l]);
            }
        }

    }
}
