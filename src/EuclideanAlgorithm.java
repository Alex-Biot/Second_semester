public class EuclideanAlgorithm {
    int d;

    public void euclideanAlg(int a, int b) {
        int c;
        if (a == b) {
            setD(a);
        } else if (a > b) {
            c = a - b;
            euclideanAlg(b, c);
        } else {
            c = b - a;
            euclideanAlg(a, c);
        }
    }

    public int getD(int a, int b) {
        euclideanAlg(a, b);
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
