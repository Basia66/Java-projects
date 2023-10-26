import java.util.ArrayList;

public class Main {
    public static int f(int n) {
        int i, j, c = 0;
        for (i = 1; i < Math.floor(Math.sqrt(n)); i++) {
            for (j = 1; j < Math.pow(n, 2); j += j) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int P = 16; //liczba pracownikow
        int Z = P;//liczba zadan
        ArrayList<Pracownik> listaPracownikow = new ArrayList<>();
        for (int i = 1; i < P; i++) {
            listaPracownikow.add(new Pracownik(i, i));
        }
        listaPracownikow.add(new Pracownik(P, 5));

        for (int i = 1; i <= Z; i++) {
            boolean czyZadanieZajete = false;

            int numerPoprzedniegoPracownika = 0;

            for (int j = 1; j <= P; j++) {
                if (listaPracownikow.get(j - 1).numerZadania == i) {
                    if (czyZadanieZajete) {
                        System.out.println("Pracownik: " + j + " ma przypisane zadanie. Zadanie przypisane wczesniej do pracownika: " + numerPoprzedniegoPracownika);
                        return;
                    } else {
                        System.out.println("Zadanie " + i + " jest już zajete");
                        numerPoprzedniegoPracownika = j;
                        czyZadanieZajete = true;
                    }
                }
            }
        }

    }
}
