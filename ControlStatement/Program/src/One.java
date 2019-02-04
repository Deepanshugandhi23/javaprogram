import java.util.*;
class One{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character");
		String a = in.next().toLowerCase();
		boolean uppercase = a.charAt(0) <=122;
		boolean vowels = a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u");
		if (a.length( )> 1){
			System.out.println("Error!.you have entered more than one character.");

		}
		else if (!(uppercase || lowercase)){
			System.out.println("Error!.you have entered a special character or a digit Enter upprrcase and lowercase letter. ");
		}
		else if (vowels){
			System.out.println("Entered letter is Vowel");
		}
		else{
			System.out.println("Entered letter is consonant ");
		}
	}
}