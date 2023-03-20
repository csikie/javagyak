class Complex {
    double re;
    double im;

    double abs() {
        return Math.sqrt(re*re + im*im);
    }

    void add(Complex that) {
        re += that.re;
        im += that.im;
    }

    void sub(Complex that) {
        re -= that.re;
        im -= that.im;
    }

    void mul(Complex that) {
        re = re*that.re - that.im*im;
        im = re*that.im + that.re*im;
    }
}
