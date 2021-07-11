package operasi;

import java.io.FileReader;
import java.io.FileWriter;

public class File {

    //operasi membaca file
    public static String baca(String dir) throws Exception{
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(dir);

        int i;
        while ((i=fr.read()) != -1){
            sb.append((char)i);
        }
        fr.close();

        return sb.toString().trim();
    }

    // operasi membuat output file
    public static void out(String dir, String teks){
        try{
            FileWriter fw = new FileWriter(dir);
            fw.write(teks);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("berhasil");
        }
    }

}
