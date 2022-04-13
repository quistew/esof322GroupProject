import java.io.FileNotFoundException;

public class StockDatabase {

    public Stock[] stocks;

    public StockDatabase() throws FileNotFoundException {
        stocks = new Stock[7];
        stocks[0] = new Stock("ABCD", "data/abcd.csv");
        stocks[1] = new Stock("EFGH", "data/efgh.csv");
        stocks[2] = new Stock("IJKL", "data/ijkl.csv");
        stocks[3] = new Stock("MNOP", "data/mnop.csv");
        stocks[4] = new Stock("QRST", "data/qrst.csv");
        stocks[5] = new Stock("UVWX", "data/uvwx.csv");
        stocks[6] = new Stock("YZ", "data/yz.csv");
    }

    public Stock[] returnAll() {
        return stocks;
    }

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

