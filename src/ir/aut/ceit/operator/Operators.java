package ir.aut.ceit.operator;

/*
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
public class Operators {


    public static void main(String[] args) {

        int unk = 0;
        unk = (unk = 1) + (unk = 2) * (++unk) * (unk++);
        System.out.println(unk);
    }

    public void operatorDifference() {

        //this expression evaluate all conditions
        if (false & test()) {

        }

        // short circuit operator
        if (false && test()) {

        }

    }

    private boolean test() {
        System.out.println("Operators.test");
        return false;

    }

}
