public class RewardValue {

    private final double cashValue;

    //Constructor for reward
    public  RewardValue(double cashValue)  {
        this.cashValue = cashValue;
        }
        //Constructor for cash
    public  RewardValue(int milesValue)  {
        this.cashValue = convertToCash(milesValue);

    }

    private static int convertToMiles(double cashValue){
        return (int) (cashValue/ 0.0035);
    }
    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }




    }

