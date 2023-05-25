import java.util.Scanner;

/*
3. Palindrom – Użytkownik podaje słowo – sprawdź, czy jest ono palindromem, czyli czy od końca brzmi tak samo,
jak od początku (np. „abba” to od tyłu też „abba”, więc jest palindromem).
*/

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy to palindrom? Podaj słowo:");
        String inputWord = scanner.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < inputWord.length() / 2; i++) {
            char sign = inputWord.charAt(i);
            char oppositeSign = inputWord.charAt(inputWord.length() - 1 - i);
            if (sign != oppositeSign) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Słowo \"" + inputWord + "\" jest palindromem.");
        } else {
            System.out.println("Słowo \"" + inputWord + "\" nie jest palindromem.");
        }
    }
}