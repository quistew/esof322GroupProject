import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockDriver {

    public static void main(String[] args) throws FileNotFoundException {

        StockDatabase stockDatabase = new StockDatabase();

        Scanner metricType = new Scanner(System.in);
        Scanner metricRange = new Scanner(System.in);

        int answerType = 0;
        String answerTypeOutput = "";
        String answerRange = "";

        System.out.println(
                "1) PE" + "\n" +
                        "2) PS" + "\n" +
                        "3) PG" + "\n" +
                        "4) DE" + "\n" +
                        "5) PB" + "\n" +
                        "6) Price" + "\n" +
                        "Enter number for metric: "
        );

        answerType =metricType.nextInt();

        if (answerType == 1) {answerTypeOutput = "PE";}
        if (answerType == 2) {answerTypeOutput = "PS";}
        if (answerType == 3) {answerTypeOutput = "PG";}
        if (answerType == 4) {answerTypeOutput = "DE";}
        if (answerType == 5) {answerTypeOutput = "PB";}
        if (answerType == 6) {answerTypeOutput = "Price";}

        System.out.println("Enter " + answerTypeOutput + " range lower bound, upper bound: ");

        answerRange = metricRange.nextLine();
        double min = Double.parseDouble(answerRange.split(",")[0]);
        double max = Double.parseDouble(answerRange.split(",")[1]);

        Stock[] filteredStocks = new StockFilter().filter(stockDatabase.returnAll(), answerTypeOutput, min, max);

        System.out.println("Diaplaying companies with a " + answerTypeOutput + " range of (" +answerRange + ")...");
        StockPrinter printer = new StockPrinter(filteredStocks, answerTypeOutput);
        printer.print();
    }
}
