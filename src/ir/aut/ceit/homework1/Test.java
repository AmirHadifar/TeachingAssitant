package ir.aut.ceit.homework1;

import static ir.aut.ceit.homework1.NumberConverter.spellingInteger;

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
public class Test {

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
}
