import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.*;

/*
Driver class/UserInterface for our StockScreener Application.
This contains control code to interact with the user and run the app.

Written by Andrew Anselmo and Eli Quist.
 */
public class StockDriver {

    // Main method that runs the interface.
    public static void main(String[] args) throws FileNotFoundException {
        // primary control flow from user
        Scanner sc = new Scanner(System.in);
        int control;
        System.out.println("Enter 1 to search based on metrics, enter 2 to graph, and enter 0 to exit.");
        control = sc.nextInt();

        // while loop to continue running the app while user wishes
        while (control != 0) {
            // create an instance of StockDatabase (a mock database containing our stock data).
            StockDatabase stockDatabase = new StockDatabase();
            // More input objects for interacting with the user.
            Scanner metricType = new Scanner(System.in);
            Scanner metricRange = new Scanner(System.in);
            int answerType;
            String answerTypeOutput;
            String answerRange;

            // Ask user for the metric they wish to filter by or graph.
            System.out.println(
                    "1) PE" + "\n" +
                            "2) PS" + "\n" +
                            "3) PG" + "\n" +
                            "4) DE" + "\n" +
                            "5) PB" + "\n" +
                            "6) Price" + "\n" +
                            "Enter number for metric: "
            );
            answerType = metricType.nextInt();

            // Translate types to output type for displaying to user.
            if (answerType == 1) {
                answerTypeOutput = "PE";
            }
            else if (answerType == 2) {
                answerTypeOutput = "PS";
            }
            else if (answerType == 3) {
                answerTypeOutput = "PG";
            }
            else if (answerType == 4) {
                answerTypeOutput = "DE";
            }
            else if (answerType == 5) {
                answerTypeOutput = "PB";
            }
            else if (answerType == 6) {
                answerTypeOutput = "Price";
            }
            else {
                System.out.println("Invalid Answer.");
                answerTypeOutput = "";
            }

            // If user has decided to query the database, rather than graph:
            if (control == 1) {
                // Receive querying range input from user.
                System.out.println("Enter " + answerTypeOutput + " range lower bound, upper bound: ");
                answerRange = metricRange.nextLine();
                double min = Double.parseDouble(answerRange.split(",")[0]);
                double max = Double.parseDouble(answerRange.split(",")[1]);

                // Use instance of StockFilter class to filter the StockDatabase for metric in desired range
                Stock[] filteredStocks = new StockFilter().filter(stockDatabase.returnAll(), answerTypeOutput, min, max);

                // Display output to user using an instance of StockPrinter object
                System.out.println("Diaplaying companies with a " + answerTypeOutput + " range of (" + answerRange + ")...");
                StockPrinter printer = new StockPrinter(filteredStocks, answerTypeOutput);
                printer.print();
            }

            // If user has chosen to graph rather than query the database:
            if (control == 2) {
                // Ask user for ticker symbol and receive
                Scanner tickerScanner = new Scanner(System.in);
                System.out.println("Enter ticker symbol:");
                String ticker;
                ticker = tickerScanner.nextLine();

                // Grab desired ticker from database
                Stock soi = stockDatabase.getStock(ticker.strip());

                // Grab desired metric information about that stock
                double[] values;
                if (answerTypeOutput.equals("Price")) {
                    values = soi.getPrice();
                }
                else if (answerTypeOutput.equals("PE")) {
                    values = soi.getPE();
                }
                else if (answerTypeOutput.equals("PS")) {
                    values = soi.getPS();
                }
                else if (answerTypeOutput.equals("PG")) {
                    values = soi.getPG();
                }
                else if (answerTypeOutput.equals("DE")) {
                    values = soi.getDE();
                }
                else if (answerTypeOutput.equals("PB")) {
                    values = soi.getPB();
                }
                else {
                    System.out.println("Invalid answer type.");
                    values = null;
                }

                // Make Graph using an instance of the GraphView class
                GraphView graph = new GraphView();
                JFrame jf = new JFrame();
                jf.setTitle("Stock Graph");
                jf.setSize(1000, 500);
                jf.setVisible(true);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.add(graph);
                graph.setTitle("");
                graph.setYAxis(answerTypeOutput);
                graph.setXAxis("Last 30 Days");
                // Translate types:
                ArrayList<Double> newValues = new ArrayList<Double>();
                for(double d : values) newValues.add(d);
                graph.setValues(newValues);
            }

            // Ask user if they wish to continue running the app, and receive answer
            System.out.println("\nWould you like to continue? Enter 1 to continue searching, enter 2 to graph, and enter 0 to exit.");
            control = sc.nextInt();
        }
    }
}

