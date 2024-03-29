package java13newfeatures;

public class SwitchExpression {

    public static void main(String[] args) {
        /* Before Java 12*/
        /*int dayNumber = 3;
        String day = "";
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            default:
                throw new IllegalStateException("Invalid dayNumber: " + dayNumber);
           }*/

        /* From Java 13*/
        int dayNumber = 3;

        // Here switch is an expression, assigned to "day"
        String day = switch (dayNumber) {
            case 1:
            case 2:
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            default:
                throw new IllegalStateException("Invalid dayNumber: " + dayNumber);
        };
        System.out.println(day); // Wednesday
    }

}
