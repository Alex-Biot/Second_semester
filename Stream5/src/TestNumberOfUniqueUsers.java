import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberOfUniqueUsers {

    @Test
    public void testEmptyList_ListEmpty_0() {
        List<LogEntry> logEntryList = new ArrayList<>();
        assertEquals(0, logEntryList.stream().collect(new NumberOfUniqueUsers()));
    }

    @Test
    public void testEmptyList_List1Element_1() {
        List<LogEntry> logEntryList = new ArrayList<>();
        logEntryList.add(new LogEntry("Alexey","https://github.com/sharf85"));
        assertEquals(1, logEntryList.stream().collect(new NumberOfUniqueUsers()));
    }
    @Test
    public void testEmptyList_List5Element4user_4() {
        List<LogEntry> logEntryList = new ArrayList<>();
        logEntryList.add(new LogEntry("Alexey","https://github.com/sharf85"));
        logEntryList.add(new LogEntry("Slava","https://github.com/sharf85/tasks"));
        logEntryList.add(new LogEntry("Katja","https://github.com/sharf85/tasks/tree/master/11"));
        logEntryList.add(new LogEntry("Olga","https://github.com/sharf85/tasks/tree/master/11"));
        logEntryList.add(new LogEntry("Alexey","https://github.com/sharf85/tasks/tree/master/11"));
        assertEquals(4, logEntryList.stream().collect(new NumberOfUniqueUsers()));
    }
}
