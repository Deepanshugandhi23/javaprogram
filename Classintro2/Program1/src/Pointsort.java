import util.java.*;
classs Pointsort{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	Point pArr[] = new Point[5];
	int i,j;
	Point temp= new Point();
	double x,y;
	for(i=0;i<pArr.length;i++){
		System.out.print("Enter the Element of Point "+(i+1)+" : ");
		System.out.print("Enter the value of x :");
		x=in.nextDouble();
		System.out.print("Enter the value of y :");
		y=in.nextDouble();
		pArr[i]=new Piont(x,y);
	}
	for(i=0;i<pArr.length;i++){
		for(j=0;j<pArr.length;j++){
			if(pArr[i].getY()<pArr[j].getY()){
				temp=pArr[i];
				pArr[i]=pArr[j];
				pArr[j]=temp;
			}
		}
	}
	System.out.print("Sorted array is :");
	for(i=0;i<pArr.length;i++){
		System.out.print(pArr[i].getX() + " " +pArr[i].getY());
		}
	}	
}