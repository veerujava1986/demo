package ReverseString;

public class Starter {
    public static void main(String[] args) {
        String s="apple";
        char[] chaarArr=s.toCharArray();
        String temp="";

        for(int i=chaarArr.length-1;i>=0;i--){
            temp=temp.concat(String.valueOf(chaarArr[i]));
        }

        System.out.println(temp);
    }
}
