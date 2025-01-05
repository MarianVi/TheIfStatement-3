import java.util.Scanner;

public class Main {
    private static final int CORRECT_PIN = 9876;
    private static final int CURRENT_BALANCE = 700;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TO DO:

        int pinAdaugat = scanner.nextInt();
        if (pinAdaugat > 9999) {
            System.out.println("PIN-ul trebuie sa aiba 4 caractere! " + pinAdaugat + " nu are 4 caractere");
        } else if (pinAdaugat < 1000) {
            System.out.println("PIN-ul trebuie sa aiba 4 caractere! " + pinAdaugat + " nu are 4 caractere");
        }
        if (pinAdaugat != CORRECT_PIN) {
            System.out.println("PIN gresit");
        } else {
            System.out.println("PIN corect");
            int sumaRetrasa = scanner.nextInt();
            if (sumaRetrasa == 0) {
                System.out.println("Valoare incorecta");
            } else if (sumaRetrasa % 10 == 0) {
                if (sumaRetrasa > CURRENT_BALANCE) {
                    System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
                } else {
                    System.out.println("Tranzactie in curs de procesare");
                    System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA).");
                    int optiune = scanner.nextInt();
                    if (optiune != 0 && optiune != 1) {
                        System.out.println("Alegere invalida");
                    } else if (optiune == 1) {
                        System.out.println(CURRENT_BALANCE - sumaRetrasa);
                    } else {
                        System.out.println("Multumim pentru ca ati ales Banca DevBank");
                    }
                }
            } else {
                System.out.println("Suma retrasa trebuie sa fie multiplu de 10");
            }
        }

    }
}