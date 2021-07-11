import java.util.ArrayList;

public class PerbandinganArray {

    static  String arrayToString(ArrayList<String> sources) {
        String results  = "";

        for(int i = 0;  i < sources.size(); i++) {
            results += (sources.get(i) + (i < sources.size() - 1 ? ", " : " "));
        }
        return results;
    }

    public static void main(String args[]) {
        Integer vaki[] = {5000, 3000, 6500, 10000, 4000, 4000};
        Integer rina[] = {10000, 5000, 5000, 10000, 15000, 10000};
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum’at", "Sabtu"};
        ArrayList<String> rinaWin = new ArrayList<>();
        ArrayList<String> vakiWin = new ArrayList<>();
        ArrayList<String> Same = new ArrayList<>();
        Integer totalRina = 0;
        Integer totalVaki = 0;


        for (int i = 0; i < hari.length; i++) {
            if(vaki[i] > rina[i]) {
                vakiWin.add(hari[i]);
            } else if(rina[i] > vaki[i]) {
                rinaWin.add(hari[i]);
            } else {
                Same.add(hari[i]);
            }

            totalRina += rina[i];
            totalVaki += vaki[i];
        }

        System.out.println("Uang saku Vaki lebih banyak dari Rina "+ vakiWin.size() +"x pada hari "+ arrayToString(vakiWin));
        System.out.println("Uang saku Rina lebih banyak dari Vaki "+ rinaWin.size() +"x pada hari "+ arrayToString(rinaWin));
        System.out.println("Uang saku Vaki sama dengan Rina pada "+ Same.size() +"x pada hari " + arrayToString(Same));
        System.out.println("Total Uang saku Vaki adalah Rp "+ totalVaki +" per/minggu");
        System.out.println("Total Uang saku Rina adalah Rp "+ totalRina +" per/minggu");

    }
}