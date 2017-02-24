package ir.aut.ceit.homework2;

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
        testQuestion1();
    }

    private static void testQuestion1() {

        ComplexNumber complexNumber1 = new ComplexNumber(19, 10);
        ComplexNumber complexNumber2 = new ComplexNumber(1933.3, 0.9);
        System.out.println(ComplexNumber.getCount());
        ComplexNumber complexNumber3 = complexNumber1.add(complexNumber2);
        System.out.println(complexNumber3);
        ComplexNumber complexNumber4 = new ComplexNumber();
        System.out.println(complexNumber1.div(complexNumber4));
        System.out.println(ComplexNumber.getCount());
        System.out.println(complexNumber1.getImage());
        System.out.println(complexNumber1.getReal());
        System.out.println(complexNumber4.sub(complexNumber2));
        System.out.println(ComplexNumber.getCount());

    }
}
