import java.util.Scanner;

public class SystemBnarny {
    public void systemBinarny() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        String numberString = scanner.nextLine();
        int number = Integer.valueOf(numberString);

        StringBuilder liczba = new StringBuilder("");
        while (number != 0) {
            if (number % 2 == 0) {
                liczba.append('0');
                number /= 2;
            } else {
                liczba.append('1');
                number /= 2;
            }
        }
        liczba.reverse();
        System.out.println(liczba);
        System.out.println("Czy chcesz obliczyć system binarny dla innej liczby? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            systemBinarny();
        }
    }
}
