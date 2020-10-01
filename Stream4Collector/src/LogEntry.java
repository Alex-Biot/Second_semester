public class LogEntry {
    public String getUserName() {
        return userName;
    }

    public String getUrl() {
        return url;
    }

    String userName;
    String url;

    private LogEntry(String userName, String url) {
        this.userName = userName;
        this.url = url;
    }

}
