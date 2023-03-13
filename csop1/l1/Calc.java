public class Calc {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Osszeg: " + (a+b));
        System.out.println("Kulonbseg: " + (a-b));
        System.out.println("Szorzat: " + (a*b));
        if (b != 0) {
            System.out.println("Hanyados: " + (a/b));
        }
        System.out.println("Maradek: " + (a%b));
    }
}
