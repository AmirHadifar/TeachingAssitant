package ir.aut.ceit.collection;

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

import ir.aut.ceit.question3.ComplexNumber;

import java.util.*;
import java.util.function.Consumer;

public class Collection {

    private Set<ComplexNumber> complexNumberSet;
    private List<ComplexNumber> complexNumberList;
    private Queue<ComplexNumber> complexNumberQueue;
    private Map<Integer, ComplexNumber> complexNumberMap;


    public Collection(Set<ComplexNumber> complexNumberSet,
                      List<ComplexNumber> complexNumberList,
                      Queue<ComplexNumber> complexNumberQueue,
                      Map<Integer, ComplexNumber> complexNumberMap) {

        this.complexNumberSet = complexNumberSet;
        this.complexNumberList = complexNumberList;
        this.complexNumberQueue = complexNumberQueue;
        this.complexNumberMap = complexNumberMap;
    }


    public void displayTreeSet() {
        complexNumberSet.forEach(System.out::println);
    }

    public void displayMap() {
        complexNumberMap.entrySet().forEach(System.out::println);
    }

    public void displayArrayList() {
        complexNumberList.forEach(System.out::println);
    }

    public void priorityQueue() {
        complexNumberQueue.forEach(System.out::println);
    }

    public synchronized void testVector() {

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(914);
        vector.add(91);
        vector.forEach(System.out::println);
        vector.elements();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

    }


}
