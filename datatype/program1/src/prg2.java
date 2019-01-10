import java.util.Scanner;
import java.lang.Math;
class prg2 {
	 public static void main(String[] args) {
	int a;
	int b;
	int c;
	int d=0;
	double r1;
	double r2;
	Scanner	in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c = in.nextInt();
    System.out.print("quadrant equation is=" +a+"x^2"+b+"x"+c);
    d=b*b-4*(a*c);    
    r1=(-b+Math.sqrt(d))/(2*a);
    r2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("root 1 is "+r1);
    System.out.println("root 2 is"+r2 );
}
}
 