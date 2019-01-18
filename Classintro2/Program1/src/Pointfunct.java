import java.until.*;
class Pointfunct{
	static Scanner in = new Scanner(System.in);
	static Point pArr[] = new Point[5];
	static int i,j;
	static Point temp = new Point();
	static doublex,y;

	static void getinput(){
		for(i=0;pArr.length;i++){
			System.out.println("Enter the Element of point "+(i+1)+" : ");
			System.out.println("Enter the value of x :");
			x=in.nextdouble();
				System.out.println("Enter the value of y :");
				y=in.nextdouble();
				pArr[i]=new Point(x,y);
		}
		for(i=0;i<pArr.length;i++){
			for(j=0;j<pArr.length;j++){
				if(pArr[j].getY()<pArr[j].getY()){
					temp=pArr[i];
					pArr[i]=pArr[j];
					parr[j]=temp;
				}
			}
		}
	} 
		static void displayElement(){
			System.out.println("Sorted array is :");
			for(i=0;i<pArr.length;i++){
				System.out.print(pArr[i].getX() + " " +pArr[i].getY());
			}
		}
		public static void main (String args[]){
			getInput();
			displayElement();
			
		}
}