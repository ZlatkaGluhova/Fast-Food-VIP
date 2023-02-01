package objectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    static class Clients {
        String name;
        int age;
        int cents;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Clients> clients = new ArrayList<>();

        String input = scanner.next();
        while (!input.equals("end")) {
            String name = input;
            int age = scanner.nextInt();
            int cents = scanner.nextInt();

            Clients client = new Clients();
            client.name = name;
            client.age = age;
            client.cents = cents;


            clients.add(client);

            input = scanner.next();
        }

        int minAge = scanner.nextInt();

        for (Clients client : clients) {
            if (client.age >= minAge) {
                client.cents -= 500;
                System.out.printf("%s %d %d%n", client.name, client.age, client.cents);
            }

        }
    }
}

