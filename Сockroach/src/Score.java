public class Score {

    private final String name;
    private final int result;

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", result=" + result +
                "}\n";
    }

    public Score(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}