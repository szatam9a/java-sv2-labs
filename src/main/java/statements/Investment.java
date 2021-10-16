package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public double getCost() {
        return cost;
    }

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
        cost = 0.3;
    }

    public int getFund() {
        return fund;
    }
    public double getYield(int days) {
        return (fund*interestRate/365*days/100);
    }
    public double close (int days){
        if (!active){
            return 0;}
        else {
            active= false;
            return ((getYield(days)+fund)-((getYield(days)+fund)*cost*0.01));
        }
    
    }
    public double closeT (int days){
        double money;
        money = active?(getYield(days)+fund)*(1-cost/100):0;
        active= false;
        return money;

    }
    public int getInterestRate() {
        return interestRate;
    }

}
