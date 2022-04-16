
   
import java.util.*;
import javax.swing.*;

public class StockScreener {
    public static void main(String[] args) throws Exception {
        StockScreener screener = new StockScreener();
        screener.makeGraph();
    }
    public void makeGraph(){
        GraphView graph = new GraphView();
        
        JFrame jf = new JFrame();

        jf.setTitle("Stock Graph");
        jf.setSize(1000, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(graph); 

        ArrayList<Double> newValues = new ArrayList<>();

        //example values
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);
        newValues.add(1.0);
        newValues.add(3.0);
        newValues.add(2.0);
        newValues.add(4.0);
        newValues.add(5.0);

        graph.setTitle("TSLA Price to Book");
        graph.setYAxis("Price to Book");
        graph.setXAxis("Last 30 Days");
/* 
        //adds 30 days of values for chosen stock and metric and changes the graph title and y axis names accordingly
         Scanner sc = new Scanner(System.in);
        System.out.println("Choose metric to display:");
        System.out.println("1: Price to Earnings");
        System.out.println("2: Debt to Equity");
        System.out.println("3: Price to Growth");
        System.out.println("4: Price to Sales");
        System.out.println("5: Price to Book");
        String choice = sc.nextLine();
        if(choice.equals("1")){
            for(int i = 0; i < 30; i++){
                newValues.add(Stock.PE[i]);
                graph.setTitle(Stock + " Price to Earnings");
                graph.setYAxis("Price to Earnings");
            }
        } else if(choice.equals("2")) {
            for(int i = 0; i < 30; i++){
                newValues.add(Stock.DE[i]);
                graph.setTitle(Stock + " Debt to Equity");
                graph.setYAxis("Debt to Equity");
            }
        } else if(choice.equals("3")) {
            for(int i = 0; i < 30; i++){
                newValues.add(Stock.PG[i]);
                graph.setTitle(Stock + " Price to Growth");
                graph.setYAxis("Price to Growth");
            }
        } else if(choice.equals("4")) {
            for(int i = 0; i < 30; i++){
                newValues.add(Stock.PS[i]);
                graph.setTitle(Stock + " Price to Sales");
                graph.setYAxis("Price to Sales");
            }
        } else if(choice.equals("5")) {
            for(int i = 0; i < 30; i++){
                newValues.add(Stock.PB[i]);
                graph.setTitle(Stock + " Price to Book");
                graph.setYAxis("Price to Book");
            }
        } else {
            System.out.println("Not a valid number");
        }  */

        graph.setValues(newValues);
    }
}
