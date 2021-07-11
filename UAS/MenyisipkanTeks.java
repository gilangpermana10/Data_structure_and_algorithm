import java.util.ArrayList;

public class MenyisipkanTeks {

    public static void main(String[] args) {
        sisipkan("Saya sedang belajar struktur data", "pergi", 2);
        System.out.println("---------------------");
        sisipkan("Pemrograman itu sangat mudah", "dan menyenangkan", 4);
    }


    static  String arrayToString(ArrayList<String> sources) {
        String hasil  = "";
        for (String source : sources) {
            hasil += (source + " ");
        }
        return hasil;
    }

    static ArrayList<String> textToArray(String teks) {
        ArrayList<String> kalimat = new ArrayList<>();
        for(int i = 0; i < teks.length(); i++) {
            if(!Character.toString(teks.charAt(i)).toLowerCase().equals(" ")) {
                if(i == 0) {
                    kalimat.add(Character.toString(teks.charAt(i)));
                } else {
                    if(Character.toString(teks.charAt(i - 1)).toLowerCase().equals(" ")) {
                        kalimat.add(Character.toString(teks.charAt(i)));
                    } else {
                        kalimat.set(kalimat.size() - 1, kalimat.get(kalimat.size() - 1) + teks.charAt(i));
                    }
                }
            }
        }
        return kalimat;
    }

    static void sisipkan(String text, String targetTeks, Integer targetIndeks) {
        ArrayList<String> fix = textToArray(text);

        fix.add(targetIndeks, targetTeks);

        System.out.println("CASE: " + text);
        System.out.println(arrayToString(fix));
    }
}
