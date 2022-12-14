import java. util.Scanner;
import java.text.DecimalFormat;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator");
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPer = scan.nextInt();
        System.out.print("How many people are in your group? ");
        int numPpl = scan.nextInt();
        TipCalculator tipCal = new TipCalculator(numPpl, tipPer);
        double cost = 0;
        while (!(cost == -1)) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (type -1 to end):$ ");
            cost = scan.nextDouble();
            tipCal.addMeal(cost);
        }
        tipCal.addMeal(1.00);





        DecimalFormat decFormat = new DecimalFormat("\u00a4#,##0.00");

        System.out.println("Total Bill Before Tip: " + decFormat.format(tipCal.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + tipPer);
        System.out.println("Total tip: " + decFormat.format(tipCal.tipAmount()));
        System.out.println("total Tip with Bill: " + decFormat.format(tipCal.totalBill()));
        System.out.println("Per Person cot Before tip:" + decFormat.format(tipCal.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + decFormat.format(tipCal.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + decFormat.format(tipCal.perPersonTotalCost()));

    }
}





