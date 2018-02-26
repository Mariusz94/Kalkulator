import java.util.Scanner;

public class Odejmowanie {
    Scanner scanner = new Scanner(System.in);
    public void odejmowanie(){
        System.out.println("Wpisz liczby z których ma być obliczona różnica oddzelając je spacjami np. 1 2 3 4 5 -6");
        String ciągLiczbDoDodania = scanner.nextLine();

        Dodawanie dodawanie = new Dodawanie();
        double [] liczbyDoSumowania = dodawanie.stringWTabliceInt(ciągLiczbDoDodania);
        int suma = 0;

        for (double i : liczbyDoSumowania) {
            suma -= i;
        }
        System.out.println("Wynik z odejmowania wszystkich liczb to " + suma);
        System.out.println("Chcesz obliczyć różnice dla innych liczb (tak/nie)");
        String czyPonownie = scanner.nextLine();
        if (czyPonownie.equals("tak")){
            odejmowanie();
        }
    }
}
