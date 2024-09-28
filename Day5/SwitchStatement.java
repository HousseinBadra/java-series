package Day5;
public class SwitchStatement {
    public static void main(String args[]) {

        int weekdayIndex = 1;
        String weekday = getWeekday(weekdayIndex);
        System.out.println(weekday);

        return;

    }

    public static String getWeekday(int weekday) {
        String result = "";
        switch (weekday) {
            case 0:
                result = "Monday";
                break;
            case 1:
                result = "Tuesday";
                break;
            case 2:
                result = "Wednesday";
                break;
            case 3:
                result = "Thursday";
                break;
            case 4:
                result = "friday";
                break;
            case 5:
                result = "Saturday";
                break;
            case 6:
                result = "Sunday";
                break;
            default:
                result = "Invalid weekday";
                break;

        }
        return result;
    }
}
