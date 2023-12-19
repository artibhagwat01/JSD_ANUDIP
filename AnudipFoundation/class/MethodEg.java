import java.util.Scanner;
class MethodEg{
	
	//parameterised method
	void calcEvenOdd(int num){
		if(num%2==0){
			System.out.println("Number is even ");
		}
		else{
			System.out.println("Number is odd ");
		}
	}
	
	double calcAdd(double a, double b){
		double result = a+b;
		return result;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //creating scanner object 
		System.out.println("enter number");
		int num = sc.nextInt(); //reading value from user 
		
		MethodEg obj = new MethodEg(); //class object
		obj.calcEvenOdd(num); //method invoke with object
		
		System.out.println("enter number1");
		double a = sc.nextDouble();
		
		System.out.println("enter number2");
		double b = sc.nextDouble();
		System.out.println(obj.calcAdd(a,b));
		
		
		
	}
}