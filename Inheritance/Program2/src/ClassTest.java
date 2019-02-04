import.java.util.*;
class shape{
	void display(){
		System.out.println("Inside shape class");
	}
}
class Rectangle extends Shape{
	void display(){
		System.out.println("Inside Rectangle class");
	}
}
class Circle extends Shape{
	void display(){
		System.out.println("Inside circle class ");
	}
}
class Square extends Shape {
	void display(){
		System.out.println("Inside Square class");
	}
}
public class test{
	Shape s1[];
	char choice;
	Scanner scn = new Scanner(System.in);
	while (choice != 'q'){
		switch (choice){
			case'r' : s[i] =  new Rectangle();
						break;
			case's' : s[i] =  new Square();
						break;
			case'c' : s[i] =  new Circle();
						break;
			default : break;			
		}
		i++:;
	}
	System.out.println("your choice :");
	for(i=0;i<s.length;i++){
		if(s[i] instanceof Rectangle){
			System.out.print("choice Rectangle");
			s[i].display();
		}else if
		}
	}
} 
