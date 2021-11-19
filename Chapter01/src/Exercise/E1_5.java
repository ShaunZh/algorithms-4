package Exercise;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class E1_5 {
    public static String getType(Object o) {
        return o.getClass().toString();
    }
    public static void e01() {
        StdOut.println("----- e01 -----");
        StdOut.println((0 + 15) / 2); ; // 7
        StdOut.println(2.0e-6*100000000.1);
        StdOut.println(true && false || true && true); // true
    }
    public static void e02() {
        StdOut.println("----- e02 -----");
        StdOut.println(getType((1 + 2.345) / 2)); // 3.345/2 = 1.6725 float
        StdOut.println(getType(1 + 2 + 3 + 4.0)); // 10.0  float
        StdOut.println(getType(4.1 >= 4)); // true boolean
        StdOut.println(getType(1 + 2 + "3")); // "33" string
    }
    public static void e03() {
        StdOut.println("----- e03 -----");
        int[] numArr = StdIn.readAllInts();
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] != numArr[i - 1]) {
                StdOut.println("not equal");
                return;
            }
        }
        StdOut.println("equal");
    }
    public static void e05() {
        StdOut.println("----- e05 -----");
        double d = StdIn.readDouble();
        StdOut.println("" + (d > 0 && d < 1.0));
    }

    public static void main(String[] args) {
        e01();
        e02();
//        e03();
        e05();
    }
}
