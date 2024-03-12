package Lab02;

public class Zad03Teacher {
    public static void main(String[] args) {
        String time24 = "14:40";
        String[] splitTime = time24.split(":");
        Integer hour = Integer.valueOf(splitTime[0]);
        Boolean isLessThanTwelve = true;

        if (hour > 12) {
            isLessThanTwelve = false;
            hour = hour - 12;
        }


    }
}
