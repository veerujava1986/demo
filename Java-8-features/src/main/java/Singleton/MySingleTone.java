package Singleton;

public class MySingleTone {
    private static MySingleTone mySingleTone;
    private MySingleTone(){

    };

    public static MySingleTone getInstance(){
        if(mySingleTone == null){
            mySingleTone=new MySingleTone();
        }
        return mySingleTone;
    }


    public static void main(String[] args) {
        MySingleTone singleTone =MySingleTone.getInstance();
    }
}
