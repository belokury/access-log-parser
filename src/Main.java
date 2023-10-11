import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res = 0;
        System.out.println("Введите текст и нажмите <Enter>: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: " + text.length());
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (isDirectory) {
                System.out.println("Данный путь является путем к папке");
                continue;
            } else if (fileExists) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл № " + ++res);
                continue;
            }
            System.out.println("Данный путь не существует");
        }
    }
}
