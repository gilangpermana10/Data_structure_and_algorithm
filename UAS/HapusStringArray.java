import java.util.ArrayList;

public class HapusStringArray {

    static  String arrayToString(ArrayList<String> sources) {
        String hasil  = "";

        for (String source : sources) {
            hasil += (source + " ");
        }

        return hasil;
    }

    static ArrayList<String> teksToArray(String teks) {
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

    static void removeteks(String teks, String teksToBeRemoved, Integer posisi) {
        ArrayList<String> fixkalimat = teksToArray(teks);
        ArrayList<String> deletedkalimat = new ArrayList<>();

        for(int i = 0; i < fixkalimat.size(); i++) {
            if(!((i + 1) == posisi && fixkalimat.get(i).toLowerCase().equals(teksToBeRemoved))) {
                deletedkalimat.add(fixkalimat.get(i));
            }
        }

        if(fixkalimat.size() == deletedkalimat.size()) {
            System.out.println("Penghapusan kata gagal dilakukan, karena indeks ke "+ posisi +" bukan "+ teksToBeRemoved +".");
        }
        System.out.println(arrayToString(deletedkalimat));
    }

    public static void main(String args[]) {
        removeteks("Saya sedang belajar struktur data", "sedang", 2);
        removeteks("Saya sedang belajar struktur data", "struktur", 3);
        removeteks("Pemrograman itu sangat mudah", "itu", 2);
    }
}
