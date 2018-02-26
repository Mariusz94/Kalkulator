import java.util.Scanner;

public class Potęgowanie {
    public void potęgowanie(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        String numberString = scanner.nextLine();
        Double number = Double.valueOf(numberString);
        System.out.println("Wprowadź do jakiej potęgi");
        numberString=scanner.nextLine();
        int power = Integer.valueOf(numberString);
double result =1;
        for (int i = 0; i <power ; i++) {
            result *=number;
        }
        System.out.println(number + " do potęgi " + power + " daje " + result);
        System.out.println("Czy chcesz obliczyć nową potęgę? tak/nie");
        String zgoda = scanner.nextLine();
        if (zgoda.equals("tak")) {
            potęgowanie();
        }
    }
}
