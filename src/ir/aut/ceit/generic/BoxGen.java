package ir.aut.ceit.generic;

import java.util.ArrayList;

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
public class BoxGen<T> {

    private ArrayList<T> arrayList;

    public BoxGen() {
        arrayList = new ArrayList<>();
    }


    public ArrayList<T> getArray() {
        return arrayList;
    }

    public void printArray() {
        for (T t1 : arrayList) {
            System.out.println(t1);
        }
    }

    public void addToArray(T t) {
        arrayList.add(t);
    }
}
