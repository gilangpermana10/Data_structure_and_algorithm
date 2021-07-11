import java.util.ArrayList;

public class HitungKata {
    static String hurufVokal[] = {"a", "i", "u", "e", "o"};

    static ArrayList<String> textToArray(String teks) {
        ArrayList<String> kalimat = new ArrayList<>();
        for(int i = 0; i < teks.length(); i++) {
            if(!Character.toString(teks.charAt(i)).equals(" ")) {
                if(i == 0) {
                    kalimat.add(Character.toString(teks.charAt(i)));
                } else {
                    if(Character.toString(teks.charAt(i - 1)).equals(" ")) {
                        kalimat.add(Character.toString(teks.charAt(i)));
                    } else {
                        kalimat.set(kalimat.size() - 1, kalimat.get(kalimat.size() - 1) + teks.charAt(i));
                    }
                }
            }
        }
        return kalimat;
    }

    static boolean punyaVokal(String teks) {

        for(String vokal : hurufVokal) {
            if(teks.toLowerCase().equals(vokal)) {
                return  true;
            }
        }
        return  false;
    }

    static ArrayList<String> vokalYangSama(ArrayList<String> data) {
        ArrayList<String> hasil = new ArrayList<>();
        for(String teks : data) {
            ArrayList<String> vokalTerdaftar = new ArrayList<>();

            boolean punyaDup = false;

            for(int i = 0 ; i < teks.length(); i++) {
                String teksDariIndeks = Character.toString(teks.charAt(i));

                for(String voc: vokalTerdaftar) {
                    if(voc.toLowerCase().equals(teksDariIndeks.toLowerCase())) {
                        punyaDup  = true;
                    }
                }

                if(punyaVokal(teksDariIndeks)) {
                 vokalTerdaftar.add(teksDariIndeks);
                }
            }

            if(!punyaDup) {
                hasil.add(teks);
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        // Case 1
        ArrayList<String> case1 = vokalYangSama(textToArray("Universitas Nusa Putra Sukabumi"));
        System.out.println("Jumlah kata : " + case1.size());

        // Case 2
        ArrayList<String> case2 = vokalYangSama(textToArray("Pemrograman"));
        System.out.println("Jumlah kata : " + case2.size());

        // Case 3
        ArrayList<String> case3 = vokalYangSama(textToArray("Belajar pemrograman Struktur Data berbasis JAVA"));
        System.out.println("Jumlah kata : " + case3.size());
    }
}
