package consumer;

public class InsertStringOperation implements IStringOperation {
    String iOperation;


    @Override
    public String toString() {
        return "{ " +
                 iOperation + '\'' +
                '}';
    }

    public InsertStringOperation(String iOperation) {
        this.iOperation = iOperation;
    }

    @Override
    public String operate(String line) {

        switch (iOperation) {
            case ("toLowerCase"):
                line = line.toLowerCase();
                break;
            case ("toUpperCase"):
                line = line.toUpperCase();
                break;
            case ("concat"):
                line = line.concat("123456");
                break;
            case ("replace"):
                line =   line.replace('c','s');
                break;

            default:
                line = null;
        }

        return line;
    }


   /* @Override
    public String getName(String lineOp) {

        return null;
    }*/


}
