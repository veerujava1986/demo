package printingstars;

public class Starter {
    public static void main(String[] args) {
//        int i;
//        int j;
//        int row=6;
//
//        for(i=0;i<=row;i++){
//            for(j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//


        for(int i=0;i<=6;i++){
            Starter.printstars(i);
        }

    }



    public static void printstars(int j){
        String s="";
        for(int i=0;i<=j;i++){
            s=s+"*";
        }


        System.out.print(s);System.out.println("");
    }

}
