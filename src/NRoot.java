import java.util.Scanner;

public class NRoot {
    Scanner scanner = new Scanner(System.in);

    public void załozeniaPierwiastek() {
        System.out.println("Podaj liczbę");
        String numberString = scanner.nextLine();
        int number = Integer.valueOf(numberString);

        System.out.println("Podaj stopień pierwiastka");
        String numberRootString = scanner.nextLine();
        int numberRoot = Integer.valueOf(numberRootString);
        if ((number >= 0 && numberRoot >= 0) || (number <= 0 && numberRoot % 2 == 1)) {
            pierwiastek(number, numberRoot);
        } else{
            System.out.println("Liczby nie spełniają założeń pierwiastkowania");
        System.out.println("Chcesz ponownie wprowadzić liczby (tak/nie)");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            załozeniaPierwiastek();
        }
    }
        System.out.println("Czy chcesz obliczyć nowy pierwiastek? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            załozeniaPierwiastek();
        }
    }

    public double pierwiastek(int number, int power) {
        //metoda Newtona
        //power number of nuber  sqrt
        //number power
        double x = number;
        double błądPrzybliżenia = 1;
        double błądPrzybliżenia2 = 0;
        int counter = 0;
        while (błądPrzybliżenia - błądPrzybliżenia2 > 0.000000000000001) {
            //błąd przybliżenia
            błądPrzybliżenia = Math.abs(number - Math.pow(x, power));
            //System.out.println("błąd przybliżenia " + błądPrzybliżenia);

            //Kolejne przybliżenie
            x = (((power - 1) * x) + number / Math.pow(x, power - 1)) * 1 / power;
            //System.out.println("Kolejne przybliżenie " + x);

            //błąd przybliżenia
            błądPrzybliżenia2 = Math.abs(number - Math.pow(x, power));
            //System.out.println("błąd przybliżenia " + błądPrzybliżenia2);

            //Kolejne przybliżenie
            x = (((power - 1) * x) + number / Math.pow(x, power - 1)) * 1 / power;
            //System.out.println("Kolejne przybliżenie " + x);

            counter++;
        }
        System.out.println(x);
        return x;
    }
}
