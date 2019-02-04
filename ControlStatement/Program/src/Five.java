import java.util.*;
import java.lang.*;
class Five{
	public static void main(String args[]){
		//main progrm to compute the sum of series 
		Scanner a = new Scanner(System.in);
		int number;
		int i;
		int terms;
		int j;
		double answer=0;
		int factorial=1;
		System.out.println("Please enter the number whose sum you want to calculate");
		number = a.nextInt();
		System.out.println("Please enyer the number of terms you want");
		terms=a.nextInt();
		for(j=1;j<terms;j++){
			factorial=factorial*j;
		}
		for(i=0;i<j;i++){
			answer=answer + Math.pow(number,i)/factorial;
		}
		System.out.println("Answer is:");
		System.out.print(answer);
	}
}	