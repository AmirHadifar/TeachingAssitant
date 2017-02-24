package ir.aut.ceit.homework1;

/**
 * Copyright 2017 Amir Hadifar.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class NumberConverter {

    private static final String HUNDRED = "Hundred ";
    private static final String THOUSAND = "Thousand ";
    private static final String[] ONE_TO_NINE = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
    private static final String[] TEN_TO_NINETEEN = {"", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    private static final String[] TWENTY_TO_NINETY = {"", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    public static void main(String[] args) {
        testQuestion2();
    }

    private static void testQuestion2() {
        System.out.println(spellingInteger(0));
        System.out.println(spellingInteger(1));
        System.out.println(spellingInteger(9));
        System.out.println(spellingInteger(13));
        System.out.println(spellingInteger(67));
        System.out.println(spellingInteger(99));
        System.out.println(spellingInteger(100));
        System.out.println(spellingInteger(101));
        System.out.println(spellingInteger(781));
        System.out.println(spellingInteger(999));
        System.out.println(spellingInteger(1001));
        System.out.println(spellingInteger(1011));
        System.out.println(spellingInteger(1111));
        System.out.println(spellingInteger(1301));
        System.out.println(spellingInteger(1939));
        System.out.println(spellingInteger(3918));
        System.out.println(spellingInteger(9999));
    }

    /**
     * Spelling integer, convert integer to string
     * @param num input number
     * @return equivalent string
     */
    private static String spellingInteger(int num) {
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
