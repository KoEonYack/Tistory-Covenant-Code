import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class StringToIntegerTest {

    @Test
    void parseInt() {
        String str = "33";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    // 33

    @Test
    void parseInt_base16() {
        String strBase16 = "100";
        int num2 = Integer.parseInt(strBase16, 16);
        System.out.println(num2);
    }
    // 256

    @Test
    void parseInt_exception() {
        String str = "25T";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void valueof() {
        Integer num1 = Integer.valueOf("33");
        System.out.println(num1);
    }
    // 19

    @Test
    void scanner() {
        System.out.println(new Scanner("123").nextInt()); // InputMismatchException
    }

    @Test
    void isNumeric() {
        String str = "123";
        String str1 = "123a";
        System.out.println(isNumeric(str));
        System.out.println(isNumeric(str1));
    }

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
