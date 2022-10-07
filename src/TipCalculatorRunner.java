import java. util.Scanner;
import java.text.DecimalFormat;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator");
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPerc = scan.nextInt();
        System.out.print("How many people are in your group? ");
        int numPpl = scan.nextInt();
        TipCalculator tipCal = new TipCalculator(numPpl, tipPerc);

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextInt();
        for (cost != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            double cost = scan.nextInt();
        }


        DecimalFormat decFormat = new DecimalFormat("\u00a4#,##0.00");

        System.out.println("Total Bill Before Tip: " + (tipCal.getTotalBillBeforeTip());
        System.out.println(("Tip Percentage: " + (tipCal.getTipPercentage());
        System.out.println("Total tip: " + tipCal.tipAmount());
        System.out.println("Per Person cot Before tip:" + tipCal.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: " + tipCal.perPersonTipAmount());
        System.out.println("Total Cost Per Person: " + tipCal.perPersonTotalCost());


    }
}





