import java.util.Stack;

public class ArraysAndStrings {
    public static void main(String[] args) {
        String reversedString = q1point2(args[0]);
        System.out.println(reversedString);
    }

    /* checking if a string
        has unique characters */
    public static boolean q1point1(String inputString) {
        char[] array = inputString.toCharArray();
        for(int i = 0; i < array.length-1; i++) {
            char c = array[i];
            for(int j = i+1; j < array.length; j++) {
                char d = array[j];
                if(c == d) {
                    return false;
                }
            }
        }
        return true;
    }

    // reverse a string
    public static String q1point2(String inputString) {
        char[] array = inputString.toCharArray();
        int length = array.length;
        char[] returnArray = new char[length];
        for(int i = 0; i < length; i++) {
            returnArray[i] = array[length - 1 - i];
        }
        String returnString = new String(returnArray);
        return returnString;
    }
}