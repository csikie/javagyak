import util.IntVector;

class IntVectorDemo {
    public static void main(String[] args) {
        int[] ns = new int[] {1,2,3};
        IntVector v = new IntVector(ns);
        IntVector v2 = new IntVector(ns);

        System.out.println(new int[] {1,2,3});
        System.out.println(v);
        System.out.println(v2);

        System.out.println("v.add(1);");
        v.add(1);
        System.out.println(v);
        System.out.println(v2);

        System.out.println("ns[0] = 10;");
        ns[0] = 10;             
        System.out.println(v);
        System.out.println(v2);
    }
}