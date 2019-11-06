package Lesson_1106;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getWeekYear());
        calendar.add(Calendar.YEAR,2);
        System.out.println(calendar.getTime());
    }
}
