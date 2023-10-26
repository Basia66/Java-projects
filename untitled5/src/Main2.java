import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int P = 4; //liczba pracownikow
        int Z = 6;
        int [] sprawdzenieLiczbyZadanPracownik = new int[P];
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i<Z; i++){
            y.add(Math.abs(random.nextInt())%P);
        }
        for(int i = 0; i<Z; i++){ //Zlozonosc Z
            sprawdzenieLiczbyZadanPracownik[y.get(i)]++;
        }
        for(int i = 0; i<P; i++){
            System.out.println("Pracownik " + i + " ma " + sprawdzenieLiczbyZadanPracownik[i] + " zadan");
        }
        int maxPracownik = -1;
        int maxIloscZadan = -1;
        for(int i = 0; i<P; i++){ //Zlozonosc P
            if(maxIloscZadan < sprawdzenieLiczbyZadanPracownik[i]){
                maxIloscZadan = sprawdzenieLiczbyZadanPracownik[i];
                maxPracownik = i;
            }
        }
        System.out.println("Najwiecej zadan ma pracownik o numerze " + maxPracownik + " i ma " + maxIloscZadan + " zadania");
    }
}
