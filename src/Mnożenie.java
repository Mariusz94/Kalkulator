import java.util.Scanner;

public class Mnożenie {
    Scanner scanner = new Scanner(System.in);
    public void mnożenie(){
        System.out.println("Wpisz liczby które chcesz ze sobą pomnożyć oddzielając je spacjami np. 1 2 3 4 5 -6");
        String ciągLiczbDoDodania = scanner.nextLine();

        Dodawanie dodawanie = new Dodawanie();
        double [] liczbyDoSumowania = dodawanie.stringWTabliceInt(ciągLiczbDoDodania);
        int suma = 1;

        for (double i : liczbyDoSumowania) {
            suma *= i;
        }
        System.out.println("Iloczyn wszystkich liczb to " + suma);
        System.out.println("Chcesz obliczyć iloczyn dla innych liczb (tak/nie)");
        String czyPonownie = scanner.nextLine();
        if (czyPonownie.equals("tak")){
            mnożenie();
        }
    }
}
