package practice.java.g;

/**
 * Pig Latin Challenge
 */
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to
     * the end, and 'ay' is added to the end of the word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the
     * substring method of String to break up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in) {
        StringBuilder str = new StringBuilder();
        str.append(in.substring(1));
        str.append(in.charAt(0) + "ay");
        return str.toString();
    }
}
