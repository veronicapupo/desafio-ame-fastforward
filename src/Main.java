import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        System.out.println(findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 2));
    }

    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        Set<Integer> duplicates = new HashSet<>();
        for (Integer valor : integers) {
            int frequency = Collections.frequency(integers, valor);
            if (valor != null && frequency == numberOfDuplicates) {
                duplicates.add(valor);
            }
        }
        return duplicates.stream().toList();
    }
}