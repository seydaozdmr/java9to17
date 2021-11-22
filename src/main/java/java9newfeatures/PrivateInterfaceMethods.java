package java9newfeatures;

public interface PrivateInterfaceMethods {
    default void wakeUp() {checkTime(7);}
    default void haveBreakfast(){checkTime(9);}
    default void haveLunch(){checkTime(12);}
    default void workOut(){checkTime(18);}


    private void checkTime(int hour){
        if(hour>17){
            System.out.println("you're late!");
        }else{
            System.out.println("you have "+(17-hour)+ " hours left to make the appointment");
        }
    }
}
