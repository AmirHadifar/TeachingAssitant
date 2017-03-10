package ir.aut.ceit.question3;

public class ComplexNumber implements Comparable<ComplexNumber> {

    private double real;
    private double imaginary;

    public ComplexNumber() {
        this(0, 0);
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        double resReal = this.real + complexNumber.real;
        double resImage = this.imaginary + complexNumber.imaginary;
        return new ComplexNumber(resReal, resImage);
    }

    public ComplexNumber add(int real, int image) {
        return add(new ComplexNumber(real, image));
    }

    //todo: implement sub(double real, double image);

    public ComplexNumber sub(ComplexNumber complexNumber) {
        double resReal = this.real - complexNumber.real;
        double resImage = this.imaginary - complexNumber.imaginary;
        return new ComplexNumber(resReal, resImage);
    }

    public ComplexNumber div(ComplexNumber complexNumber) {
        return null;
    }

    public ComplexNumber mul(ComplexNumber complexNumber) {
        // todo: implement your method here
        return new ComplexNumber(999999999, 99999999);
    }

    public String toString() {
        return real + " " + imaginary + "i";
    }


    @Override
    public int compareTo(ComplexNumber o) {
        if (o.imaginary == this.imaginary) return 0;
        else if (o.imaginary > this.imaginary) return 1;
        else return -1;
    }

}
