import java.util.Scanner;

public class PodstawoweDziałania {
    Scanner scanner = new Scanner(System.in);
    double liczbaInt, liczbaInt2;
    String liczbaString, liczbaString2 = "";
    String znak = "";

    public void podstwwoweDziałania() {
        System.out.println("Wpisz cyfrę");
        liczbaString = scanner.nextLine();
        liczbaInt = Integer.valueOf(liczbaString);
        obliczenia:
        while (!liczbaString2.equals("Stop")) {
            System.out.println("Wpisz jeden ze znaków + - * /  Jeśli chcesz zakończyć działanie wpisz Stop");
            liczbaString = scanner.nextLine();
            switch (liczbaString) {
                case "+":
                    liczbaInt = dodawanie(liczbaInt);
                    break;
                case "-":
                    liczbaInt = odejmowanie(liczbaInt);
                    break;
                case "*":
                    liczbaInt = mnożenie(liczbaInt);
                    break;
                case "/":
                    liczbaInt = dzielenie(liczbaInt);
                    break;
                case "Stop":
                    liczbaString2 = "Stop";
                    break obliczenia;
            }
            System.out.println("Pierwsza liczba to " + liczbaInt + "  ");
        }
    }

    public double dodawanie(double a) {
        System.out.println("Wpisz drugą cyfrę");
        liczbaString2 = scanner.nextLine();
        liczbaString2 = liczbaString2.replace(',', '.');
        liczbaInt2 = Double.valueOf(liczbaString2);
        return a + liczbaInt2;
    }

    public double odejmowanie(double a) {
        System.out.println("Wpisz drugą cyfrę");
        liczbaString2 = scanner.nextLine();
        liczbaString2 = liczbaString2.replace(',', '.');
        liczbaInt2 = Double.valueOf(liczbaString2);
        return a - liczbaInt2;
    }

    public double mnożenie(double a) {
        System.out.println("Wpisz drugą cyfrę");
        liczbaString2 = scanner.nextLine();
        liczbaString2 = liczbaString2.replace(',', '.');
        liczbaInt2 = Double.valueOf(liczbaString2);
        return a * liczbaInt2;
    }

    public double dzielenie(double a) {
        do {
            System.out.println("Wpisz drugą cyfrę różną od 0");
            liczbaString2 = scanner.nextLine();
            liczbaString2 = liczbaString2.replace(',', '.');
            liczbaInt2 = Double.valueOf(liczbaString2);
        } while (liczbaInt2 == 0);
        return a / liczbaInt2;
    }
}
