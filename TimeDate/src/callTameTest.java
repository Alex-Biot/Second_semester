import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class callTameTest {
    // Search New York city by ID
    @Test
    public void zone() {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime time = LocalDateTime.now();
        List<String> zoneList = new ArrayList<>(allZones);
        for (String s : zoneList) {
            ZoneId zoneIdName = ZoneId.of(s);
            ZonedDateTime zdt = time.atZone(zoneIdName);
            ZoneOffset offset = zdt.getOffset();
            String nameZone = String.format("%35s %10s%n", zoneIdName, offset);
            System.out.println(nameZone);
        }

    }
}