public class Account {
    String iD;

    @Override
    public String toString() {
        return "Account{" +
                "iD='" + iD + '\'' +
                ", isLocked=" + isLocked +
                ", balansce=" + balansce +
                '}';
    }

    boolean isLocked;

    public Account(String iD, boolean isLocked, Long balansce) {
        this.iD = iD;
        this.isLocked = isLocked;
        this.balansce = balansce;
    }

    Long balansce;

    public Long getBalansce() {
        return balansce;
    }

    public boolean isLocked() {
        return false;
    }

    public String getiD() {
        return iD;
    }





}

