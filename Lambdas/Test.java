package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        List<String> ingredients = Arrays.asList("milk","sugar","butter","eggs","salt");
        //List<String> ingredients = Arrays.asList("milk","sugar","butter","salt");
/*
        boolean isEggs = false;
        for (String ingredient : ingredients) {
            if (ingredient.equals("eggs")) {
                isEggs = true;
                break;
            }
        }
        System.out.println(isEggs);
*/
/*
        if(ingredients.contains("eggs")) {
            System.out.println("It contains eggs");
        }
        else {
            System.out.println("It doesn't contain eggs");
        }
*/
//        PrintLine printLine = new PrintLine();
//        ingredients.forEach(printLine);

        Consumer<String> consumer = s -> System.out.println(s);

        ingredients.forEach( consumer );

    }
}
