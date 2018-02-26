import java.util.Arrays;
import java.util.Scanner;

public class MedianaIŚrednia {
    Scanner scanner = new Scanner(System.in);

    public void medianaIŚrednia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczby oddzielając spacjami np 1 2 3 4 5");
        String numberString = scanner.nextLine();
        Dodawanie dodawanie = new Dodawanie();
        double[] numbers = dodawanie.stringWTabliceInt(numberString);
        Arrays.sort(numbers);
        MedianaIŚrednia medianaIŚrednia = new MedianaIŚrednia();


        System.out.println("Srednia artymetyczna z podanych liczb to :" + medianaIŚrednia.średniaArtymetrycznej(numbers));
        if (numbers.length % 2 == 1) {
            System.out.println("Mediana z podanych liczb to " + numbers[numbers.length/2] );
        } else {
            System.out.println("Mediana z podanych liczb to " + medianaIŚrednia.mediana(numbers));
        }

        System.out.println("Czy chcesz obliczyć nową średnią artymetyczną i medianę? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            medianaIŚrednia();
        }

    }

    public double średniaArtymetrycznej(double[] a) {
        double result = 0;
        for (double v : a) {
            result +=v;
        }

        result /= a.length;
        return result;
    }

    public double mediana(double[] a) {

        double result = (a[a.length / 2] + a[(a.length / 2) - 1])/2;
        return result;
    }
}
