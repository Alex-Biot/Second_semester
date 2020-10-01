import java.time.*;

public class WorkTime {
    private LocalTime beginTime;
    private LocalTime endTime;
    private ZoneId zonaWork;

    public WorkTime(LocalTime beginTime, LocalTime endTime, ZoneId zonaWork) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.zonaWork = zonaWork;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public ZoneId getZonaWork() {
        return zonaWork;
    }

    public LocalTime workTimegetNewZona(LocalTime timeInNewZona, ZoneId oldZone, ZoneId newZona) {
        LocalDate fZone = LocalDate.of(1, 1, 1);
        LocalDateTime zone = LocalDateTime.of(fZone, timeInNewZona);
        ZonedDateTime zzz = ZonedDateTime.of(zone, oldZone);
        ZonedDateTime zzz1 = zzz.withZoneSameInstant(newZona);

        return zzz1.toLocalTime();
    }
}
