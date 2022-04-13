import java.util.*;

public class StockFilter {
    public Stock[] filter(Stock[] stocks, String metric, double min, double max){
        List<Stock> returnlist = new ArrayList<Stock>();

        if(metric.equals("PE")) {
            for(Stock s : stocks) {
                if(s.getAveragePE() > min && s.getAveragePE() < max) {
                    returnlist.add(s);
                }
            }
        } else if(metric.equals("DE")) {
            for(Stock s : stocks) {
                if(s.getAverageDE() > min && s.getAverageDE() < max) {
                    returnlist.add(s);
                }
            }
        } else if(metric.equals("PG")) {
            for(Stock s : stocks) {
                if(s.getAveragePG() > min && s.getAveragePG() < max) {
                    returnlist.add(s);
                }
            }
        } else if(metric.equals("PS")) {
            for(Stock s : stocks) {
                if(s.getAveragePS() > min && s.getAveragePS() < max) {
                    returnlist.add(s);
                }
            }
        } else if(metric.equals("PB")) {
            for(Stock s : stocks) {
                if(s.getAveragePB() > min && s.getAveragePB() < max) {
                    returnlist.add(s);
                }
            }
        } else if (metric.equals("Price")) {
            for (Stock s : stocks) {
                if (s.getAveragePrice() > min && s.getAveragePrice() < max) {
                    returnlist.add(s);
                }
            }
        }

        int len = returnlist.size();
        Stock[] rl = new Stock[len];

        return(returnlist.toArray(rl));
    }
}

