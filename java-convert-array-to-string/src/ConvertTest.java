import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ConvertTest {

    @Test
    public void Default_toString() throws Exception {
        String[] company = { "Apple", "Amazone", "Google", "Microsoft"};
        System.out.println(company.toString());
    }

    @Test
    public void String_Join_1() {
        String[] company = { "Apple", "Amazone", "Google", "Microsoft"};
        String joinString = String.join(", ", company);

        System.out.println(joinString);
    }

    @Test
    public void String_Join_2() {
        String joinString = String.join(" ","Apple", "Amazone", "Google", "Microsoft");

        System.out.println(joinString);
    }

    @Test
    public void List_Join_1() {
        List<String> company = List.of("Apple", "Amazone", "Google", "Microsoft");
        String joinString = String.join("-", company);

        System.out.println(joinString);
    }

    @Test
    public void List_Join_2() {
        List<String> company = List.of("Apple", "Amazone", "Google", "Microsoft");
        String joinString = String.join("-", company);

        System.out.println(joinString);
    }

    @Test
    public void Stream_Join_1() {
        String[] company = {"Apple", "Amazone", "Google", "Microsoft"};
        String str = Arrays.stream(company).collect(Collectors.joining(", "));

        System.out.println(str);
    }

    @Test
    public void Stream_Join_2() {
        String[] company = {"Apple", "Amazone", "Google", "Microsoft"};
        String str = Arrays.stream(company).collect(Collectors.joining(", ", "<", ">"));

        System.out.println(str);
    }

    @Test
    public void Arrays_Join() {
        String[] company = {"Apple", "Amazone", "Google", "Microsoft"};
        String str = Arrays.toString(company);

        System.out.println(str);
    }

    @Test
    public void Arrays_Join_Primitive_Type() {
        int[] number = {1, 2, 3, 4};
        System.out.println(Arrays.toString(number));

        double[] prices = {3.14, 4.0, 1.1};
        System.out.println(Arrays.toString(prices));
    }

    @Test
    public void StringBuilder() {
        StringBuilder builder = new StringBuilder();
        String[] company = {"Apple", "Amazone", "Google", "Microsoft"};
        for (String name : company) {
            builder.append(name).append("-");
        }
        String str = builder.toString();
        System.out.println(str);
    }
    
    @Test 
    public void String_Joiner() {
        String str = new StringJoiner("-")
                .add("Apple")
                .add("Amazone")
                .add("Google")
                .add("Microsoft")
                .toString();

        System.out.println(str);
    }

    @Test
    public void StringUtils() {
        String[] company = {"Apple", "Amazone", "Google", "Microsoft"};
        // String str = StringUtils.join(company, "-"); // apache.common의 StringUtils 필요

        // System.out.println(company);
    }
}