import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondtNumber  = new Scanner(System.in).nextInt();
        System.out.println("Сумма: " + (firstNumber + secondtNumber ));
        System.out.println("Разность: " + (firstNumber - secondtNumber ));
        System.out.println("Произведение: " + (firstNumber * secondtNumber ));
        System.out.println("Частное: " + ((double) firstNumber / secondtNumber ));
    }
}
