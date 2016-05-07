package ua.kyiv.prog.caesar;

/**
 * Class for encoding String
 */

public class Encoding {
    /**
     * Method for encoding String by given key
     *
     * @param str String to be encoded
     * @param key Key to encode String
     * @return New encoded String
     */

    public static String encode(String str, int key){
        char[] string = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length; i++){
            char character = string[i];
            int ascii = (int) character;
            int newascii = ascii + key;
            char newcharacter = (char) newascii;
            result.append(newcharacter);

        }
        return result.toString();
    }
}
