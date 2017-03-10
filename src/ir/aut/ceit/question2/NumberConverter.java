package ir.aut.ceit.question2;


public class NumberConverter {

    private static final String HUNDRED = "Hundred ";
    private static final String THOUSAND = "Thousand ";
    private static final String[] ONE_TO_NINE =
            {"",
            "One ",
            "Two ",
            "Three ",
            "Four ",
            "Five ",
            "Six ",
            "Seven ",
            "Eight ",
            "Nine "};
    private static final String[] TEN_TO_NINETEEN = {"", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    private static final String[] TWENTY_TO_NINETY = {"", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    /**
     * Spelling integer, convert integer to string
     *
     * @param num input number
     * @return equivalent string
     */
    public String spellingInteger(int num) {
        String number = "";
        number += (num / 1000) > 0 ? ONE_TO_NINE[num / 1000] + THOUSAND : "";
        number += ((num / 100) % 10) > 0 ? ONE_TO_NINE[(num / 100) % 10] + HUNDRED : "";
        if (((num / 10) % 10) == 1) {
            number += TEN_TO_NINETEEN[(num % 10) + 1];
        } else {
            number += ((num / 10) % 10) > 0 ? TWENTY_TO_NINETY[((num / 10) % 10) - 1] : "";
            number += (num % 10) > 0 ? ONE_TO_NINE[num % 10] : "";
        }
        return number.isEmpty() ? "Zero" : number;
    }

}
