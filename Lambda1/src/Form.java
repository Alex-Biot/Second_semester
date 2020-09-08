public class Form {
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    Double x;
    Double a;
    Double b;
    Double c;

    public Form( Double a, Double b, Double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }


    public    Double exec(Double x) {


        return a * x * x + b * x + c;
    }

}
