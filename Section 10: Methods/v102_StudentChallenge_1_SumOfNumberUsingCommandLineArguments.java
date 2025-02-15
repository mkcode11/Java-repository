public class v102_StudentChallenge_1_SumOfNumberUsingCommandLineArguments{
	public static void main(String ...args){

		double sum=0;
		for(String x:args){

			if(x.matches("[0-9\\.]+")){
				sum+=Double.parseDouble(x);
			}	
		}

		System.out.println("Sum is "+sum);
	}
}