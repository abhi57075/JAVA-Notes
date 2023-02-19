import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Methods{
	
	void arr_sort_asc_inbuilt(Integer a[]) {
		System.out.println("\nArray is sorted in ascending order (using inbuilt method) : ");
		Arrays.sort(a);
		for (Integer x : a) {
			System.out.print(x + ", ");
		}
	}
	
	void arr_sort_desc_inbuilt(Integer a[]) {
		System.out.println();
		System.out.println("\nArray is sorted in descending order (using inbuilt method) : ");
		Arrays.sort(a,Collections.reverseOrder());
		
		for (Integer x : a) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
	
	void arr_sort_asc_user_defined(Integer a[]) {
		for (int i = 0; i<a.length; i++) {
			for (int j = i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					Integer temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		display_array(a);
	}
	
	void display_array(Integer a[]) {
		System.out.println("\nArray is sorted in ascending order (using user defined method) : ");
		for (Integer x : a) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
	
}

public class Int_sort {
	public static void main(String[] args) {
		
		int size;
		System.out.print("Enter the size for the array: ");
		Scanner sc1 = new Scanner(System.in);
		size = sc1.nextInt();
		
		System.out.println();
		Integer a[] = new Integer[size];
		for (int i = 0; i<size; i++) {
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			Scanner sc2 = new Scanner(System.in);
			a[i] = sc2.nextInt();
		}
		
		Methods obj = new Methods();
		obj.arr_sort_asc_inbuilt(a);
		obj.arr_sort_desc_inbuilt(a);
		obj.arr_sort_asc_user_defined(a);
		
	}
}
