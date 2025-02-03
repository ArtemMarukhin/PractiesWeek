package string;

public class StringEx8 {
    public static void main(String[] args) {
            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        }

        private static String removeWhiteSpaces(String str) {
            //Написать код здесь
            return str.replaceAll(" ", "");
        }
}
