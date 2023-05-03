package q5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> players = List.of("Atos","Portos","Aramis","Dartagnan","Atos","Portos");
        List<String> mousquetaireWithoutDuplicate = players.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Les 4 mousquetaires = " + mousquetaireWithoutDuplicate);

        long mousquetaire = players.stream()
                .distinct()
                .count();
        System.out.println("Nombre de mousquetaire " + mousquetaire);

        List<String> mousquetaire1 = players.stream()
                .distinct()
                .filter(name -> name.toLowerCase().contains("o"))
                .collect(Collectors.toList());
        System.out.println(mousquetaire1);

        List<String> Mousquetaire2 = players.stream()
                .distinct()
                .filter(name -> name.toUpperCase().startsWith("D"))
                .collect(Collectors.toList());
        System.out.println(Mousquetaire2);

        List<Student> students = new ArrayList<>();
        Student thibault = new Student("Thibault", 12);
        students.add(thibault);
        Student maximilien = new Student("Maximilien", 14);
        students.add(maximilien);
        Student ghislain = new Student("Ghislain", 9);
        students.add(ghislain);
        Student georges = new Student("Georges", 5);
        students.add(georges);


        students.sort(Comparator.comparingInt(Student::getGrade));
        students.forEach(
                student -> System.out.println(student.getName() + " a une note de " + student.getGrade())
        );
//      students.forEach(
//      student -> System.out.println(student.getName() + " a une note de  " + student.getGrade())
//      );

    }
}
