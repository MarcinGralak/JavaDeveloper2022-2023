import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer option = chooseOption();

        switch (option) {
            case 1: calculateAvarage(); break;
            case 2: calculateProduct(); break;
            case 3: calculateCircle(); break;
            //case 4: calculateSquare(); break;
            default:
                System.out.println("Nie ma takiej opcji w programie");
        }
    }


    private static void calculateCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien kola");
        Double circle = scanner.nextDouble();

        if (circle <=0){
            System.out.println("Blednie podana wartosc");
        }else
            System.out.println("Pole kola wynosi: " + (2 * 3.14 * circle));
    }


    private static void calculateProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolejne liczby rzeczywiste do mnozenia");
        System.out.println("Podanie zera konczy obliczenia");

        Double number = scanner.nextDouble();
        Double product = 1.0;

        while (number != 0) {
            product *= number; // product = product * number
            number = scanner.nextDouble();
        }
        System.out.println("Wynik iloczynu: " + product);
    }

    private static Integer chooseOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chesz zrobic?");
        System.out.println("1 - liczenie sredniej?");
        System.out.println("2 - liczenie iloczynu");
        System.out.println("3 - liczenie obwodu kola");
        System.out.println("4 - liczenie pola kwadratu");
        return scanner.nextInt();

    }

    private static void calculateAvarage(){
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;

        System.out.println("Ile liczb chcesz wprowadzic");
        Integer number = scanner.nextInt();

        if (number <=0) {
            System.out.println("Blednie podana ilosc liczb");
        } else {
            System.out.println("Podaj " + number + " liczby calkowite");

            for (int i = 0; i < number; i++) {
                sum = sum + scanner.nextInt();
            }

            System.out.println("Srednia wynosi: " + (sum / number));
        }
    }
}
