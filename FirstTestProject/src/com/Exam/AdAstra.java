package com.Exam;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        /* On the first line of the input, you will be given a text string. You must extract the information about the food and calculate the total calories.
First, you must extract the food info. It will always follow the same pattern rules:
            •	It will be surrounded by "|" or "#" (only one of the two) in the following pattern:
                    #{item name}#{expiration date}#{calories}#   or
                    |{item name}|{expiration date}|{calories}|
            •	The item name will contain only lowercase and uppercase letters and whitespace
            •	The expiration date will always follow the pattern: "{day}/{month}/{year}", where the day, month, and year will be exactly two digits long
            •	The calories will be an integer between 0-10000
Calculate the total calories of all food items and then determine how many days you can last with the food you have. Keep in mind that you need 2000kcal a day.
    Input / Constraints
            •	You will receive a single string
    Output
            •	First, print the number of days you will be able to last with the food you have:
            "You have food to last you for: {days} days!"
            •	The output for each food item should look like this:
            "Item: {item name}, Best before: {expiration date}, Nutrition: {calories}"
*/

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        StringBuilder text = new StringBuilder();
        List<String> allMatches = new ArrayList<>();
        String[] information;
        int calories = 0;
        int days;


        Matcher m = Pattern.compile("((#)(\\w+|\\w+\\s+\\w+)(#)|(\\|)(\\w+|\\w+\\s+\\w+)(\\|))(?<day>\\d{2})\\/(?<month>\\d{2})\\/(?<year>\\d{2})((#)(\\d+)(#)|(\\|)(\\d+)(\\|))")
                .matcher(inputText);
        while (m.find()) {
            allMatches.add(m.group());
        }
        for (String allMatch : allMatches) {
            information = allMatch.split("#|\\|");
            calories += Integer.parseInt(information[3]);
            text.append("Item: " + information[1] + ", Best before: " + information[2] + ", Nutrition: " + information[3] + "\n");
        }
        days = calories / 2000;

        System.out.printf("You have food to last you for: %d days!%n%s", days, text);

    }
}
