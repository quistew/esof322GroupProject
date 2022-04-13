import java.util.Scanner;

public class StockDriver {

	public static void main(String[] args) {
		
		Scanner metricType = new Scanner(System.in);  
		Scanner metricRange = new Scanner(System.in);  

		  int answerType = 0;
		  String answerTypeOutput = ""; 
		  String answerRange = "";
		  
		  System.out.println(
				  "1) P/E" + "\n" +
				  "2) P/S" + "\n" +
				  "3) PEG" + "\n" +
				  "4) D/E" + "\n" +
				  "5) P/B" + "\n" +
				  "Enter number for metric: "
				  );
		  
		  answerType =metricType.nextInt();  
		  
		  if (answerType == 1) {answerTypeOutput = "P/E";}
		  if (answerType == 2) {answerTypeOutput = "P/S";}
		  if (answerType == 3) {answerTypeOutput = "PEG";}
		  if (answerType == 4) {answerTypeOutput = "D/E";}
		  if (answerType == 5) {answerTypeOutput = "P/B";}
		  
		  System.out.println("Enter " + answerTypeOutput + " range (lower bound, upper bound): "); 
		  
		  answerRange = metricRange.nextLine(); 
		  
		  System.out.println("Diaplaying companies with a " + answerTypeOutput + " range of " +answerRange + "...");
		  
		  

	}

}
