import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String carsNumber;
        final int NUM = 34;
        String word = "двигатель";
                carsNumber = NUM + word;

        System.out.println(NUM);
        System.out.println(carsNumber);
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицвтельное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");

        String name = scanner.nextLine();
        System.out.println("привет " + name + "!");

    }
}