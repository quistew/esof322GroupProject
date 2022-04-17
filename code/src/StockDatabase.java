import java.io.FileNotFoundException;

/*
The StockDatabase class is a mock database containing data for multiple stocks.
It has a single attribute, 'stocks' that is a list of Stock objects.
Written by Eli Quist.
 */
public class StockDatabase {
    // List of Stock objects, representing all the stocks in the database
    public Stock[] stocks;

    // Constructor method that creates Stock objects from artificial data and adds them to the 'stocks' array
    public StockDatabase() throws FileNotFoundException {
        // create an array of Stock objects
        stocks = new Stock[7];
        // Load in artificial data, and add to the array
        stocks[0] = new Stock("ABCD", "data/abcd.csv");
        stocks[1] = new Stock("EFGH", "data/efgh.csv");
        stocks[2] = new Stock("IJKL", "data/ijkl.csv");
        stocks[3] = new Stock("MNOP", "data/mnop.csv");
        stocks[4] = new Stock("QRST", "data/qrst.csv");
        stocks[5] = new Stock("UVWX", "data/uvwx.csv");
        stocks[6] = new Stock("YZ", "data/yz.csv");
    }

    // Returns the array of stock objects, all stocks in the stock database
    public Stock[] returnAll() {
        return stocks;
    }

    // Returns the Stock object with a given ticker symbol
    public Stock getStock(String ticker) {
        int index = 0;
        while (index < stocks.length) {
            if (stocks[index].getTicker().equals(ticker)) {
                return stocks[index];
            }
            index++;
        }
        System.out.println("No stock with ticker " + ticker + " found in the database.");
        return null;
    }
}


