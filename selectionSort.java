import java.util.Arrays;
import java.util.function.ToLongFunction;
import java.lang.Object;

public class SelectionSort{
    public static void main(String[] args) {
    
        int data[] = {42,53,52,44,64,11,32,1,87,99};
        int min = data[0];
        int index = 0;
        long waktu= 0;

        for(int j=0; j < data.length-1; j++){
            for(int i=j; i< data.length; i++){
                if(data[i] < min){
                    min = data[i];
                    index = i;
                }
            }
            
            if(min < data[j]){
            data[index] = data[j];
            data[j] = min;
        }
        min = data[j+1];

        long startTime = System.currentTimeMillis();
        System.out.println("Swap ke-" + (j+1) +" "+ Arrays.toString(data));
        long stopTime = System.currentTimeMillis();

        waktu = stopTime - startTime;
        System.out.println("waktu eksekusi = " + waktu + " milisecond");

    }

    }
}