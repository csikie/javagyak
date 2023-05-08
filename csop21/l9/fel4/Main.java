public class Main {
    public static void main(String[] args) {
        MultiSet s = new MultiSet();
        s.put("java");
        s.put("java");
        s.put("java");
        s.put("javascript");
        s.put("python");
        s.put("ada");
        s.put("c++");

        MultiSet s2 = new MultiSet();
        s2.put("java");
        s2.put("java");
        s2.put(".net");

        MultiSet intersect = s.intersect(s2);

        System.out.println(s);
        System.out.println(s2);
        System.out.println(intersect);
    }
}
