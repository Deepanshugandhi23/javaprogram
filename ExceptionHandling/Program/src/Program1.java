import java.lang.*;
class CheckArgument extends Exception{
	CheckArgument(String m){
		super(m);
	}
}
class Program1{
	public static void main(String args[]){
		try{
			if(args.length<5){
			throw new CheckArgument("Num<5");
			}
			int sum=0;
			for(int i=0;i<args.length;i++){
				sum=sum+Integer.parseInt(args[i]);
			}
			System.out.println(sum);
		}
		catch(CheckArgument e){
			System.out.println(e.getMessage());
		}
	}
}