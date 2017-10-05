import java.util.Stack;

public class ArraysAndStrings {
    public static void main(String[] args) {
        String reversedString = q1point2(args[0]);
        System.out.println(reversedString);
    }

    /* 1.1 checking if a string has unique characters -
        take first char and check against rest
        take second char and check against chars in front
        and so on */
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

    /* 1.2 reverse a string -
        make a new char[] array
        and fill chars starting
        from the end of original
        char[] of given string */
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

    /* 1.3 check if one string is a
        permutation of another */
    public static boolean q1point3(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();


        return true;
    }

    /* 1.4 replace all spaces in a
        string with '%20' */
    public static String q1point4(String inputString) {
        char[] array = inputString.toCharArray();
        char[] outputArray = new char
        for(int i = 0; i < array.length; i++) {
            if (array[i] == ' '){
                array[i] = '%20';
            }
        }
        return new String(array);
    }
}