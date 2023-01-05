        import java.time.*;
        import java.util.Date;

public class Task2 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(dataToLocalDateTime(date).toLocalDate());
        System.out.println(dataToLocalDateTime(date).toLocalTime());
        System.out.println(dataToLocalDateTime(date).toLocalDateTime());
    }

    public static ZonedDateTime dataToLocalDateTime(Date date) {

        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

        return zdt;
    }
}
