package objectAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
//        String[] words = {"aaa", "nnnn", "adsasd", "wwwwwww"};
        Random random = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = random.nextInt(words.length);
            words[pos1] = words[pos1] + words[pos2];
            words[pos2] = words[pos1].replace(words[pos2], "");
            words[pos1] = words[pos1].replaceFirst(words[pos2], "");


        }


        System.out.println(String.join(System.lineSeparator(), words));
//
//        int x = 5;
//        int y = 10;
//
//        System.out.printf("x = %d, y = %d%n", x, y);
//
//        x = x + y;
//        y = x - y;
//        x = x - y;
//
//        System.out.printf("x = %d, y = %d%n", x, y);
//
//        String vs = "VasilSokolov";
//        vs.contains("Sokolov");
//
//        String first = "Vasil";
//        String second = "Sokolov";
//
//        System.out.printf("%s %s%n", first, second);
//
//        first = first + second; // VasilSokolov
//        second = first.split(second)[0]; // Vasil
//        first = first.replaceFirst(second, ""); // Sokolov
//
//        System.out.printf("%s %s%n", first, second);

/*        x = 5;
          y = 10;


       x = 5 + 10 = 510
       y = 10 + 510 - изваждаме 10
       x = 510 - 5


*/

    }
}
