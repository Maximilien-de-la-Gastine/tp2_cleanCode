package Q2;

import q2.LastNameLengthCalculator;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Main {
    /*
En Java, une lambda expression est une manière concise de définir une fonction anonyme qui peut être utilisée à la place
d'une classe anonyme. Elle est utilisée pour définir des instances de types fonctionnels, qui sont des types d'interface
ayant une seule méthode abstraite, appelées "interfaces fonctionnelles". Les lambdas permettent de passer des fonctions
comme arguments, de retourner des fonctions en tant que résultats, ou d'assigner des fonctions à des variables.

Une "functional interface" est une interface Java qui possède une seule méthode abstraite (ou non-définie), et qui est
conçue pour être implémentée par une classe qui fournira une implémentation pour cette méthode. Les interfaces fonctionnelles
permettent d'exprimer des comportements fonctionnels de manière concise, en utilisant des lambdas, des références de méthodes ou des classes anonymes.

Les lambdas sont souvent utilisées avec des interfaces fonctionnelles pour simplifier la syntaxe du code et rendre le code
plus lisible et plus maintenable. L'utilisation de ces deux concepts permet de faciliter la programmation orientée
fonctionnelle en Java, qui consiste à utiliser des fonctions plutôt que des objets pour effectuer des opérations.
    */
    public static void main(String[] args) {
        String lastName = "Maximilien Absolut";
        Q2.LengthCalculator lastNameLengthCalculator = new LastNameLengthCalculator();
        int lastNameLength = lastNameLengthCalculator.calculate(lastName);
        System.out.println("Last name length: " + lastNameLength);

        Q2.LengthCalculator firstNameLengthCalculator = input -> input.split(" ")[0].length();
        int firstNameLength = firstNameLengthCalculator.calculate(lastName);
        System.out.println("First name length: " + firstNameLength);

        Q2.LengthCalculator cityLengthCalculator = (String input) -> input.length();
        int cityLength1 = cityLengthCalculator.calculate("Suresnes");
        System.out.println("City length (1ere syntaxe): " + cityLength1);

        Q2.LengthCalculator cityLengthCalculator2 = input -> {
            return input.length();
        };
        int cityLength2 = cityLengthCalculator2.calculate("La Grenne Colombes");
        System.out.println("City length (2eme syntaxe): " + cityLength2);

        Q2.LengthCalculator cityLengthCalculator3 = (String input) -> {
            return input.length();
        };
        int cityLength3 = cityLengthCalculator3.calculate("Courbevoie");
        System.out.println("City length (3eme syntaxe): " + cityLength3);
    }
}