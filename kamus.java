import java.util.Scanner;

public class Kamus {
    public String[] languageInput;
    public String[] languageLib;
  
    Kamus(String[][] languages) {
      this.languageInput = languages[0];
      this.languageLib = languages[1];
    }
  
    public static void main(String[] args) {
  
      String[] english = {
        "ant", "big", "captain", "dark",
        "eat", "finger", "go", "hole"
      };
  
      String[] indonesia = {
        "semut", "besar", "kapten", "gelap",
        "makan", "jari", "pergi", "lubang"
      };
  
      String[][] ENG_TO_IND = { english, indonesia };
      String[][] IND_TO_ENG = { indonesia, english };
  
      System.out.println("\n===========================================");
      System.out.println("=======Selamat datang di Program Kamus=======");
      System.out.println("===========================================\n");
      System.out.println("bahasa mana yang anda ingin terjemahkan ?");
      System.out.println("1. Inggris ke indosia");
      System.out.println("2. Indonesia Ke inggris\n");
      System.out.println("===========================================");
      System.out.println("Masukan nomor : ");
      
      //pemilihan parameter
      Scanner masuk = new Scanner(System.in);
      Scanner in = new Scanner(System.in);
      int pilih = masuk.nextInt();
      String[][] bahasa = {};

      if(pilih == 1){
          for(int i = 0; i< english.length; i++){
              System.out.println((i+1) + ". " + english[i]);
          }
          System.out.println("\nKata apa yang anda ingin terjemahkan ke Indonesia ?");
          bahasa = ENG_TO_IND;

        }else if(pilih == 2){
          for(int i = 0; i< indonesia.length; i++){
              System.out.println((i+1) + ". " + indonesia[i]);
          }
          System.out.println("Kata apa yang anda ingin terjemahkan ke inggris ? ");
          
          bahasa = IND_TO_ENG;
        }else{
            System.out.println("Masukan anda salah");
            return;
        }
        Kamus kamus = new Kamus(bahasa);
        String terjemah = in.next();

      

      kamus.translate(terjemah);
  
  
    }
  
    public void translate(String word) {
      try {
        int baseWordIndex = findIndexOfWord(word);
        String translatedWord = findTranslation(baseWordIndex);
  
        if ( word == "") {
          throw new WordException("Parameter Kosong");
        }
        
        if ( baseWordIndex == -1) {
          throw new WordException(word + " Tidak ditemukan di kamus");
        }
  
        if ( translatedWord == "" ) {
          throw new WordException(word + " Tidak bisa diterjemahkan");
        }
  
        System.out.println(word + " artinya " + translatedWord);
  
      } catch(WordException exception) {
        System.out.println(exception.getMessage());
      }
  
    }
  
    public int findIndexOfWord(String word) {
      int hasil = -1;
      for (int i = 0; i < languageInput.length; i++) {
        if (languageInput[i].contains(word.toLowerCase())) {
          hasil = i;
          return hasil;
        }
      }
  
      return hasil;
  
    }
  
    public String findTranslation(int indexOfWord) {
      int awal = 0;
      int akhir = languageLib.length;
      String ditemukan = "";
  
      try {
        while (awal <= akhir) {
          int tengah = (awal + akhir) / 2;
          int pointer = tengah;
  
          if ( indexOfWord > pointer ) {
            awal = tengah + 1;
          }
  
          if ( indexOfWord < pointer ) {
            akhir = tengah - 1;
          }
  
          if ( indexOfWord == pointer ) {
            return languageLib[pointer];
          }
  
        }
        return ditemukan;
      } 
  
      catch (ArrayIndexOutOfBoundsException exception) {
        return ditemukan;
      }
  
    }
  
  }
  
  
  class WordException extends Throwable {
  
    private String message;
  
    public WordException(String message) {
      this.message = message;
    }
  
    public String getMessage() {
      return message;
    }
  
  }