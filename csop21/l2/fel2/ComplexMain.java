class ComplexMain {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.re = 1;
        c.im = 1;

        System.out.println("re: " + c.re + " im: " + c.im);

        System.out.println(c.abs());
        c.add(c);
        System.out.println("re: " + c.re + " im: " + c.im);

        c.sub(c);
        System.out.println("re: " + c.re + " im: " + c.im);

        Complex c2 = new Complex();
        c2.re = 2;
        c2.im = 2;
        c2.mul(c2);
        System.out.println("re: " + c2.re + " im: " + c2.im);
    }
}
