import java.util.Scanner;

public class Dzielenie {
    Scanner scanner = new Scanner(System.in);
    public void dzielenie(){
        System.out.println("Podaj pierwszy licznik");
        int suma = Integer.valueOf(scanner.nextLine());
        System.out.println("Wpisz liczby które mają zostac podzielone przez siebie oddzelając je spacjami np. 1 2 3 4 5 -6");
        String ciągLiczbDoDodania = scanner.nextLine();

        Dodawanie dodawanie = new Dodawanie();
        double [] liczbyDoSumowania = dodawanie.stringWTabliceInt(ciągLiczbDoDodania);


        for (double i : liczbyDoSumowania) {
            suma /= i;
        }
        System.out.println("Wynik z ilorazu wszystkich liczb to " + suma);
        System.out.println("Chcesz obliczyć iloraz dla innych liczb (tak/nie)");
        String czyPonownie = scanner.nextLine();
        if (czyPonownie.equals("tak")){
            dzielenie();
        }
    }
}