import java.util.Scanner;

class Matrix{
	int a[][] = new int[10][10];
	int row, column;
	
	Matrix(){
		System.out.print("Enter the number of rows: ");
		Scanner scrow = new Scanner(System.in);
		row = scrow.nextInt();
		System.out.print("Enter the number of columns: ");
		Scanner sccol = new Scanner(System.in);
		column = sccol.nextInt();
		System.out.println("");
	}
	
	Matrix (int m, int n){
		row = m;
		column = n;
	}
	
	void initialization(){
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				System.out.print("Enter the a["+(i+1)+"]["+(j+1)+ "] element : ");
				Scanner sc1 = new Scanner (System.in);
				a[i][j] = sc1.nextInt();
			}
		}
		System.out.println("");
	}
	
	void display() {
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("");
	}
	
	void addition(Matrix obj) {
		Matrix res = new Matrix(row, column);
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				res.a[i][j] = a[i][j] + obj.a[i][j];
			}
		}
		System.out.println("Addition of the 2 matrices is : ");
		res.display();
	}
}

public class MatrixAddition {
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.initialization();
		System.out.println("The 1st matrix is : ");
		m1.display();
		
		Matrix m2 = new Matrix();
		m2.initialization();
		System.out.println("The 2nd matrix is : ");
		m2.display();
		
		m1.addition(m2);
	}
}
