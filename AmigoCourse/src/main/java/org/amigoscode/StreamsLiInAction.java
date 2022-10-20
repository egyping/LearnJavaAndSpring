package org.amigoscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamsLiInAction {

    // streams API
    // Mostly used with Arrays and Array list or any list coming from DB

    public static void main(String[] args) {

        // create stream from array
        Integer[] scores = new Integer[]{20, 40, 50, 110};
        // create array in stream style\type
        Stream<Integer> scoresStream = Arrays.stream(scores);

        // create stream from array list (collection)
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Juice");
        shoppingList.add("Tomato");
        shoppingList.add("Milk");
        shoppingList.add("lemon");
        shoppingList.add("Pasta");
        Stream<String> shoppingListStream = shoppingList.stream();
        shoppingListStream.sorted().map(s -> {
            return s.toUpperCase();})
                .filter(y -> y.startsWith("P"))
                .forEach(x -> {
            out.println(x);
        });
        // PASTA
        // Liste inserted stream object then we used stream sorted method to sort and foreach to use lambda
        // foreach to loop and lambda to write the logic
        // foreach must come at last as its terminal method ... all the logic method must come first like map and filter
        // map fileter sorted called intermediate method must come before
        // map takes function as input .. function mean i can use lambda
        // filter takes predicate interface ... means we can use lambda too


        // create stream without Array or List -- self create
        Stream<String> namesStream = Stream.of("Fahd", "Yassin", "Yahya", "Yomna");
        out.println(namesStream);
        // java.util.stream.ReferencePipeline$Head@5305068a
        // since its object only


    }
}
