import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {


        String s="veeru";
       char charArr[]= s.toCharArray();

       Stream slist= Stream.of(s.toCharArray());

       Map<Integer,String> map=new HashMap<>();
        System.out.println(slist.filter(s2->map.containsKey(map.get(s))).collect(Collectors.toList()));






    }
}
