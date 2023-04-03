class Foo {
    private int x;

    public Foo(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        int counter = 10;       // (1)             stack: counter=10 heap: 

        Foo obj;                // (2)             stack: counter=10, obj heap: { init_x : 5}
        obj = new Foo(5);       // (3)

        Foo obj2 = new Foo(7);  // (4)
        obj2 = obj;             // (5)

        // ...
    }
}
/*
 * 
 *      stack                     heap
 * (1) counter=10
 * (2) counter=10,obj
 * (3) counter=10,obj ----->      { init_x: 5 }
 * (4) counter=10,
 *     obj  ----->                 { init_x: 5 }
 *     obj2 ----->                 { init_x: 7 }
 * (5) obj, obj2 ----->            { init_x: 5 }
 *                                 { init_x: 7 }
 */