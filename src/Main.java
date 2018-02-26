import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    int menuInt = 99;
    String menuString = "";
    char menuChar = ' ';

    public static void main(String[] args) {
        System.out.println("Witam w kalkulatorze");
        Main main = new Main();
        main.login();
        main.menuMain();
    }

    public void login() {

        System.out.println("Wprowadź Login");
        String login = "Mariusz";
        String loginInput = scanner.nextLine();
        while (!login.equals(loginInput)) {
            System.out.println("Login nieprawidłowy ! wprowadź ponownie");
            loginInput = scanner.nextLine();
        }
        System.out.println("Wprowadź hasło");
        login = "Akademia";
        loginInput = scanner.nextLine();
        while (!login.equals(loginInput)) {
            System.out.println("hasło nieprawidłowe ! wprowadź ponownie");
            loginInput = scanner.nextLine();
        }
    }

    public void menuMain() {
        while (menuInt != 0) {
            System.out.println("Wprowadź cyfrę z menu aby przejść do obliczania");
            System.out.println("Menu:");
            System.out.println("1 .Dodawanie");
            System.out.println("2 .Odejmowanie");
            System.out.println("3 .Mnożenie");
            System.out.println("4 .Dzielenie");
            System.out.println("5 .Pierwiastek");
            System.out.println("6 .Potęgowanie");
            System.out.println("7 .Zamiana na systemy liczbowe");
            System.out.println("8 .Mediana i średnia");
            System.out.println("9 .Podstawowe dziłania");
            System.out.println("0 .Koniec");

            menuString = scanner.nextLine();
            menuInt = Integer.valueOf(menuString);

            switch (menuInt) {
                case 1:
                    Dodawanie dodawanie = new Dodawanie();
                    dodawanie.dodawanie();
                    break;
                case 2:
                    Odejmowanie odejmowanie = new Odejmowanie();
                    odejmowanie.odejmowanie();
                    break;
                case 3:
                    Mnożenie mnożenie = new Mnożenie();
                    mnożenie.mnożenie();
                    break;
                case 4:
                    Dzielenie dzielenie = new Dzielenie();
                    dzielenie.dzielenie();
                    break;
                case 5:
                    NRoot nRoot = new NRoot();
                    nRoot.załozeniaPierwiastek();
                    break;
                case 6:
                    Potęgowanie potęgowanie = new Potęgowanie();
                    potęgowanie.potęgowanie();
                    break;
                case 7:
                    SystemyLiczboweMenu systemyLiczboweMenu = new SystemyLiczboweMenu();
                    systemyLiczboweMenu.systmyLiczboweMenu();
                    break;
                case 8:
                    MedianaIŚrednia medianaIŚrednia = new MedianaIŚrednia();
                    medianaIŚrednia.medianaIŚrednia();
                    break;
                case 9:
                    PodstawoweDziałania podstawoweDziałania = new PodstawoweDziałania();
                    podstawoweDziałania.podstwwoweDziałania();
                    break;
                case 0:
                    break;
            }
        }
        System.out.println("Koniec programu");
    }

    public void menuMetody() {
        System.out.println("0 .Wyjście do menu");
    }
}


