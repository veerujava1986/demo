package lambdaexpression;

import java.util.ArrayList;

public class Starter1 {
    public static void main(String[] args) {



    //    () -> {
    //        //Body of no parameter lambda
    //    }

    //    (p1) -> {
    //        //Body of single parameter lambda
    //    }

    //    (p1,p2) -> {
    //        //Body of multiple parameter lambda
    //    }




        //lambda expression is used to impliment Functional interface method,
        ////Functional interface means it contains only one abstract method
        //and also we can write lambda expression in method call whereever functional interface is difined as argument
        // no need to implement with seperate implementation class
        //no need annonamus class implementation



        //1)lambda expression with return keyword
        MyService ms=(a,b)->{
            int result=a+b;
            return result;
        };

        System.out.println(ms.add(10,11));


        //2)lambda expression without return keyword
        MyService ms2=(a,b)->(a+b);
        System.out.println(ms2.add(40,20));

        //3)lambda expression with foreach loop
        ArrayList<String> al=new ArrayList<>();
        al.add("apple");
        al.add("ball");
        al.add("cat");
        al.forEach(x-> System.out.println(x));


    }
}
