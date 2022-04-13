import java.util.Scanner;

public class StockDriver {

	public static void main(String[] args) {
		
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
				  "Enter number for metric: "
				  );
		  
		  answerType =metricType.nextInt();  
		  
		  if (answerType == 1) {answerTypeOutput = "PE";}
		  if (answerType == 2) {answerTypeOutput = "PS";}
		  if (answerType == 3) {answerTypeOutput = "PG";}
		  if (answerType == 4) {answerTypeOutput = "DE";}
		  if (answerType == 5) {answerTypeOutput = "PB";}
		  
		  System.out.println("Enter " + answerTypeOutput + " range (lower bound, upper bound): "); 
		  
		  answerRange = metricRange.nextLine(); 
		  
		  System.out.println("Diaplaying companies with a " + answerTypeOutput + " range of " +answerRange + "...");
		  
		  

	}

}
