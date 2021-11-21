import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringSplitTest {

    @Test
    public void split_1() {
        String str = "Apple,Amazone,Google,Microsoft";
        String[] list = str.split(",");
        System.out.println(Arrays.toString(list));
        // [Apple, Amazone, Google, Microsoft]
    }

    @Test
    public void split_2() {
        String str = "Apple Amazon Google Microsoft";
        String[] list = str.split(" ");
        System.out.println(Arrays.toString(list));
        // [Apple, Amazon, Google, Microsoft]
    }

    @Test
    public void split_3() {
        String str = "a p, p, l.e c, o r.p";
        String[] list = str.split("\\s+|,\\s*|\\.\\s*");
        System.out.println(Arrays.toString(list));
        // [a, p, p, l, e, c, o, r, p]
    }

    @Test
    public void split_remove_whitespace_1() {
        String str = "Apple  , Amazon , Google , Microsoft";
        String[] list = str.trim().split("\\s*,\\s*");
        System.out.println(Arrays.toString(list));
        // [Apple, Amazon, Google, Microsoft]
    }

    @Test
    public void split_remove_whitespace_2() {
        String str = "Apple  , Amazon , Google , Microsoft";
        String[] list = Arrays.stream(str.split(","))
                        .map(String::trim)
                        .toArray(String[]::new);
        System.out.println(Arrays.toString(list));
        // [Apple, Amazon, Google, Microsoft]
    }

    @Test
    public void pattern() {
        String str = "Apple Amazon Google Microsoft";
        Pattern pattern = Pattern.compile("\\s");
        String[] list = pattern.split(str);

        System.out.println(Arrays.toString(list));
        // [Apple, Amazon, Google, Microsoft]
    }

    @Test
    public void apache_commons() {
        String str = "Apple Amazon Google Microsoft";
        //String[] list = StringUtils.split(str, " ");
        System.out.println(Arrays.toString(list));
    }

    @Test
    public void apache_commons_2() {
        String str = "Apple Amazon   Google Microsoft";
        //String[] list = StringUtils.split(str);
        System.out.println(Arrays.toString(list));
    }
}
