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
public class ComplexNumber {
    private static int count = 0;
    private double real;
    private double image;

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
        count++;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(this.real + complexNumber.getReal(), this.image + complexNumber.getImage());
    }

    public ComplexNumber sub(ComplexNumber complexNumber) {
        return new ComplexNumber(this.real - complexNumber.getReal(), this.image - complexNumber.getImage());
    }

    public ComplexNumber div(ComplexNumber complexNumber) {
        //todo forget division formula
        return new ComplexNumber();
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        // todo forget multiply formula
        return new ComplexNumber();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
