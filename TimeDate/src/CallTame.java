import java.time.LocalTime;
import java.time.ZoneId;

public class CallTame {
    public static void main(String[] args) {

        WorkTime workTimeNY = new WorkTime(LocalTime.of(8, 0),
                LocalTime.of(17, 00), ZoneId.of("America/New_York"));
        WorkTime workTimeBerlin = new WorkTime(LocalTime.of(9, 0),
                LocalTime.of(18, 00), ZoneId.of("Europe/Berlin"));

        if (workTimeNY.workTimegetNewZona(workTimeNY.getBeginTime(),
                workTimeNY.getZonaWork(), workTimeBerlin.getZonaWork()).isAfter(workTimeBerlin.getEndTime())) {
            System.out.println("It is impossible to work together");
        } else if (workTimeNY.workTimegetNewZona(workTimeNY.getBeginTime(),
                workTimeNY.getZonaWork(), workTimeBerlin.getZonaWork()).isAfter(workTimeBerlin.getBeginTime()))
            System.out.print("The beginning of communication with Berlin from New York begins in: " + workTimeBerlin.getBeginTime());
        else System.out.print("The beginning of communication with Berlin from New York begins in "
                    + workTimeNY.workTimegetNewZona(workTimeNY.getBeginTime(), workTimeNY.getZonaWork(), workTimeBerlin.getZonaWork()));

        if (workTimeNY.workTimegetNewZona(workTimeNY.getEndTime(), workTimeNY.getZonaWork(), workTimeBerlin.getZonaWork()).isBefore(
                workTimeBerlin.getBeginTime())) {
            System.out.println("It is impossible to work together");
        } else if (workTimeNY.workTimegetNewZona(workTimeNY.getBeginTime(), workTimeNY.getZonaWork(), workTimeBerlin.getZonaWork()).isBefore(workTimeBerlin.getEndTime()))
            System.out.println(" and ends in: " + workTimeBerlin.workTimegetNewZona(workTimeBerlin.getEndTime(),workTimeBerlin.getZonaWork(),workTimeNY.getZonaWork()));
        else System.out.println(" and ends in: " + workTimeNY.getBeginTime());

    }


}
