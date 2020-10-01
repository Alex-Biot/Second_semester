class Vasja {
    int numberOfAttemptsX2;
    int moneyIn;
    int moneyOut;

    public Vasja(int numberOfAttemptsX2, int moneyIn, int moneyOut) {
        this.numberOfAttemptsX2 = numberOfAttemptsX2;
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }

    public int numberOfAttemptMin () {
       int i=0;

        while (!(moneyOut==moneyIn)) {
            ++i;
            if (numberOfAttemptsX2>0)
         moneyOut  = (moneyOut % 2 == 0) ? moneyOut / 2 : moneyOut - 1;
            else moneyOut=moneyOut-1;
            numberOfAttemptsX2--;

        }


        return i;
    }
}
