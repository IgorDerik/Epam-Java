package Generic;

import java.util.Collection;

public final class Algorithm {

    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;

        for (T element : c) {

            if(p.test(element)) count++;

        }

        return count;
    }

}
