package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
    //Instance variable declarations
    private final double real;   // The real component
    private final double imaginary; // The imaginary component

    /**
     * Construct a ComplexNumber given its
     * real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
        this.real = re;
        this.imaginary = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return this.real;
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return this.imaginary;
    }

    /**
     * Returns a new ComplexNumber that is
     * the negative of <em>this</em>.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        return new ComplexNumber(-this.real, -this.imaginary);
    }

    /**
     * Returns a new ComplexNumber that is the
     * sum of <em>this</em> and <em>z</em>.
     *
     * @param z The complex number to add
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber(this.real + z.getReal(), this.imaginary + z.getImaginary());
    }

    /**
     * Returns a new ComplexNumber that is the
     * difference of <em>this</em> and <em>z</em>.
     *
     * @param z The complex number to subtract
     * @return this - z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        return new ComplexNumber(this.real - z.getReal(), this.imaginary - z.getImaginary());
    }

    /**
     * Returns a new ComplexNumber that is the
     * product of <em>this</em> and <em>z</em>.
     *
     * @param z The complex number to multiply
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        double newReal = this.real * z.getReal() - this.imaginary * z.getImaginary();
        double newImaginary = this.imaginary * z.getReal() + this.real * z.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * Returns a new ComplexNumber that is
     * the reciprocal of <em>this</em>.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double denominator = this.real * this.real + this.imaginary * this.imaginary;
        return new ComplexNumber(this.real / denominator, -this.imaginary / denominator);
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>.
     *
     * @param z The complex number to divide by
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        return this.multiply(z.reciprocal());
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     * real +-(optional) i imaginary
     * </pre>
     * @return the String representation.
     */
    @Override
    public String toString() {
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
