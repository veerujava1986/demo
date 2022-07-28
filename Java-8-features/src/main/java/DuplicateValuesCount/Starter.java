package DuplicateValuesCount;

import java.util.*;

public class Starter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2,2,2,2, 3, 5, 8, 13, 21, 34, 55, 89,2, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765);

        Map<Integer ,Integer> map = new HashMap<>();

        for(  Integer r  : list) {
            if(  map.containsKey(r)   ) {
               // map.put(r, map.get(r) + 1);
            }//if
            else {
               // map.put(r, 1);
            }
        }//for

        //iterate

        Set< Map.Entry<Integer ,Integer> > entrySet = map.entrySet();
        for(    Map.Entry<Integer ,Integer>  entry : entrySet     ) {
           // System.out.printf(   "%s : %d %n "    , entry.getKey(),entry.getValue()  );
        }//for

        //test

        for(int i:list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        Set<Map.Entry<Integer,Integer>>   entryset=map.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet){
            System.out.println("KEY="+entry.getKey()+"--------VALUE="+entry.getValue());
        }



    }


    public void t1(){


        List<Integer> list = Arrays.asList(1, 1, 2,2,2,2, 3, 5, 8, 13, 21, 34, 55, 89,2, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765);

        Map<Integer ,Integer> map = new HashMap<>();

        for(  Integer r  : list) {
            if(  map.containsKey(r)   ) {
                 map.put(r, map.get(r) + 1);
            }//if
            else {
                map.put(r, 1);
            }
        }//for

        //iterate

        Set< Map.Entry<Integer ,Integer> > entrySet = map.entrySet();
        for(    Map.Entry<Integer ,Integer>  entry : entrySet     ) {
             System.out.printf(   "%s : %d %n "    , entry.getKey(),entry.getValue()  );
        }//for
    }

}
