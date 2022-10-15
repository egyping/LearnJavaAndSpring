package org.amigoscode;

import java.time.*;

public class DateInAction {

    public static void main(String[] args) {

        // the following methods helps in getting the date and time plus the zones
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
        // 2022-10-15T21:06:12.054267+03:00[Asia/Kuwait]

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        // 2022-10-15T21:06:55.675784

        LocalDate now3 = LocalDate.now();
        System.out.println(now3);
        // 2022-10-15

        LocalTime now4 = LocalTime.now();
        System.out.println(now4);
        // 21:07:57.619220

        Instant instant = Instant.now();
        System.out.println(instant);
        // 2022-10-15T18:09:37.252776Z

        LocalDate now5 = LocalDate.of(2000, Month.JULY , 1 );
        System.out.println(now5);
        // 2000-07-01
        System.out.println(now5.getYear());
        System.out.println(now5.getDayOfMonth());

    }

}
