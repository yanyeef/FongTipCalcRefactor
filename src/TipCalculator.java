public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //constructor
    public TipCalculator (int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        this.totalBillBeforeTip = 0.0;
    }

    //getter method
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip +=cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip*tipPercentage;
    }

    public double totalBill() {
        return totalBillBeforeTip+ tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }

    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }

}
