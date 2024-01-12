import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "bcd", "cba", "aaa", "Acb", "xyz");

        System.out.println("Initial list of strings: " + stringList);

        List<String> newList = checkStrings(stringList);

        System.out.println("\nStrings that starts with an 'a' and have just 3 letters: " + newList);
    }
    private static List<String> checkStrings(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
    }
}