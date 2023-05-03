package q3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //La genericite est un concept qui defini un algorithme ou bien une methode en
        // fonction de sa capacite a etre utilise(e) sur de multiple type de donnees
        //comme la fonction getSecondElementOfUnknowType
        // (il ne suffit donc que d'une seule methode pour plusieurs types de donnees)

        List<String> frenchCity = List.of("Paris", "Lille", "Suresnes", "La Garenne Colombes");
        List<Integer> integers = List.of(5, 7, 90, 39);

        System.out.println(getSecondElementString(frenchCity));
        System.out.println(getSecondElementInteger(integers));
        System.out.println(getSecondElementOfUnknowType(frenchCity));
        System.out.println(getSecondElementOfUnknowType(integers));
    }
    public static String getSecondElementString(List<String> list){

        if (list == null || list.size() <= 1){
            throw new IllegalArgumentException();
        }
        return list.get(1);
    }

    public static Integer getSecondElementInteger(List<Integer> list){
        if (list == null || list.size() <= 1){
            throw new IllegalArgumentException();
        }
        return list.get(1);
    }

    public static <T> T getSecondElementOfUnknowType(List<T> list){

        if (list == null || list.size() <= 1){
            throw new IllegalArgumentException();
        }
        return list.get(1);
    }
}
