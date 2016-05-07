package ua.kyiv.prog.caesar;

/**
 * Class for decoding String
 */

public class Decoding {
    /**
     * Method for decoding String by given key
     *
     * @param str String to be decoded
     * @param key Key to decode String
     * @return New decoded String
     */

    public static String decode(String str, int key){
        char[] string = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length; i++){
            char character = string[i];
            int ascii = (int) character;
            int newascii = ascii - key;
            char newcharacter = (char) newascii;
            result.append(newcharacter);

        }
        return result.toString();
    }
}
