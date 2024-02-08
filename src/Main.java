import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();

        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А:");
        for (String s : listA) {
            System.out.println(s);
        }

        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список Б:");
        for (String s : listB) {
            System.out.println(s);
        }

        List<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список С:");
        for (String s : listC) {
            System.out.println(s);
        }

        Collections.sort(listC, (s1, s2) -> s1.length() - s2.length());

        System.out.println("Отсортированный список С:");
        for (String s : listC) {
            System.out.println(s);
        }
    }
}

