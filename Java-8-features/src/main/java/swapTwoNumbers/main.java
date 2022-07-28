package swapTwoNumbers;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        int x=80;
        int y=100;
        int temp=x;
        x=y;
        y=temp;

        System.out.println("x="+x);
        System.out.println("y="+y);









        ////way-2  with out temp variable

        int a=10;
        int b=20;
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("a="+a);
        System.out.println("b="+b);



    }
}
