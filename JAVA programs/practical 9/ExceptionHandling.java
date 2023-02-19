import java.util.Scanner;

class Exception{
	
	int arr[];
	
	Exception(int x){
		arr = new int[x];
		int index = 0;
		while (index<x) {
			arr[index] = index*2;
			index++;
		}
		display();
	}
	
	void perform(){
		try{
			int result1 = 100/arr[0];
			System.out.println("Inside try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception : "+ e1);
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("End of exception method");
	}
	
	void display() {
		System.out.print("Array elements are : ");
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}



public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.print("Enter the size for the array : ");
		Scanner sc = new Scanner(System.in);
		byte x = sc.nextByte();
		Exception obj1 = new Exception(x);
		obj1.perform();
	}
}
