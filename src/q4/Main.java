package q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        /*
        Une supplier est une interface fonctionnelle qui, à pour but de vendre/de fournir quelque chose.
        C'est pour cela que le supplier ne prend rien en paramètre et renvoie une valeur.
        Une predicate est une interface fonctionnelle qui à pour but d'affirmer (ou de contredire) ce qui est passé
        en paramètre. Il renvoie un booléen.
        Une consumer est une interface fonctionnelle qui ne renvoie rien et prend un ou plusieurs paramètres en entré.
        (contrairement au supplier)
        Une Function est le regrouppement du supplier et du consumer, elle a besoin d'un ou plusieurs paramètres et renvoie
        une valeur.
        Ces interfaces fonctionnelles ont un lien étroit avec la programmation fonctionnelle, car elles facilitent la composition
        de fonctions et la séparation des préoccupations. Elles permettent de créer des fonctions plus modulaires et plus réutilisables,
        en encourageant une approche plus déclarative de la programmation. Les interfaces fonctionnelles de Java permettent également l'utilisation
        de lambdas, qui sont des expressions plus courtes et plus concises pour les fonctions anonymes, ce qui simplifie l'écriture de code.
         */


        StartWithGreg startWithGreg = name -> name.startsWith("Greg");
        System.out.println(startWithGreg.checkName("Gregoire"));

        Predicate<String> startWithGregPred = name -> name.startsWith("Greg");
        System.out.println(startWithGregPred.test("Gregoire"));

        GenerateRandomNumber generateRandomNumber = () -> (int) (Math.random() * 101);
        int randomNumber = generateRandomNumber.create();
        System.out.println(randomNumber);

        Supplier<Integer> generateRandomNumberPred = () -> (int) (Math.random() * 101);

        Consumer<String> consumer = name -> System.out.println("Hello " + name + ", welcome");
        consumer.accept("Gregoire");


        Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(15);
        Supplier<Integer> zeroGenerator = () -> 0;
        Supplier<Character> randomCharacterGenerator = () -> (char)(new Random().nextInt(26) + 'a');

        System.out.println(initializeList(5, generateRandomNumberPred));
        System.out.println();


        Function<String,Integer> lengthCalculator = String::length;
        System.out.println(lengthCalculator.apply("Gregoire"));

        BiFunction<Double, Double, Double> poweringUp = Math::pow;
        System.out.println(poweringUp.apply(2.,2.));
    }
    public static List<Integer> initializeIntegerList(int size, Supplier<Integer> generateRandomNumber){
        List<Integer> valuesList = new ArrayList<>();
        for (int i=0; i<size;i++){
            valuesList.add(generateRandomNumber.get());
        }
        return valuesList;
    }

    public static <T> T initializeList(int size, Supplier<T> generateRandomNumber){
        List<T> valuesList = new ArrayList<>();
        for (int i=0; i<size;i++){
            valuesList.add(generateRandomNumber.get());
        }
        return (T) valuesList;
    }
}
