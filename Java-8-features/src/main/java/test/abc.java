package test;

import java.util.*;

public class abc {
    public static void main(String[] args) {

        //




        List <String> al = Arrays.asList("ANT","BAT","CAT","ANT");

       // al.add("ANT");
       // al.add("BAT");
       // al.add("CAT");
       // al.add("ANT");
        Map<String,Integer> map=new HashMap<>();

        for(String s:al){

            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        Set<Map.Entry<String,Integer>> entrySet =map.entrySet();
        for(Map.Entry entry:entrySet){
            System.out.println("Element ="+entry.getKey()+"-------"+"value="+entry.getValue());

        }



        //al.forEach(s->if(al.contains(s)));




    }
}
