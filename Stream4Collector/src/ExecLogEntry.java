import java.util.List;
import java.util.Map;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.groupingBy;

public class ExecLogEntry {

    List<LogEntry> inputList;

    public ExecLogEntry(List<LogEntry> inputList) {
        this.inputList = inputList;
    }
    public Map<String, List<LogEntry>> numberOfInputsToPage (){
        Stream<LogEntry> logEntryStream = inputList.stream();

    return logEntryStream
            .collect(groupingBy(LogEntry::getUrl))
            ;}
    public Map<String, Map<String,List<LogEntry>>> namberInputsofUsers(){
        Stream<LogEntry> logEntryStreamofUsers = inputList.stream();


   return logEntryStreamofUsers
           .collect(groupingBy(LogEntry::getUrl,groupingBy(LogEntry::getUserName)))
           ;}

    public Map<String, Map<String,List<LogEntry>>> namberInputsofUrl(){
        Stream<LogEntry> logEntryStreamofUsers = inputList.stream();


        return logEntryStreamofUsers
                .collect(groupingBy(LogEntry::getUserName,groupingBy(LogEntry::getUrl)))

                ;}


}
