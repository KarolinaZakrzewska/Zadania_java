import java.io.*;
/*
1.	Nieparzyste liczby dodatnie – napisz program, który pobiera od użytkownika liczbę naturalną większą lub równą 1,
a następnie wyświetla wszystkie liczby nieparzyste nie większe od podanej liczby, np. jeśli użytkownik poda 10,
to program powinien wypisać „1 3 5 7 9” (może być każde w osobnej linii)
*/
public class TaskOne {
    public static void main(String[] args) {
        float number;
        System.out.println("Podaj liczbę większą lub równą 1:");
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String x = br.readLine();
            number = Integer.valueOf(x);
            float number1 = number;
            int convertedNumber = (int) number1;

            if (number > 1) {
                System.out.println("Liczba " + convertedNumber + " jest większa lub równa 1.");
                System.out.println("Oto liczby nieparzyste i mniejsze od podanej przez ciebie:");

                for (int i = convertedNumber - 1; i >= 1; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }

            } else if (number == 1) {
                System.out.println("Twoja liczba to " + convertedNumber + ". Liczby nieparzyste i mniejsze od 1 nie istnieją.");

            } else if (number < 1) {
                System.out.println("Liczba " + convertedNumber + " nie jest większa lub równa 1.");
            }

        } catch (IOException e) {
            System.out.println("Błąd odczytu danych wejściowych.");
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest liczbą całkowitą.");
        }
    }
}