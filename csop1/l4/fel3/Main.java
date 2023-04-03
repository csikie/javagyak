class Foo {
    private int x;

    public Foo(int init_x) {
        x = init_x;
    }
}

public class Main {
    public static void main(String[] args) {
        int counter = 10;       // (1)

        Foo obj;                // (2)
        obj = new Foo(5);       // (3)

        Foo obj2 = new Foo(7);  // (4)
        obj2 = obj;             // (5)

        // ...
    }
}

/*
 *      STACK                 HEAP
 * (1) counter=10
 * 
 * (2) counter=10,
 *     obj
 * 
 * (3) counter=10,
 *     obj    ----------->   { x=5 }
 * 
 * (4) counter=10,
 *     obj    ----------->   { x=5 }
 *     obj2   ----------->   { x=7 }
 * 
 * (5) counter=10,
 *     obj,obj2   ------->   { x=5 }
 *                           { x=7 }
 * 
 */
