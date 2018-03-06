package Lambdas;

import java.util.function.Consumer;

public class PrintLine implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
