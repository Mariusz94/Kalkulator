import java.util.Scanner;

public class SystemOsemkowy {
    public void systemÓsemkowy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        String numberString = scanner.nextLine();
        int number = Integer.valueOf(numberString);

        StringBuilder liczba = new StringBuilder("");
        while (number != 0) {

            int reszta = number % 8;
            number = (number-reszta)/8;
            liczba.append(Integer.toString(reszta));

        }
        liczba.reverse();
        System.out.println(liczba);
        System.out.println("Czy chcesz obliczyć system ósemkowy dla innej liczby? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            systemÓsemkowy();
        }
    }
}
