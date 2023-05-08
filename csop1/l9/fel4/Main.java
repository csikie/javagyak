public class Main {
    public static void main(String[] args) {
        MultiSet s = new MultiSet();
        s.put("java");
        s.put("java");
        s.put("java");
        s.put("ada");
        s.put("python");
        s.put("c++");

        System.out.println(s);

        MultiSet s2 = new MultiSet();
        s2.put("java");
        s2.put("java");

        System.out.println(s2);

        MultiSet intersect = s.intersect(s2);

        System.out.println(intersect);
    }
}
