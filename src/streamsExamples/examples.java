package streamsExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class examples {
    private final List<String> numbers = new ArrayList<String>(){{
        add("one");
        add("two");
        add("three");
        add("four");
        add("five");
        add("six");
        add("seven");
        add("eight");
        add("nine");
        add("ten");
        add("eleven");
    }};
    public examples(){
        //System.out.println(numbers);
        Stream<String> s = numbers.stream();
        //s.forEach(System.out::println);
        //System.out.println("---------------");

        // Count the elements in the list
        //long count = numbers.stream().count();
        //System.out.println("the size of the list is" + count);

        //dispaly the sorted list
        List<String> sortedNumbers = numbers.stream().sorted().collect(toList());
        System.out.println(sortedNumbers);
        System.out.println("---------------");

        // Filter: show nums longer than 5 characters
        List<String> longNumbers = numbers.stream().filter(d->d.length()>4).collect(toList());
        System.out.println(longNumbers);
        System.out.println("---------------");

        //display the longet name
        List<String> longestNumber = numbers.stream()
                .sorted(comparing(d->-d.length()))
                .limit(1)
                .collect(toList());
        s = longestNumber.stream();
        s.forEach(System.out::println);
        System.out.println("done!");

    }
    public static void main(String[] args) {
        examples ex = new examples();
    }
}
