package q1;

import javax.naming.Name;
import javax.swing.text.html.Option;
import java.awt.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args){

        String name = "Max";
        int value = 3;


        Optional<Object> optWithName = Optional.of(name);
        if (optWithName.isPresent()){
            System.out.println(optWithName.get());
            }
        else {
            System.out.println("No it's Max");
        }

        Optional<Object> optWithoutName = Optional.empty();
        if (optWithoutName.isPresent()){
            System.out.println(optWithName.get());
            }
        else {
            System.out.println("No it's Max");
        }

        Optional optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.orElse("Max"));

        Optional<Integer> optional = Optional.of(value);
        if (optional.isPresent()) {
            System.out.println("The number 3 is here");
        }



    }
}
