package com.Exam;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    /* On the first line of the standard input, you will receive an integer n – the number of heroes that you can choose for your party. On the next n lines, the heroes themselves
    will follow with their hit points and mana points separated by a single space in the following format:
"{hero name} {HP} {MP}"
-	HP stands for hit points and MP for mana points
-	a hero can have a maximum of 100 HP and 200 MP
After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by " – ",
until the "End" command is given.
There are several actions that the heroes can perform:
"CastSpell – {hero name} – {MP needed} – {spell name}"
•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
•	If the hero is unable to cast the spell print:
o	"{hero name} does not have enough MP to cast {spell name}!"
"TakeDamage – {hero name} – {damage} – {attacker}"
•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
•	If the hero has died, remove him from your party and print:
o	"{hero name} has been killed by {attacker}!"
"Recharge – {hero name} – {amount}"
•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} recharged for {amount recovered} MP!"
"Heal – {hero name} – {amount}"
•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} healed for {amount recovered} HP!"
Input
•	On the first line of the standard input, you will receive an integer n
•	On the following n lines, the heroes themselves will follow with their hit points and mana points separated by a space in the following format
•	You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given
Output
•	Print all members of your party who are still alive, in the following format (their HP/MP need to be indented 2 spaces):
"{hero name}
  HP: {current HP}
  MP: {current MP}"
Constraints
•	The starting HP/MP of the heroes will be valid, 32-bit integers will never be negative or exceed the respective limits.
•	The HP/MP amounts in the commands will never be negative.
•	The hero names in the commands will always be valid members of your party. No need to check that explicitly.

*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        String heroesInput;
        Map<String, Hero> heroes = new HashMap<>();

        for (int i = 0; i < numberOfHeroes; i++) {
            heroesInput = scanner.nextLine();
            String[] data = heroesInput.split("\\s");
            Hero hero = new Hero(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            heroes.put(data[0], hero);
        }

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("End")) {

            String[] data = commandInput.split("\\s-\\s");
            String heroName = data[1];
            int amountOrDamage = Integer.parseInt(data[2]);
            String spellNameOrAttacker = "";
            if (data.length > 3){
                spellNameOrAttacker = data[3];
            }

            int result;
            Hero hero = heroes.get(heroName);

            switch (data[0]) {
                case "CastSpell":
                    result = hero.castSpell(amountOrDamage);
                    if (result >= 0) {
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellNameOrAttacker, result);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellNameOrAttacker);
                    }
                    break;
                case "TakeDamage":
                    /* "TakeDamage – {hero name} – {damage} – {attacker}"
•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
•	If the hero has died, remove him from your party and print:
o	"{hero name} has been killed by {attacker}!"*/
                    result = hero.takingDamage(amountOrDamage);
                    if (result > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, amountOrDamage, spellNameOrAttacker, result);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, spellNameOrAttacker);
                    }
                    break;
                case "Recharge":
                    /* "Recharge – {hero name} – {amount}"
•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} recharged for {amount recovered} MP!"*/
                    int recharging = hero.rechargingMP(amountOrDamage);
//                    heroMana = heroes.get(heroName).getManaPoints();
//                    mp = heroMana + amount;

//                    if (mp <= 200) {
//                        heroes.get(heroName).setManaPoints(mp);
//                        recAmount = amount;
//                    } else {
//                        heroes.get(heroName).setManaPoints(200);
//                        recAmount = 200 - heroMana;
//                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, recharging);
                    break;
                case "Heal":
                    /*"Heal – {hero name} – {amount}"
•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} healed for {amount recovered} HP!"*/
                    int healing = hero.healing(amountOrDamage);
                    System.out.printf("%s healed for %d HP!%n", heroName, healing);
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }

            commandInput = scanner.nextLine();
        }

        for (Map.Entry<String, Hero> entry : heroes.entrySet()) {
            if ((entry.getValue().getHitPoints() > 0) && (entry.getValue().getManaPoints() > 0)) {
                System.out.printf("%s%n HP: %d%n MP: %d%n", entry.getKey(), entry.getValue().getHitPoints(), entry.getValue().getManaPoints());
            }
        }
    }
}
