import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public void scannerClose() {
        scanner.close();
    }

    public Integer[] readArguments(String variableName, int stWielomianu) {
        Integer[] tableArguments = new Integer[stWielomianu + 1];
        for (int i = 0; i <= stWielomianu ; i++) {
           tableArguments[i] = readNextInt(variableName);
        }
        return tableArguments;
    }
    public int readNextInt(String variableName) {
        int nextInt;
        try {
            System.out.println("Podaj wartość " + variableName);
            nextInt = scanner.nextInt();
        } catch (InputMismatchException e) {
            String next = scanner.next();
            System.out.println("To nie jest liczba całkowita: "+ next + ". Podaj wartość liczbową!");
            return readNextInt(variableName);
        }
        return nextInt;
    }
    public int readNextIntPositive(String variableName) {
        int nextInt;
        try {
            System.out.println("Podaj wartość " + variableName);
            nextInt = scanner.nextInt();
            if (nextInt <= 0) {
                System.out.println("To nie jest całkowita liczba dodatnia: " + nextInt + ". Podaj całkowitą dodatnią wartość liczbową!");
                return readNextIntPositive(variableName);
            }
        } catch (InputMismatchException e) {
            String next = scanner.next();
            System.out.println("To nie jest liczba całkowita: " + next + ". Podaj wartość liczbową!");
            return readNextIntPositive(variableName);
        }
        return nextInt;
    }
} 