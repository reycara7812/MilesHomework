package makailahomework;

public class GasPrices {
    private int milesTraveled;

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }


    /*
    The priceOfGas method calculates the price of gas based on the number of miles traveled.
     The price is determined by a series of if-else statements that check the value of the milesTraveled .

     */
    public double priceOfGas() {
        if (getMilesTraveled() >= 50) {
            return 15.0;
        } else if (getMilesTraveled() >= 25) {
            return 10.0;
        } else if (getMilesTraveled() >= 15) {
            return 5.0;
        } else if (getMilesTraveled() >= 5) {
            return 2.0;
        } else {
            return 20.0;
        }
    }
}


