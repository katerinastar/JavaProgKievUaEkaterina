package ua.kyiv.prog.caesar;

/**
 * Class for running CaesarCode
 */

public class CaesarRunner {
    public static void main(String[] args){
        String message = "aba";
        String encodingResult = Encoding.encode(message, 3);
        String decodingResult = Decoding.decode(message, 3);
        System.out.println(encodingResult + " " + decodingResult);
    }
}
