package ir.aut.ceit.exception;

import java.io.*;

/*
* Copyright 2017 Amir Hadifar.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
*/
public class Exceptions {

    public static void main(String[] args) {

        //checked exception
        InputStream is = null;
        try {
            is = new FileInputStream("D//:...");
            BufferedInputStream bf = new BufferedInputStream(is);
        } catch (FileNotFoundException e) {
            System.exit(0);
        } finally {
            System.out.println("I'm finally");
        }
        // IOException


        // unchecked exception
        int a = 10 / 0;
        // cast Exception
        // Arithmetic exception
        // arrayIndexOutOfBond exception


        // error
        // recursive function .. StackOverFlowError
    }

    public void func1() {
        System.out.println("Exceptions.func1");
        func2();

    }

    private void func2() {

        int a = 1 / 0;
        System.out.println("Exceptions.func2");
    }

    public void ex1(int size) throws Throwable {

        if (size == 0) {
            throw new Throwable("Size is zero it should be greater than 0");
        }

        size++;
        System.out.println("This is end of program" + size);
    }

    public void checked() {
    }
}
