import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stock {

    private final String ticker;
    private final double[] Price = new double[49];
    private final double[] PE = new double[49];
    private final double[] DE = new double[49];
    private final double[] PG = new double[49];
    private final double[] PS = new double[49];
    private final double[] PB = new double[49];

    public Stock(String ticker, String filepath) throws FileNotFoundException {
        this.ticker = ticker;

        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        int index = 0;
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            Price[index] = Double.parseDouble(line[0]);
            PE[index] = Double.parseDouble(line[1]);
            DE[index] = Double.parseDouble(line[2]);
            PG[index] = Double.parseDouble(line[3]);
            PS[index] = Double.parseDouble(line[4]);
            PB[index] = Double.parseDouble(line[5]);
            index++;
        }
    }

    public String getTicker() {
        return ticker;
    }

    public double[] getPrice() {
        return Price;
    }

    public double getAveragePrice() {
        return average(Price);
    }

    public double getMostRecentPrice() {
        return Price[Price.length - 1];
    }

    public double[] getPE() {
        return PE;
    }

    public double getAveragePE() {
        return average(PE);
    }

    public double getMostRecentPE() {
        return PE[PE.length - 1];
    }

    public double[] getDE() {
        return DE;
    }

    public double getAverageDE() {
        return average(DE);
    }

    public double getMostRecentDE() {
        return DE[DE.length - 1];
    }

    public double[] getPG() {
        return PG;
    }

    public double getAveragePG() {
        return average(PG);
    }

    public double getMostRecentPG() {
        return PG[PG.length - 1];
    }

    public double[] getPS() {
        return PS;
    }

    public double getAveragePS() {
        return average(PS);
    }

    public double getMostRecentPS() {
        return PS[PS.length - 1];
    }

    public double[] getPB() {
        return PB;
    }

    public double getAveragePB() {
        return average(PB);
    }

    public double getMostRecentPB() {
        return PB[PB.length - 1];
    }

    private double average(double[] arr) {
        double sum = 0;
        int index = 0;
        while (index < arr.length) {
            sum += arr[index];
            index++;
        }
        return Math.round((sum / arr.length)*100.0)/100.0;
    }
}
