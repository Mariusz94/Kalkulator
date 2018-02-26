import java.util.Scanner;

public class Dodawanie {
    Scanner scanner = new Scanner(System.in);

    public void dodawanie() {
        System.out.println("Wpisz liczby które mają zostać zsumowane oddzelając je spacjami np. 1 2 3 4 5 -6");
        String ciągLiczbDoDodania = scanner.nextLine();

        Dodawanie dodawanie = new Dodawanie();
        double [] liczbyDoSumowania = dodawanie.stringWTabliceInt(ciągLiczbDoDodania);
        int suma = 0;

        for (double i : liczbyDoSumowania) {
            suma += i;
        }
        System.out.println("Suma to " + suma);
        System.out.println("Chcesz obliczyć sumę dla innych liczb (tak/nie)");
        String czyPonownie = scanner.nextLine();
        if (czyPonownie.equals("tak")){
            dodawanie.dodawanie();
        }
    }


    public double[] stringWTabliceInt(String text) {

        String[] stringNaTablice = text.split(" ");
        double[] stringNaTabliceNumber = new double[stringNaTablice.length];

        for (int i = 0; i < stringNaTablice.length; i++) {
            stringNaTabliceNumber[i] = Integer.valueOf(stringNaTablice[i]);
        }
        return stringNaTabliceNumber;
    }

}

