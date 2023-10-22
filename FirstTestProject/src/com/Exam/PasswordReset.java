package com.Exam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        /* Write a password reset program that performs a series of commands upon a predefined string. First, you will receive a string, and afterward,
        until the command "Done" is given, you will be receiving strings with commands split by a single space. The commands will be the following:

•	"TakeOdd"
o	 Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.
•	"Cut {index} {length}"
o	Gets the substring with the given length starting from the given index from the password and removes its first occurrence, then prints the password on the console.
o	The given index and the length will always be valid.
•	"Substitute {substring} {substitute}"
o	If the raw password contains the given substring, replace all of its occurrences with the substitute text given and print the result.
o	If it doesn't, print "Nothing to replace!".
Input
•	You will be receiving strings until the "Done" command is given.
Output
•	After the "Done" command is received, print:
o	"Your password is: {password}"
Constraints
•	The indexes from the "Cut {index} {length}" command will always be valid.
*/
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine(); // input - parola
        String command = scanner.nextLine();  // input - komanda
        String[] newPass = new String[]{};

        while (!command.equals("Done")) {   // dokato ne e Done:
            StringBuilder newPassword = new StringBuilder();
            if (command.equals("TakeOdd")) { // samo nechetni indeksi
                for (int i = 0; i < password.length(); i++) {
                    if ((i % 2) != 0) {
                        newPassword.append(password.charAt(i));
                    }
                }
                System.out.println(newPassword.toString());
                password = newPassword.toString();

            } else if (command.contains("Cut")) {
                newPass = command.split("\\s+");
                int index = Integer.parseInt(newPass[1]);
                int length = Integer.parseInt(newPass[2]);
                String replace = "";
                password = password.replaceAll(password.substring(index, index + length), replace);
                System.out.println(password);

            } else if (command.contains("Substitute")) {
                newPass = command.split("\\s+");
                String substring = newPass[1];
                String substitute = newPass[2];
                if (password.contains(substring)){
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            } else {
                System.out.println("!!!!!!!!!!!!! Invalid operation !!!!!!!!!!!!!!!");
            }
            command = scanner.nextLine();       // cheta nova komanda

        }
        System.out.printf("Your password is: %s", password); //printiram rezultata


    }

}
