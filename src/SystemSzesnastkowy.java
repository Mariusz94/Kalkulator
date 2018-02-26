import java.util.Scanner;

public class SystemSzesnastkowy {
    public void systemSzesnastowy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczbę");
        String numberString = scanner.nextLine();
        int number = Integer.valueOf(numberString);

        StringBuilder liczba = new StringBuilder("");
        while (number != 0) {
            int reszta = number % 16;

            switch (reszta) {
                case 10:
                    liczba.append('A');
                    break;
                case 11:
                    liczba.append('B');
                    break;
                case 12:
                    liczba.append('C');
                    break;
                case 13:
                    liczba.append('D');
                    break;
                case 14:
                    liczba.append('E');
                    break;
                case 15:
                    liczba.append('F');
                    break;
                default:
                    liczba.append(Integer.toString(reszta));
            }
            number = (number - reszta) / 16;
        }
        liczba.reverse();
        System.out.println(liczba);
        System.out.println("Czy chcesz obliczyć system ósemkowy dla innej liczby? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            systemSzesnastowy();
        }
    }
}
