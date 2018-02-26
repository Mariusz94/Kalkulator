import java.util.Scanner;

public class SystemyLiczboweMenu {
    Scanner scanner = new Scanner(System.in);
    int menuInt = 99;
    String menuString = "";
    public void systmyLiczboweMenu(){
        while (menuInt != 0) {
            System.out.println("Wprowadź cyfrę z menu aby przejść do obliczania");
            System.out.println("Menu:");
            System.out.println("1 .dwójkowy");
            System.out.println("2 .ósemowy");
            System.out.println("3 .szesnastkowy");
            System.out.println("0 .Koniec");

            menuString = scanner.nextLine();
            menuInt = Integer.valueOf(menuString);

            switch (menuInt) {
                case 1:
                    SystemBnarny systemBnarny = new SystemBnarny();
                    systemBnarny.systemBinarny();
                    break;
                case 2:
                    SystemOsemkowy systemOsemkowy = new SystemOsemkowy();
                    systemOsemkowy.systemÓsemkowy();
                    break;
                case 3:
                    SystemSzesnastkowy systemSzesnastkowy = new SystemSzesnastkowy();
                    systemSzesnastkowy.systemSzesnastowy();
                    break;
                case 0:
                    break;
            }
        }
    }
}
