package BasicCorePrograms;

public class FlipCoinPer1 {

	public static void main(String[] args) {
		int flipNumber = 10;
		int heads = 0, tails = 0;
		for (int i = 0; i < flipNumber; i++) {
			if(Math.random() < 0.5) {
				tails++;
			}
			heads++;
		}
		double percentageOfTails = (tails*100)/flipNumber;
		double percentageOfHeads = 100-percentageOfTails ;
		System.out.println("Percentage of Tails is : " + percentageOfTails + "%");
		System.out.println("Percentage of Heads is : " + percentageOfHeads + "%");
	}

}
