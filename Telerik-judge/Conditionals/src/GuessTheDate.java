import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;
        import java.util.Scanner;

/**
 * Created by velev on 28.1.2018 г..
 */
public class GuessTheDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        int year = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, day);
        calendar.add(Calendar.DATE, -1);

        Date date = calendar.getTime();

        DateFormat df = new SimpleDateFormat("d-M-yyyy");
        String strDate = df.format(date);
        String[] dateArray = strDate.split("-");

        System.out.println(dateArray[0] + "-" + months[Integer.parseInt(dateArray[1]) - 1] + "-" + dateArray[2]);
    }
}