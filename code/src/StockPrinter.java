/*
The StockPrinter class is used for formatting the output of metric data for a list of Stock objects.
Written by Eli Quist.
 */
public class StockPrinter {
    // A list of stocks to be printed
    Stock[] stocks;
    // The metric of interest to be printed
    String metric;

    // Constructor method that sets the list of stocks and metric of interest
    public StockPrinter(Stock[] stocks, String metric) {
        this.stocks = stocks;
        this.metric = metric;
    }

    // Method for printing the Average and Most recent values of the inputted metric.
    public void print() {
        for (Stock s: stocks ) {

            System.out.println("\n" + s.getTicker() + ":");
            if (metric.equals("Price")) {
                System.out.println("Average price: " + s.getAveragePrice());
                System.out.println("Recent price: " + s.getMostRecentPrice());
            }
            else if (metric.equals("PE")) {
                System.out.println("Average PE: " + s.getAveragePE());
                System.out.println("Recent PE: " + s.getMostRecentPE());
            }
            else if (metric.equals("DE")) {
                System.out.println("Average DE: " + s.getAverageDE());
                System.out.println("Recent DE: " + s.getMostRecentDE());
            }
            else if (metric.equals("PG")) {
                System.out.println("Average PG: " + s.getAveragePG());
                System.out.println("Recent PG: " + s.getMostRecentPG());
            }
            else if (metric.equals("PS")) {
                System.out.println("Average PS: " + s.getAveragePS());
                System.out.println("Recent PS: " + s.getMostRecentPS());
            }
            else if (metric.equals("PB")) {
                System.out.println("Average PB: " + s.getAveragePB());
                System.out.println("Recent PB: " + s.getMostRecentPB());
            }
            else {
                System.out.println("Invalid metric.");
            }
        }
    }
}

