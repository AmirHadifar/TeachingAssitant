package ir.aut.ceit;

import ir.aut.ceit.collection.Collection;
import ir.aut.ceit.generic.BoxGen;
import ir.aut.ceit.question1.LeapYear;
import ir.aut.ceit.question2.NumberConverter;
import ir.aut.ceit.question3.ComplexNumber;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            System.out.println("Hello division");
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        } finally {
            System.out.println("Just finished");
        }

        System.out.println("end of program");

    }

    private static void genericTest() {
        BoxGen<Integer> boxGen = new BoxGen<>();
        boxGen.addToArray(1);
        boxGen.addToArray(2);
        boxGen.addToArray(3);
        boxGen.addToArray(4);
        boxGen.addToArray(5);
        boxGen.printArray();

        BoxGen<String> boxGen1 = new BoxGen<>();
        boxGen1.addToArray("Hello");
        boxGen1.addToArray("World");
        boxGen1.addToArray("@Each");
        boxGen1.addToArray("Kids");
        boxGen1.printArray();
    }

    private static void testCollections() {
        ComplexNumber c1 = new ComplexNumber(1, 1);
        ComplexNumber c2 = new ComplexNumber(1, 2);
        ComplexNumber c3 = new ComplexNumber(1, 3);
        ComplexNumber c4 = new ComplexNumber(1, 4);
        ComplexNumber c5 = new ComplexNumber(1, 5);
        ComplexNumber c6 = new ComplexNumber(1, 6);
        ComplexNumber c7 = new ComplexNumber(1, 6);

        TreeSet<ComplexNumber> treeSet = new TreeSet<>();
        treeSet.add(c7);
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);
        treeSet.add(c5);
        treeSet.add(c6);
        System.out.println(treeSet.size());

        ArrayList<ComplexNumber> arrayList = new ArrayList<>();
        arrayList.add(c7);
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);
        arrayList.add(c5);
        arrayList.add(c6);
        System.out.println(arrayList.size());

        PriorityQueue<ComplexNumber> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(c7);
        priorityQueue.add(c1);
        priorityQueue.add(c2);
        priorityQueue.add(c3);
        priorityQueue.add(c4);
        priorityQueue.add(c5);
        priorityQueue.add(c6);
        System.out.println(priorityQueue.size());

        HashMap<Integer, ComplexNumber> hashMap = new HashMap<>();
        hashMap.put(6, c7);
        hashMap.put(1, c1);
        hashMap.put(2, c2);
        hashMap.put(3, c3);
        hashMap.put(4, c4);
        hashMap.put(5, c5);
        hashMap.put(6, c6);
        System.out.println(hashMap.size());

        Collection collection = new Collection(treeSet, arrayList, priorityQueue, hashMap);
        collection.displayTreeSet();
        System.out.println();
        collection.displayArrayList();
        System.out.println();
        collection.priorityQueue();
        System.out.println();
        collection.displayMap();
    }

    private static void filteringImage() {
        //read image

        BufferedImage img = null;
        try {
            String path = "/Users/mac/IdeaProjects/TeachingAssitant/src/ir/aut/ceit/cat.jpg";
            File f = new File(path);
            img = ImageIO.read(f);

            int height = img.getHeight(), width = img.getWidth();

            double filter[][] = {{-1, -1, -1}, {-1, 8, -1}, {-1, -1, -1}};

            Random random = new Random();


            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {

//                    if (i != 0 && i != width - 1 && j != 0 && j != height - 1) {
//                        //get pixel value
//                        int p00 = img.getRGB(i - 1, j - 1);
//                        int p01 = img.getRGB(i - 1, j);
//                        int p02 = img.getRGB(i - 1, j + 1);
//                        int p10 = img.getRGB(i, j - 1);
//
//                        int p11 = img.getRGB(i, j); //1 1
//
//                        int p12 = img.getRGB(i, j + 1);
//                        int p20 = img.getRGB(i + 1, j - 1);
//                        int p21 = img.getRGB(i + 1, j);
//                        int p22 = img.getRGB(i + 1, j + 1);
//
//                        int res = (int) (
//                                p00 * filter[0][0] +
//                                p01 * filter[0][1] +
//                                p02 * filter[0][2] +
//                                p10 * filter[1][0] +
//                                p11 * filter[1][1] +
//                                p12 * filter[1][2] +
//                                p20 * filter[2][0] +
//                                p21 * filter[2][1] +
//                                p22 * filter[2][2])/9;
//
//
//
//                        img.setRGB(i, j, res);
//                    }

                    int p = img.getRGB(i, j);
                    int a = (p >> 24) & 0xff;
                    a = random.nextInt(255);
                    int r = (p >> 16) & 0xff;
                    r = random.nextInt(255);
                    int g = (p >> 8) & 0xff;
                    g = random.nextInt(255);
                    int b = p & 0xff;
                    b = random.nextInt(255);
                    int avg = (r + g + b) / 3;


                    p = (a << 24) | (r << 16) | (g << 8) | b;


                    img.setRGB(i, j, p);


                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File f = new File("/Users/mac/IdeaProjects/TeachingAssitant/src/ir/aut/ceit/cat6.jpg");
            ImageIO.write(img, "jpg", f);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    private static void testQuestion1() {
        NumberConverter converter = new NumberConverter();
        System.out.println(converter.spellingInteger(0));
        System.out.println(converter.spellingInteger(1));
        System.out.println(converter.spellingInteger(9));
        System.out.println(converter.spellingInteger(11));
        System.out.println(converter.spellingInteger(99));
        System.out.println(converter.spellingInteger(100));
        System.out.println(converter.spellingInteger(991));
        System.out.println(converter.spellingInteger(1000));
        System.out.println(converter.spellingInteger(1001));
        System.out.println(converter.spellingInteger(1239));
        System.out.println(converter.spellingInteger(1939));
        System.out.println(converter.spellingInteger(9001));
        System.out.println(converter.spellingInteger(9999));
    }

    private static void testQuestion2() {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(1390) ? "It's leap year" : "Its not leap year");
        System.out.println(leapYear.isLeapYear(1391) ? "It's leap year" : "Its not leap year");
        System.out.println(leapYear.isLeapYear(1392) ? "It's leap year" : "Its not leap year");
        System.out.println(leapYear.isLeapYear(1393) ? "It's leap year" : "Its not leap year");
        System.out.println(leapYear.isLeapYear(1394) ? "It's leap year" : "Its not leap year");
        System.out.println(leapYear.isLeapYear(1395) ? "It's leap year" : "Its not leap year");
    }

    private static void testQuestion3() {

        ComplexNumber complexNumber1 = new ComplexNumber(93, 31);
        ComplexNumber complexNumber2 = new ComplexNumber(1.1, 2.31);
        ComplexNumber complexNumber3 = new ComplexNumber(0.001, 13.1023);

        ComplexNumber complexNumber4 = complexNumber1.sub(complexNumber2);
        ComplexNumber complexNumber5 = complexNumber2.mul(complexNumber3);

        ComplexNumber complexNumber6 = new ComplexNumber();
        ComplexNumber complexNumber7 = new ComplexNumber();

        System.out.println(complexNumber1);
        System.out.println(complexNumber4);
        System.out.println(complexNumber5);
        System.out.println(complexNumber6);
        System.out.println(complexNumber7);

        System.out.println(complexNumber1.add(complexNumber2));
        System.out.println(complexNumber2.sub(complexNumber3));
        System.out.println(complexNumber3.div(complexNumber4));
        System.out.println(complexNumber4.mul(complexNumber4));

        System.out.println(complexNumber1.getReal());
        System.out.println(complexNumber1.getImaginary());
        System.out.println(complexNumber2.getReal());
        System.out.println(complexNumber2.getImaginary());

        complexNumber1.setReal(10.11111);
        complexNumber1.setImaginary(10.11111);
        complexNumber2.setReal(10.12391);
        complexNumber2.setImaginary(1931.132);

        System.out.println(complexNumber1.getReal());
        System.out.println(complexNumber1.getImaginary());
        System.out.println(complexNumber2.getReal());
        System.out.println(complexNumber2.getImaginary());

    }

}
