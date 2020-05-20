import java.util.*;
import java.util.stream.Collectors;

public class UpperCaseStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "def", "klmn");
        List<String> upper = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        for(String str: upper)
        {
            System.out.println(str + " ");
        }
    }
}
