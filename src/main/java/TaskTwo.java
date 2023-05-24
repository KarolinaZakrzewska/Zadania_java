/*
2.	FizzBuzz – Wypisz liczby od 1 do 100, jeżeli liczba jest podzielna przez 3 to wypisz Fizz,
jeżeli podzielna przez 5 to Buzz, jeżeli podzielna przez 3 i 5 to wypisz FizzBuzz. W przeciwnym wypadku wypisz liczbę.
*/

public class TaskTwo {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
