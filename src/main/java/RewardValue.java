public class RewardValue {

    double _cash;
    double _reward;

    //Constructor for reward
    public  RewardValue(int reward)  {
        double _reward = reward;
        }
        //Constructor for cash
    public  RewardValue(double cash)  {
        this._cash = cash;

    }

    //Method for getting Cash Value
    public double getCashValue() {
        return this._cash ;
    }
    //Method for getting Miles Value
    public double getMilesValue() {
        double milesValue = this._cash * .0035;
        return milesValue;
    }


    }

