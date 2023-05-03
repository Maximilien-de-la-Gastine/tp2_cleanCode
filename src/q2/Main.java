//package Q2;
//
//import java.util.List;
//import java.util.Locale;
//import java.util.Optional;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        /*
//        Le but d'une lambda est d'écrire du code plus compréhensible, lisible et concis. Elle permet d'éviter l'utilisation de méthode dans
//        une classe pour quelque chose que l'on appel qu'une seule fois. Dans cet exemple, la lambda joue le rôle de la méthode
//        CountryLengthCalculator en simplifia,t l'écriture.
//        Le but d'une interface fonctonnelle est de n'avoir qu'une méthode, et cette méthode ne doit pas avoir d'implémentation.
//        Elles permettent de travailler seulement avec des expressions lambda ce qui peut être pratique dans beaucoup de cas.
//         */
//        Q2.LengthCalculator cityLengthCalculator = new Q2.CityLengthCalculator();
//        int cityLength = cityLengthCalculator.calculate("Paris");
//        System.out.println(cityLength);
//
//        Q2.LengthCalculator regionLengthCalculator = new LengthCalculator() {
//
//            @Override
//            public int calculate(String word) {
//                return word.length();
//            }
//        };
//
//        int regionLength = regionLengthCalculator.calculate("Bretagne");
//        System.out.println(regionLength);
//
//
//        LengthCalculator cityLengthCalculator = (String city) -> {return city.length();};
//        int cityLength = cityLengthCalculator.calculate("Vanves");
//        System.out.println(cityLength);
//
//        LengthCalculator cityLengthCalculator2 = city -> {return city.length();};
//        int cityLength2 = cityLengthCalculator2.calculate("Pau");
//        System.out.println(cityLength2);
//
//        LengthCalculator cityLengthCalculator3 = city -> city.length();
//        int cityLength3 = cityLengthCalculator3.calculate("Saint-Georges d'Oléron");
//        System.out.println(cityLength3);
//
//        LengthCalculator cityLengthCalculator4 = String::length;
//        int cityLength4 = cityLengthCalculator4.calculate("Paris");
//        System.out.println(cityLength4);
//
//        List<String> cities = List.of("Vanves", "Pau", "Paris", "Saint-Georges d'Oléron");
//        Optional<String> startingWithVa = cities.stream()
//                .filter(city -> city.toLowerCase().startsWith("va"))
//                .findFirst();
//        System.out.println(startingWithVa.orElse("Aucune ville"));
//
//    }
//}